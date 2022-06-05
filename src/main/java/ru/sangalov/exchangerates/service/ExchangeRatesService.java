package ru.sangalov.exchangerates.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.sangalov.exchangerates.client.UserClient;
import ru.sangalov.exchangerates.entity.ExchangeRatesCurrentResponse;
import ru.sangalov.exchangerates.entity.Rate;
import ru.sangalov.exchangerates.entity.Rates;
import ru.sangalov.exchangerates.entity.ResponseData;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@EnableFeignClients
public class ExchangeRatesService {
	
	private final ObjectMapper mapper;
	
	@Autowired
	private UserClient exchangeRatesClient;
	
	@Value("${openexchangerates.api.key}")
	private String appId;
	
	@Value("${openexchangerates.api.base}")
	private String currencyBase;
	
	@Value("${giphy.rich}")
	private String tagRich;
	
	@Value("${giphy.broke}")
	private String tagBroke;
	
	private String tagName;
	
    public ExchangeRatesService(ObjectMapper mapper) {
        this.mapper = mapper;
    }
	
	public List<String> getAllRates(@ModelAttribute Rate rate, Model model, ResponseData responseData) throws JsonProcessingException {
		
			// Исходные данные по валюте
    		String currencySelected = rate.getCurrency();
    		System.out.println("currencySelected = " + currencySelected);
    		System.out.println("currencyBase = " + currencyBase);
    		
    		Rates latestRates = new Rates();
    		// Получение текущего (сегодняшнего) списка курсов валют
    		try {
    			System.out.println("Request latestRatesResponse started...");
    			ExchangeRatesCurrentResponse latestRatesResponse = exchangeRatesClient.getLatestRates(appId, currencyBase);
    			latestRates = latestRatesResponse.getRates();
    			responseData.setLatestRateResponse("true");
    			responseData.setRatesErrorResponse("");
    			System.out.println("Request latestRatesResponse completed successfully.");
    		}
    		catch (Exception e) {
    			System.out.println("Request latestRatesResponse ERROR: " + e.getMessage());
    			List<String> currencies = getCurrenciesNames(latestRates);
    			responseData.setLatestRateResponse("false");
    			responseData.setRatesErrorResponse(e.getMessage());
    			return currencies;
    		}
    		finally {
    		}
			
			// Получение исторического (вчерашнего) списка курсов валют
			ExchangeRatesCurrentResponse historicalRatesResponse = exchangeRatesClient.getHistoricalRates(getYesterdayDate(), appId, currencyBase);
			Rates historicalRates = historicalRatesResponse.getRates();
			
			// Вызов функции получения списка названий валют из свойств экземпляра объекта
			List<String> currencies = getCurrenciesNames(latestRates);
			
			// Формирование маппинга для получения текущего (сегодняшнего) курса валюты по её названию
			Map latestRatesMap = getCurrenciesMap(latestRates);
			System.out.println("latesRates = " + mapper.writeValueAsString(latestRates));
			System.out.println("latestRatesMap.size = " + latestRatesMap.size());
	        System.out.println("latestRatesMap.get('" + currencySelected +"') = " + latestRatesMap.get(currencySelected));
	        System.out.println("latestRatesMap.get('" + currencyBase + "') = " + latestRatesMap.get(currencyBase));
	        
	     // Формирование маппинга для получения исторического (вчерашнего) курса валюты по её названию
			Map historicalRatesMap = getCurrenciesMap(historicalRates);
			System.out.println("historicalRates = " + mapper.writeValueAsString(historicalRates));
			System.out.println("historicalRatesMap.size = " + historicalRatesMap.size());
	        System.out.println("historicalRatesMap.get('" + currencySelected +"') = " + historicalRatesMap.get(currencySelected));
	        System.out.println("historicalRatesMap.get('" + currencyBase + "') = " + historicalRatesMap.get(currencyBase));
	        
	        // Переход к числовому типу курсов валют
	        Double latestRateSelected = (Double) latestRatesMap.get(currencySelected);
	        Double latestRateBase = (Double) latestRatesMap.get(currencyBase);
	        
	        Double historicalRateSelected = (Double) historicalRatesMap.get(currencySelected);
	        Double historicalRateBase = (Double) historicalRatesMap.get(currencyBase);
	        
	        // Принятие решения откуда получать gif-файл
			if (latestRateSelected > historicalRateSelected) {
				// Курс увеличился --> человек стал беднее (broke)
				System.out.println("Course higher --> user broke");
				System.out.println("Will get gif-file from 'https://api.giphy.com/v1/gifs/random/broke'");
				tagName = tagBroke;
			}
			else {
				// Курс уменьшился или остался прежним --> человек стал богаче (rich)
				System.out.println("Course lower --> user rich");
				System.out.println("Will get gif-file from 'https://api.giphy.com/v1/gifs/random/rich'");
				tagName = tagRich;
			}
			
			// Сохранение полученных значений для дальнейшего отображения их на экране пользователю
    		responseData.setCurrencySelected(currencySelected);
    		responseData.setCurrencyBase(currencyBase);
    		responseData.setLocalDateNow(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    		responseData.setLocalDateYesterday(LocalDate.now().minusDays(1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    		responseData.setLatestRateSelected(latestRateSelected);
    		responseData.setHistoricalRateSelected(historicalRateSelected);
    		responseData.setTagName(tagName);
						
		   return currencies;
	}
	
	// Описание функции получения вчерашней даты в требуемом формате
	public String getYesterdayDate() {
		
		LocalDate localDateNow = LocalDate.now();
		String dateToday = localDateNow.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Today data: " + dateToday);
		
		LocalDate localDateYesterday = localDateNow.minusDays(1);
		String dateYesterday = localDateYesterday.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("Yesterday data: " + dateYesterday);
		
		dateYesterday = localDateYesterday.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.println("Yesterday data for send to exchangerates: " + dateYesterday);
		
		return dateYesterday;
	}
	
	// Описание функции получения списка названий валют из свойств экземпляра объекта
	public List<String> getCurrenciesNames(Rates latestRates) {
		
		String currency;
		List<String> currencies = new ArrayList<>();
		
		Class<? extends Rates> clazz = latestRates.getClass();

        // Get all object fields including public, protected, package and private access fields.
        Field[] fields = clazz.getDeclaredFields();
        // System.out.println("Number of fields = " + (fields.length - 1));
        for (Field field : fields) {
            if (field.getName() != "additionalProperties") {
            	currency = field.getName().toUpperCase().replace("_", "");
            	currencies.add(currency);
            	// System.out.println("Currency name = " + currency);
            }
            // System.out.println("Field type = " + field.getType().getName());
        }
        
        // System.out.println("Number of currencies = " + currencies.size());
        // currencies.forEach(e -> System.out.printf("Currency: %s\n", e));
        
        return currencies;
	}
	
	// Описание функции получения Map для получения значения курса валюты по названию валюты
	public Map getCurrenciesMap(Rates latestRates) throws JsonProcessingException {
		
        // System.out.println("latesRates = " + mapper.writeValueAsString(latestRates));
        
        Gson gson = new Gson();
        String jsonString =  mapper.writeValueAsString(latestRates);
        Map latestRatesMap = gson.fromJson(jsonString, Map.class);
        
        return latestRatesMap;
	}

}
	

