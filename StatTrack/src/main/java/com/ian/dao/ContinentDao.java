/**
 * 
 */
package com.ian.dao;

import java.util.Collection;

import com.ian.entity.Continent;
import com.ian.entity.Country;

/**
 * @author Ian
 *
 */
public interface ContinentDao {

	Collection<Continent> getAllContinents();

	void addAllContinents(Collection<Continent> continents);

	Continent getContinentByName(Continent continent);

	Continent addContinent(Continent continent);

	Collection<Country> getAllCountriesByContinent(Continent continent);

}
