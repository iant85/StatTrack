/**
 * 
 */
package com.ian.util;

/**
 * @author Ian
 *
 */
public enum Sport {

	SOCCER("Association Football"), ATHLETICS("Athletics");

	private String sport;

	private Sport(String sport) {

		this.sport = sport;

	}

	public String getSport() {

		return sport;

	}

}
