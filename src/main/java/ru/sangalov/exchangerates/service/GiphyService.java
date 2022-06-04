package ru.sangalov.exchangerates.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import ru.sangalov.exchangerates.client.GiphyClient;
import ru.sangalov.exchangerates.entity.GiphyCurrentResponse;

@Service
@EnableFeignClients
public class GiphyService {
	
	@Value("${giphy.api.key}")
	private String giphyAppId;
		
	private String ratingCode = "g";
	
	@Autowired
	private GiphyClient giphyClient;
	
	public String getGifUrl(String tagName, Model model) {
		
		GiphyCurrentResponse giphyResponse = giphyClient.getRandomGif(giphyAppId, tagName, ratingCode);
		
		String giphyTitle = giphyResponse.getData().getTitle();
        System.out.println("Image Title: " + giphyTitle);
        
        String DownsizedMediumUrl = giphyResponse.getData().getImages().getDownsizedMedium().getUrl();
        System.out.println("Image Url: " + DownsizedMediumUrl);
        
        model.addAttribute("DownsizedMediumUrl", DownsizedMediumUrl);
        return DownsizedMediumUrl;
	}

}
