package com.ian.service;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import com.ian.dao.CountryDao;
import com.ian.entity.Country;

/**
 * @author Ian
 *
 */
@Stateless
@Local
public class CountryServiceEjb implements CountryService {

	@EJB
	private CountryDao countryDao;

	/**
	 * 
	 */
	public CountryServiceEjb() {

	}

	@Override
	public Collection<Country> getAllCountries() {
		return countryDao.getAllCountries();
	}

	@Override
	public void addAllCountries(Collection<Country> countries) {
		countryDao.addAllCountries(countries);
	}

	@Override
	public Country getCountryByName(Country country) {
		return countryDao.getCountryByName(country);
	}

	@Override
	public Country addCountry(Country country) {
		return countryDao.addCountry(country);
	}

}
