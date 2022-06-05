package ru.sangalov.exchangerates.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.sangalov.exchangerates.entity.Rate;
import ru.sangalov.exchangerates.entity.Rates;
import ru.sangalov.exchangerates.entity.ResponseData;
import ru.sangalov.exchangerates.service.ExchangeRatesService;
import ru.sangalov.exchangerates.service.GiphyService;

import java.util.List;

@Controller
public class MainController {
	
	@Autowired
	private ExchangeRatesService exchangeRateService;
	
	@Autowired
	private GiphyService giphyService;
	
	public String DownsizedMediumUrl;
	
	
	public ResponseData responseData = new ResponseData();
	
	public String currencySelected;
	public String currencyBase;
	public String dateToday;
	public String dateYesterday;
	public Double latestRateSelected;
	public Double historicalRateSelected;
	public String tagName;
	public String latestRateResponse;
	public String ratesErrorResponse;
	public String giphyResponse;
	public String gifErrorResponse;
	
	
	@GetMapping("")
	public String viewHomePage(Model model, ResponseData responseData) throws JsonProcessingException {
		
		Rate currency = new Rate();
		currency.setCurrency("RUB");
		model.addAttribute("currency", currency);
		
		Rates rates = new Rates();
		List<String> currencies = exchangeRateService.getCurrenciesNames(rates);

		model.addAttribute("currencies", currencies);
		model.addAttribute("DownsizedMediumUrl", DownsizedMediumUrl);
		
		model.addAttribute("currencySelected", currencySelected);
		model.addAttribute("currencyBase", currencyBase);
		model.addAttribute("dateToday", dateToday);
		model.addAttribute("dateYesterday", dateYesterday);
		model.addAttribute("latestRateSelected", latestRateSelected);
		model.addAttribute("historicalRateSelected", historicalRateSelected);
		model.addAttribute("tagName", tagName);
		model.addAttribute("latestRateResponse", latestRateResponse);
		model.addAttribute("ratesErrorResponse", ratesErrorResponse);
		model.addAttribute("giphyResponse", giphyResponse);
		model.addAttribute("gifErrorResponse", gifErrorResponse);

		return "index";
	}
	
	

	   @PostMapping("/findAllRates")
		public String getAllRates(@ModelAttribute Rate rate, Model model, ResponseData responseData) throws JsonProcessingException {
		   
		   List<String> currencies = exchangeRateService.getAllRates(rate, model, responseData);
		   
		   
		   // System.out.println("Number of currencies = " + currencies.size());
	       // currencies.forEach(e -> System.out.printf("Currency: %s\n", e));
		   
		   tagName = responseData.getTagName();
		   DownsizedMediumUrl = giphyService.getGifUrl(tagName, model, responseData);
		   
		   currencySelected = responseData.getCurrencySelected();
		   currencyBase = responseData.getCurrencyBase();
		   dateToday = responseData.getLocalDateNow();
		   dateYesterday = responseData.getLocalDateYesterday();
		   latestRateSelected = responseData.getLatestRateSelected();
		   historicalRateSelected = responseData.getHistoricalRateSelected();
		   latestRateResponse = responseData.getLatestRateResponse();
		   ratesErrorResponse = responseData.getRatesErrorResponse();
		   giphyResponse = responseData.getGiphyResponse();
		   gifErrorResponse = responseData.getGifErrorResponse();

		   return "redirect:/";
	   }

}
