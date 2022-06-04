package ru.sangalov.exchangerates.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.core.JsonProcessingException;

import ru.sangalov.exchangerates.entity.Rate;
import ru.sangalov.exchangerates.entity.ResponseData;
import ru.sangalov.exchangerates.service.ExchangeRatesService;
import ru.sangalov.exchangerates.service.GiphyService;

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
	
	
	@GetMapping("")
	public String viewHomePage(Model model, ResponseData responseData) throws JsonProcessingException {
		
		Rate currency = new Rate();
		currency.setCurrency("RUB");
		model.addAttribute("currency", currency);
		
		List<String> currencies = exchangeRateService.getAllRatesNames(currency, model);
		model.addAttribute("currencies", currencies);
		
		model.addAttribute("DownsizedMediumUrl", DownsizedMediumUrl);
		
		model.addAttribute("currencySelected", currencySelected);
		model.addAttribute("currencyBase", currencyBase);
		model.addAttribute("dateToday", dateToday);
		model.addAttribute("dateYesterday", dateYesterday);
		model.addAttribute("latestRateSelected", latestRateSelected);
		model.addAttribute("historicalRateSelected", historicalRateSelected);
		model.addAttribute("tagName", tagName);
		
		return "index";
	}
	
	

	   @PostMapping("/findAllRates")
		public String getAllRates(@ModelAttribute Rate rate, Model model, ResponseData responseData) throws JsonProcessingException {
		   
		   List<String> currencies = exchangeRateService.getAllRates(rate, model, responseData);
		   
		   // System.out.println("Number of currencies = " + currencies.size());
	       // currencies.forEach(e -> System.out.printf("Currency: %s\n", e));
		   
		   tagName = responseData.getTagName();
		   DownsizedMediumUrl = giphyService.getGifUrl(tagName, model);
		   
		   currencySelected = responseData.getCurrencySelected();
		   currencyBase = responseData.getCurrencyBase();
		   dateToday = responseData.getLocalDateNow();
		   dateYesterday = responseData.getLocalDateYesterday();
		   latestRateSelected = responseData.getLatestRateSelected();
		   historicalRateSelected = responseData.getHistoricalRateSelected();
		   	   
		   return "redirect:/";
	   }

}
