package com.spring.mappingconcept1.Model;

import jakarta.persistence.Entity;


@Entity
public class Watch {
	private int Id;
	private String Wname;
	private int price;
	private String wType;
	public String getWname() {
		return Wname;
	}
	public void setWname(String wname) {
		Wname = wname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getwType() {
		return wType;
	}
	public void setwType(String wType) {
		this.wType = wType;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "Watch [Id=" + Id + ", Wname=" + Wname + ", price=" + price + ", wType=" + wType + "]";
	}

}
