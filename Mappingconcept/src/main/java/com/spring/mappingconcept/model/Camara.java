package com.spring.mappingconcept.model;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Camara {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cam_id")
	private int sno;
	private String cameraname;
	private int  resolution;
	private String sensorname;
	private int nightvision;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_add_id")
	private Additionalmodel additionalmodel;
	
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getCameraname() {
		return cameraname;
	}
	public void setCameraname(String cameraname) {
		this.cameraname = cameraname;
	}
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public String getSensorname() {
		return sensorname;
	}
	public void setSensorname(String sensorname) {
		this.sensorname = sensorname;
	}
	public int getNightvision() {
		return nightvision;
	}
	public void setNightvision(int nightvision) {
		this.nightvision = nightvision;
	}
	public Additionalmodel getAdditionalmodel() {
		return additionalmodel;
	}
	public void setAdditionalmodel(Additionalmodel additionalmodel) {
		this.additionalmodel = additionalmodel;
	}
}
