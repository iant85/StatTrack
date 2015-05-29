/**
 * 
 */
package com.ian.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Ian
 *
 */
@Entity
@Table(name = "league")
public class League extends Competition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "league_name")
	private String leagueName;
	@Column(name = "country")
	private Country country;
	@OneToMany(mappedBy = "league")
	private Collection<Club> clubs;

	/**
	 * 
	 */
	public League() {

	}

	/**
	 * @return the leagueName
	 */
	public String getLeagueName() {
		return leagueName;
	}

	/**
	 * @param leagueName the leagueName to set
	 */
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * @return the clubs
	 */
	public Collection<Club> getClubs() {
		return clubs;
	}

	/**
	 * @param clubs the clubs to set
	 */
	public void setClubs(Collection<Club> clubs) {
		this.clubs = clubs;
	}

}
