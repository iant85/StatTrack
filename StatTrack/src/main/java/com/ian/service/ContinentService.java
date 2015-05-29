/**
 * 
 */
package com.ian.service;

import java.util.Collection;

import javax.ejb.Local;

import com.ian.entity.Continent;
import com.ian.entity.Country;

/**
 * @author Ian
 *
 */
@Local
public interface ContinentService {

	Collection<Continent> getAllContinents();

	void addAllContinents(Collection<Continent> continents);

	Continent getContinentByName(Continent continent);

	Continent addContinent(Continent continent);

	Collection<Country> getAllCountriesByContinent(Continent continent);

}
