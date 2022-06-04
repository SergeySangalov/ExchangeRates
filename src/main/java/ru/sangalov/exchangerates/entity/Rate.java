package ru.sangalov.exchangerates.entity;

public class Rate {
	
	private String currency;
	

	public Rate() {
	}

	public Rate(String currency) {
		this.currency = currency;
	}

	
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}
