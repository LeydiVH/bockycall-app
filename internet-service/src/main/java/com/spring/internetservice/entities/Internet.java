package com.spring.internetservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "internet")
public class Internet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double price;
	private double internetQuantity;
	private int expiration;
	private int catalogueId;
	private String image;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
