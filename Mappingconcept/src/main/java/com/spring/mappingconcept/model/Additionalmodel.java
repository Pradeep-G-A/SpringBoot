package com.spring.mappingconcept.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Additionalmodel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "add-id")
	private int aditionalmodel;
	private int price;
	private int shutterspeed;
	private int lens;
	public int getAditionalmodel() {
		return aditionalmodel;
	}
	public void setAditionalmodel(int aditionalmodel) {
		this.aditionalmodel = aditionalmodel;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getShutterspeed() {
		return shutterspeed;
	}
	public void setShutterspeed(int shutterspeed) {
		this.shutterspeed = shutterspeed;
	}
	public int getLens() {
		return lens;
	}
	public void setLens(int lens) {
		this.lens = lens;
	}

	
}
