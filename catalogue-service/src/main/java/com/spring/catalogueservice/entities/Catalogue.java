package com.spring.catalogueservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "catalogue")
public class Catalogue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String catalogue_name;
	private String description;
	private String icon;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCatalogueName() {
		return catalogue_name;
	}
	public void setCatalogueName(String catalogueName) {
		this.catalogue_name = catalogueName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
		
}
