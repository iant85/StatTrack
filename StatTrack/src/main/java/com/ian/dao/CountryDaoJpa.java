/**
 * 
 */
package com.ian.dao;

import java.util.Collection;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ian.entity.Country;

/**
 * @author Ian
 *
 */
@Stateless
@Local
public class CountryDaoJpa implements CountryDao {

	@PersistenceContext(name = "punit")
	private EntityManager entityManager;

	public CountryDaoJpa() {

	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Country> getAllCountries() {
		Query query = entityManager.createNamedQuery("Country.getAll");
		List<Country> data = query.getResultList();
		return data;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addAllCountries(Collection<Country> countries) {
		Query query = entityManager.createNamedQuery("Country.getAll");
		List<Country> db = query.getResultList();
		for (Country c : countries) {
			if (!db.contains(c))
				entityManager.persist(c);
		}
	}

	@Override
	public Country getCountryByName(Country country) {
		Query query = entityManager.createNamedQuery("Country.getByName");
		query.setParameter("name", country.getName());
		return (Country) query.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Country addCountry(Country country) {
		Query query = entityManager.createNamedQuery("Country.getAll");
		List<Country> db = query.getResultList();
		if (!db.contains(country)) {
			entityManager.persist(country);
			return country;
		}
		return null;
	}

}
