package com.spring.catalogueservice.models;

public class Internet {
	private double price;
	private double internetQuantity;
	private int expiration;
	private int catalogueId;
	private String image;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getInternetQuantity() {
		return internetQuantity;
	}
	public void setInternetQuantity(double internetQuantity) {
		this.internetQuantity = internetQuantity;
	}
	public int getExpiration() {
		return expiration;
	}
	public void setExpiration(int expiration) {
		this.expiration = expiration;
	}
	public int getCatalogueId() {
		return catalogueId;
	}
	public void setCatalogueId(int catalogueId) {
		this.catalogueId = catalogueId;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
