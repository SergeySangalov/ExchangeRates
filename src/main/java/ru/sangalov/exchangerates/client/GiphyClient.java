package ru.sangalov.exchangerates.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ru.sangalov.exchangerates.entity.GiphyCurrentResponse;


// Клиент для обращения к серверу "https://api.giphy.com" для получения gif-файла
@FeignClient(url="${giphy.url.general}", name="GIPHY-CLIENT")
public interface GiphyClient {
	
	// Получение gif-файла из папки "random", с тегом "rich" или "broke"
	@GetMapping("/random")
	public GiphyCurrentResponse getRandomGif(@RequestParam("api_key") String giphyAppId,
											 @RequestParam("tag") String tagName, 
											 @RequestParam("rating") String ratingCode);

}
