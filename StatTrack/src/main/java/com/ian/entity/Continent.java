/**
 * 
 */
package com.ian.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Ian
 *
 */
@NamedQueries({
		@NamedQuery(name = "Continent.getAll", query = "SELECT c FROM Continent c"),
		@NamedQuery(name = "Continent.getByName", query = "SELECT c FROM Continent c WHERE c.name = :name"),
		@NamedQuery(name = "Continent.getAllCountriesByContinent", query = "SELECT cy FROM Continent ct, Country cy WHERE ct.id = cy.continent.id AND ct.name = :name") })
@Entity
@Table(name = "continent")
public class Continent extends Place implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Parent of Country
	// Child (Country) should have the Continent as FK
	@OneToMany(mappedBy = "continent")
	@Column(name = "countries")
	private Collection<Country> countries;

	/**
	 * 
	 */
	public Continent() {
		
	}
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for(Country c : countries)
			sb.append(c.getName() + ", ");
		
		return super.toString() 
				+ "\nCountries=" + sb; 
		
	}

	public Collection<Country> getCountries() {
		return countries;
	}

	public void setCountries(Collection<Country> countries) {
		this.countries = countries;
	}

}
