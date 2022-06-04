package ru.sangalov.exchangerates.controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.ui.Model;
import ru.sangalov.exchangerates.entity.Rate;
import ru.sangalov.exchangerates.entity.ResponseData;
import ru.sangalov.exchangerates.service.ExchangeRatesService;
import ru.sangalov.exchangerates.service.GiphyService;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MainController.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainControllerTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ExchangeRatesService exchangeRateService;
	
	@MockBean
	private GiphyService giphyService;
	
	@MockBean
	private Model model;
	
	@MockBean
	private ResponseData responseData;
	
	// Тестирование обработки корневой ссылки "/" для отображения основной страницы
	@Test
	@Order(1)
	public void testGetMainPage() throws Exception {
		
		Rate currency = new Rate();
		currency.setCurrency("RUB");
		model.addAttribute("currency", currency);
		
		List<String> currencies = new ArrayList<>();
		currencies.add("USD");
		currencies.add("RUB");
		currencies.add("GBP");
		
		Mockito.when(exchangeRateService.getAllRatesNames(currency, model)).thenReturn(currencies);
		
		String url = "/";
		mockMvc.perform(get(url)).andExpect(status().isOk());
	}
	
	// Тестирование обработки ссылки "/findAllRates" и последующего перенаправления на основную страницу
	@Test
	@Order(2)
	public void testGetResultPage() throws Exception {
		
		Rate currency = new Rate();
		currency.setCurrency("RUB");
		model.addAttribute("currency", currency);
		
		List<String> currencies = new ArrayList<>();
		currencies.add("USD");
		currencies.add("RUB");
		currencies.add("GBP");
		
		Mockito.when(exchangeRateService.getAllRates(currency, model, responseData)).thenReturn(currencies);
		
		String tagName = "rich";
		String DownsizedMediumUrl = "https://media4.giphy.com/media/9nekQ7djpoLF6Ci1n9/giphy.gif?cid=d78eb070a0a7cfdaa57df879b5ea9eaeb9658eed2f3c4ab2&rid=giphy.gif&ct=g";
				
		Mockito.when(giphyService.getGifUrl(tagName, model)).thenReturn(DownsizedMediumUrl);
		
		
		String url = "/findAllRates";
		mockMvc.perform(post(url)).andExpect(status().is3xxRedirection());
	}

}
