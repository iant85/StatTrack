/**
 * 
 */
package com.ian.service;

import java.util.Collection;

import javax.ejb.Local;

import com.ian.entity.Country;

/**
 * @author Ian
 *
 */
@Local
public interface CountryService {

	Collection<Country> getAllCountries();

	void addAllCountries(Collection<Country> countries);

	Country getCountryByName(Country country);

	Country addCountry(Country country);

}
