package ru.sangalov.exchangerates.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ru.sangalov.exchangerates.entity.Rates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
public class ExchangeRatesServiceTests {
	
	@InjectMocks
	private ExchangeRatesService service;
	
	
	// Тестирование функции получения вчерашней даты
	@Test
	public void testGetYesterdayDateInRequiredFormat() {
		
		// От текущей даты надо осчитать 1 день, чтобы получить вчерашнюю дату
		Integer daysAgo = 1;
		
		String dateYesterdayInRequiredFormat = LocalDate.now().minusDays(daysAgo).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
				
		String result = service.getYesterdayDate();
		
		// Полученная дата является вчерашней и выдана в нужном формате
		Assertions.assertEquals(result, dateYesterdayInRequiredFormat);
	}
	
	
	// Тестирование функции получения из свойств экземпляра объекта списка названий валют
	@Test
	public void testGetListCurrenciesNamesFromObject() {
		
		Rates rates = new Rates();
		
		List<String> currencies = service.getCurrenciesNames(rates);
		
		// System.out.println("Number of currencies = " + currencies.size());
	    // currencies.forEach(e -> System.out.printf("Currency: %s\n", e));
	    
	    // Получен список названий валют
	    Assertions.assertNotNull(currencies);
		
	}
	
}
