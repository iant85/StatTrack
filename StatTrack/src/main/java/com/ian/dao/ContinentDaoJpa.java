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

import com.ian.entity.Continent;
import com.ian.entity.Country;

/**
 * @author Ian
 *
 */
@Stateless
@Local
public class ContinentDaoJpa implements ContinentDao {

	@PersistenceContext(name = "punit")
	private EntityManager entityManager;

	/**
	 * 
	 */
	public ContinentDaoJpa() {
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Continent> getAllContinents() {
		Query query = entityManager.createNamedQuery("Continent.getAll");
		List<Continent> data = query.getResultList();
		return data;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addAllContinents(Collection<Continent> continents) {
		Query query = entityManager.createNamedQuery("Continent.getAll");
		List<Continent> db = query.getResultList();
		for (Continent c : continents) {
			if (!db.contains(c))
				entityManager.persist(c);
		}
	}

	@Override
	public Continent getContinentByName(Continent continent) {
		Query query = entityManager.createNamedQuery("Continent.getByName");
		query.setParameter("name", continent.getName());
		return (Continent) query.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Continent addContinent(Continent continent) {
		Query query = entityManager.createNamedQuery("Continent.getAll");
		List<Continent> db = query.getResultList();
		if (!db.contains(continent)) {
			entityManager.persist(continent);
			return continent;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Country> getAllCountriesByContinent(Continent continent) {
		Query query = entityManager
				.createNamedQuery("Continent.getAllCountriesByContinent");
		query.setParameter("name", continent.getName());
		List<Country> countries = query.getResultList();
		return countries;
	}

}
