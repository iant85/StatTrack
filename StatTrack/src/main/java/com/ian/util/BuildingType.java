/**
 * 
 */
package com.ian.util;

/**
 * @author Ian
 *
 */
public enum BuildingType {

	RESIDENTIAL("Residential"), COMMERCIAL("Commercial"), 
	INDUSTRIAL("Industrial"), INSTITUTIONAL("Insitiutional"),
	EDUCATIONAL("Educational"), GOVERNMENT("Government"),
	RELIGIOUS("Religious"), MILITARY("Military"),
	AGRICULTURAL("Agricultural"), SPORTING("Sporting");

	private String buildindType;

	private BuildingType(String buildingType) {
		
		this.buildindType = buildingType;
	
	}
	
	public String getBuildingType() {
		
		return buildindType;
		
	}

}
