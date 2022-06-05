package ru.sangalov.exchangerates.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import ru.sangalov.exchangerates.client.GiphyClient;
import ru.sangalov.exchangerates.entity.GiphyCurrentResponse;
import ru.sangalov.exchangerates.entity.ResponseData;

@Service
@EnableFeignClients
public class GiphyService {
	
	@Value("${giphy.api.key}")
	private String giphyAppId;
		
	private String ratingCode = "g";
	
	@Autowired
	private GiphyClient giphyClient;
	
	public String getGifUrl(String tagName, Model model, ResponseData responseData) {
		
		GiphyCurrentResponse giphyResponse = new GiphyCurrentResponse();
		
		// Получение gif-файла
		try {
			System.out.println("Request giphyResponse started...");
			giphyResponse = giphyClient.getRandomGif(giphyAppId, tagName, ratingCode);
			responseData.setGiphyResponse("true");
			responseData.setGifErrorResponse("");
			System.out.println("Request giphyResponse completed successfully.");
			
			String giphyTitle = giphyResponse.getData().getTitle();
	        System.out.println("Image Title: " + giphyTitle);
	        
	        String DownsizedMediumUrl = giphyResponse.getData().getImages().getDownsizedMedium().getUrl();
	        System.out.println("Image Url: " + DownsizedMediumUrl);
	        
	        model.addAttribute("DownsizedMediumUrl", DownsizedMediumUrl);
	        return DownsizedMediumUrl;
		}
		catch (Exception e) {
			System.out.println("Request giphyResponse ERROR: " + e.getMessage());
			String DownsizedMediumUrl = "";
			model.addAttribute("DownsizedMediumUrl", DownsizedMediumUrl);
			responseData.setGiphyResponse("false");
			responseData.setGifErrorResponse(e.getMessage());
			return DownsizedMediumUrl;
		}
		finally {
			
		}
			
	}

}
