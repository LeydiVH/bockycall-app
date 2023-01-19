package com.spring.catalogueservice.models;

public class SocialNetwork {
	private double price;
	private String socialNetworksName;
	private int expiration;
	private int catalogueId;
	private String image;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSocialNetworksName() {
		return socialNetworksName;
	}
	public void setSocialNetworksName(String socialNetworksName) {
		this.socialNetworksName = socialNetworksName;
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
