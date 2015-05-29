/**
 * 
 */
package com.ian.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Ian
 *
 */
@NamedQueries({
		@NamedQuery(name = "Country.getAll", query = "SELECT c FROM Country c"),
		@NamedQuery(name = "Country.getByName", query = "SELECT c FROM Country c WHERE c.name = :name") })
@Entity
@Table(name = "country")
public class Country extends Place implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "capital")
	private String capital;
	@Column(name = "demonym")
	private String demonym;
	@ManyToOne
	private Continent continent;

	/**
	 * 
	 */
	public Country() {

	}

	@Override
	public String toString() {

		return super.toString() + "\ncapital=" + getCapital() + "\ndemonym="
				+ getDemonym() + "\nContinent=" + getContinent().getName();

	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	/**
	 * @return the name used for the people who live in a particular country,
	 *         state, or other locality.
	 */
	public String getDemonym() {
		return demonym;
	}

	/**
	 * Set the name used for the people who live in a particular country, state,
	 * or other locality.
	 * 
	 * @param demonym
	 */
	public void setDemonym(String demonym) {
		this.demonym = demonym;
	}

}
