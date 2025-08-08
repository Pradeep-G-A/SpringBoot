package com.spring.plants.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "plant")
public class Plant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String plant;
	private String biological;
	private String classification;
	private String origin;
	private String roottype;
	private String familytype;
	private float height;
	private int rateofgrowth;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlant() {
		return plant;
	}
	public void setPlant(String plant) {
		this.plant = plant;
	}
	public String getBiological() {
		return biological;
	}
	public void setBiological(String biological) {
		this.biological = biological;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getRoottype() {
		return roottype;
	}
	public void setRoottype(String roottype) {
		this.roottype = roottype;
	}
	public String getFamilytype() {
		return familytype;
	}
	public void setFamilytype(String familytype) {
		this.familytype = familytype;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public int getRateofgrowth() {
		return rateofgrowth;
	}
	public void setRateofgrowth(int rateofgrowth) {
		this.rateofgrowth = rateofgrowth;
	}
	@Override
	public String toString() {
		return "Plant [id=" + id + ", plant=" + plant + ", biological=" + biological + ", classification="
				+ classification + ", origin=" + origin + ", roottype=" + roottype + ", familytype=" + familytype
				+ ", height=" + height + ", rateofgrowth=" + rateofgrowth + "]";
	}
	

	
	
}
