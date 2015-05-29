/**
 * 
 */
package com.ian.dao;

import java.util.Collection;

import com.ian.entity.Country;

/**
 * @author Ian
 *
 */
public interface CountryDao {

	Collection<Country> getAllCountries();

	void addAllCountries(Collection<Country> countries);

	Country getCountryByName(Country country);

	Country addCountry(Country country);

}
