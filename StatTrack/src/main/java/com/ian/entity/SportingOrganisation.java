/**
 * 
 */
package com.ian.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import com.ian.util.Sport;

/**
 * @author Ian
 *
 */
@Entity
public abstract class SportingOrganisation extends Organisation implements
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "sport")
	private Sport sport;

	/**
	 * 
	 */
	public SportingOrganisation() {

	}

	@Override
	public String toString() {

		return super.toString() + "\nsport=" + getSport().getSport();

	}

	/**
	 * @return the sport
	 */
	public Sport getSport() {
		return sport;
	}

	/**
	 * @param sport
	 *            the sport to set
	 */
	public void setSport(Sport sport) {
		this.sport = sport;
	}

}
