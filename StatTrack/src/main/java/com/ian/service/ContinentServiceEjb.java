/**
 * 
 */
package com.ian.service;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import com.ian.dao.ContinentDao;
import com.ian.entity.Continent;
import com.ian.entity.Country;

/**
 * @author Ian
 *
 */
@Stateless
@Local
public class ContinentServiceEjb implements ContinentService {

	@EJB
	private ContinentDao continentDao;

	/**
	 * 
	 */
	public ContinentServiceEjb() {
	}

	@Override
	public Collection<Continent> getAllContinents() {
		return continentDao.getAllContinents();
	}

	@Override
	public void addAllContinents(Collection<Continent> continents) {
		continentDao.addAllContinents(continents);
	}

	@Override
	public Continent getContinentByName(Continent continent) {
		return continentDao.getContinentByName(continent);
	}

	@Override
	public Continent addContinent(Continent continent) {
		return continentDao.addContinent(continent);
	}

	@Override
	public Collection<Country> getAllCountriesByContinent(Continent continent) {
		return continentDao.getAllCountriesByContinent(continent);
	}

}
