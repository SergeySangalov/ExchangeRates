package ru.sangalov.exchangerates.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import ru.sangalov.exchangerates.entity.ExchangeRatesCurrentResponse;


//Клиент для обращения к серверу "https://openexchangerates.org" для получения курсов валют
@FeignClient(url="${openexchangerates.url.general}", name="USER-CLIENT")
public interface UserClient {
	
	// Последний (сегодняшний) курс валют
	@GetMapping("/latest.json")
	public ExchangeRatesCurrentResponse getLatestRates(@RequestParam("app_id") String appId,
														@RequestParam("base") String base);
	
	// Исторический (вчерашний) курс валют
	@GetMapping("/historical/{date}.json")
	public ExchangeRatesCurrentResponse getHistoricalRates(@PathVariable String date,
															@RequestParam("app_id") String appId,
															@RequestParam("base") String base);

}
