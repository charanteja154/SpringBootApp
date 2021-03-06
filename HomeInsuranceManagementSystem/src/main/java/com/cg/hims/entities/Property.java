  package com.cg.hims.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Property {
	
	@Id
	@GeneratedValue
	private int propertyId;
	private int marketValue;
	private int yearBuilt;
	private int squareFootage;
	private double dwellingStyle;
	private String roofMaterial;
	private String garageType;
	private int fullBathCount;
	private int halfBathCount;
	private boolean hasSwimmingPool;
	
	public Property() {
		super();
	}

	public Property(int propertyId, int marketValue, int yearBuilt, int squareFootage, double dwellingStyle,
			String roofMaterial, String garageType, int fullBathCount, int halfBathCount, boolean hasSwimmingPool) {
		super();
		this.propertyId = propertyId;
		this.marketValue = marketValue;
		this.yearBuilt = yearBuilt;
		this.squareFootage = squareFootage;
		this.dwellingStyle = dwellingStyle;
		this.roofMaterial = roofMaterial;
		this.garageType = garageType;
		this.fullBathCount = fullBathCount;
		this.halfBathCount = halfBathCount;
		this.hasSwimmingPool = hasSwimmingPool;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public int getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(int marketValue) {
		this.marketValue = marketValue;
	}

	public int getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public int getSquareFootage() {
		return squareFootage;
	}

	public void setSquareFootage(int squareFootage) {
		this.squareFootage = squareFootage;
	}

	public double getDwellingStyle() {
		return dwellingStyle;
	}

	public void setDwellingStyle(double dwellingStyle) {
		this.dwellingStyle = dwellingStyle;
	}

	public String getRoofMaterial() {
		return roofMaterial;
	}

	public void setRoofMaterial(String roofMaterial) {
		this.roofMaterial = roofMaterial;
	}

	public String getGarageType() {
		return garageType;
	}

	public void setGarageType(String garageType) {
		this.garageType = garageType;
	}

	public int getFullBathCount() {
		return fullBathCount;
	}

	public void setFullBathCount(int fullBathCount) {
		this.fullBathCount = fullBathCount;
	}

	public int getHalfBathCount() {
		return halfBathCount;
	}

	public void setHalfBathCount(int halfBathCount) {
		this.halfBathCount = halfBathCount;
	}

	public boolean isHasSwimmingPool() {
		return hasSwimmingPool;
	}

	public void setHasSwimmingPool(boolean hasSwimmingPool) {
		this.hasSwimmingPool = hasSwimmingPool;
	}

	@Override
	public String toString() {
		return "Property [propertyId=" + propertyId + ", marketValue=" + marketValue + ", yearBuilt=" + yearBuilt
				+ ", squareFootage=" + squareFootage + ", dwellingStyle=" + dwellingStyle + ", roofMaterial="
				+ roofMaterial + ", garageType=" + garageType + ", fullBathCount=" + fullBathCount + ", halfBathCount="
				+ halfBathCount + ", hasSwimmingPool=" + hasSwimmingPool + "]";
	}
	
}
