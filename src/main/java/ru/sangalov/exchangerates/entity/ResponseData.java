package ru.sangalov.exchangerates.entity;

public class ResponseData {
	
	String localDateNow;
	
	String localDateYesterday;
	
	private String currencySelected;
	
	private String currencyBase;
	
	private Double latestRateSelected;
	
	private Double latestRateBase;
	
	private Double historicalRateSelected;
	
	private Double historicalRateBase;
	
	private String tagName;
	
	
	public ResponseData() {
	}

	public ResponseData(String localDateNow, String localDateYesterday, String currencySelected, String currencyBase,
			Double latestRateSelected, Double latestRateBase, Double historicalRateSelected, Double historicalRateBase,
			String tagName) {
		this.localDateNow = localDateNow;
		this.localDateYesterday = localDateYesterday;
		this.currencySelected = currencySelected;
		this.currencyBase = currencyBase;
		this.latestRateSelected = latestRateSelected;
		this.latestRateBase = latestRateBase;
		this.historicalRateSelected = historicalRateSelected;
		this.historicalRateBase = historicalRateBase;
		this.tagName = tagName;
	}

	public String getLocalDateNow() {
		return localDateNow;
	}

	public void setLocalDateNow(String localDateNow) {
		this.localDateNow = localDateNow;
	}

	public String getLocalDateYesterday() {
		return localDateYesterday;
	}

	public void setLocalDateYesterday(String localDateYesterday) {
		this.localDateYesterday = localDateYesterday;
	}

	public String getCurrencySelected() {
		return currencySelected;
	}

	public void setCurrencySelected(String currencySelected) {
		this.currencySelected = currencySelected;
	}

	public String getCurrencyBase() {
		return currencyBase;
	}

	public void setCurrencyBase(String currencyBase) {
		this.currencyBase = currencyBase;
	}

	public Double getLatestRateSelected() {
		return latestRateSelected;
	}

	public void setLatestRateSelected(Double latestRateSelected) {
		this.latestRateSelected = latestRateSelected;
	}

	public Double getLatestRateBase() {
		return latestRateBase;
	}

	public void setLatestRateBase(Double latestRateBase) {
		this.latestRateBase = latestRateBase;
	}

	public Double getHistoricalRateSelected() {
		return historicalRateSelected;
	}

	public void setHistoricalRateSelected(Double historicalRateSelected) {
		this.historicalRateSelected = historicalRateSelected;
	}

	public Double getHistoricalRateBase() {
		return historicalRateBase;
	}

	public void setHistoricalRateBase(Double historicalRateBase) {
		this.historicalRateBase = historicalRateBase;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	
}
