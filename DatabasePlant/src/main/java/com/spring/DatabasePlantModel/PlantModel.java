package com.spring.DatabasePlantModel;



import jakarta.persistence.*;

@Entity
@Table(name = "DatabaseForPlants")
public class PlantModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String commonName;
    private String scientificName;
    private String family;  
    private String type;
    private String plantCategory;
    private String heightRange;
    private String sunlightRequirement;
    private String waterRequirement;
    private String soilType;
    private String temperatureRange;
    private String humidityLevel;
    private String propagationMethod;
    private String medicinalUses;
    private String toxicity;
    private String plantImageURL;
    
    
 // Getters and Setters
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCommonName() {
		return commonName;
	}
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	public String getScientificName() {
		return scientificName;
	}
	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPlantCategory() {
		return plantCategory;
	}
	public void setPlantCategory(String plantCategory) {
		this.plantCategory = plantCategory;
	}
	public String getHeightRange() {
		return heightRange;
	}
	public void setHeightRange(String heightRange) {
		this.heightRange = heightRange;
	}
	public String getSunlightRequirement() {
		return sunlightRequirement;
	}
	public void setSunlightRequirement(String sunlightRequirement) {
		this.sunlightRequirement = sunlightRequirement;
	}
	public String getWaterRequirement() {
		return waterRequirement;
	}
	public void setWaterRequirement(String waterRequirement) {
		this.waterRequirement = waterRequirement;
	}
	public String getSoilType() {
		return soilType;
	}
	public void setSoilType(String soilType) {
		this.soilType = soilType;
	}
	public String getTemperatureRange() {
		return temperatureRange;
	}
	public void setTemperatureRange(String temperatureRange) {
		this.temperatureRange = temperatureRange;
	}
	public String getHumidityLevel() {
		return humidityLevel;
	}
	public void setHumidityLevel(String humidityLevel) {
		this.humidityLevel = humidityLevel;
	}
	public String getPropagationMethod() {
		return propagationMethod;
	}
	public void setPropagationMethod(String propagationMethod) {
		this.propagationMethod = propagationMethod;
	}
	public String getMedicinalUses() {
		return medicinalUses;
	}
	public void setMedicinalUses(String medicinalUses) {
		this.medicinalUses = medicinalUses;
	}
	public String getToxicity() {
		return toxicity;
	}
	public void setToxicity(String toxicity) {
		this.toxicity = toxicity;
	}
	public String getPlantImageURL() {
		return plantImageURL;
	}
	public void setPlantImageURL(String plantImageURL) {
		this.plantImageURL = plantImageURL;
	}
}
    


   