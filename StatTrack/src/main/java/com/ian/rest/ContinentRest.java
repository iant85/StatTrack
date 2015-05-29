/**
 * 
 */
package com.ian.rest;

import java.util.Collection;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ian.entity.Continent;
import com.ian.entity.Country;
import com.ian.service.ContinentService;

/**
 * @author Ian
 *
 */
@Path("/continent")
@Stateless
public class ContinentRest {

	@EJB
	private ContinentService continentService;

	/**
	 * 
	 */
	public ContinentRest() {
	}

	@GET
	@Path("/getallcontinents")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Continent> getAllContinents() {
		return (List<Continent>) continentService.getAllContinents();
	}
	
	@POST
	@Path("/addallcontinents")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addAllContinents(Collection<Continent> continents) {
		continentService.addAllContinents(continents);
	}

	@POST
	@Path("/getcontinentbyname")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Continent getContinentByName(Continent continent) {
		return continentService.getContinentByName(continent);
	}

	@POST
	@Path("/getcountriesbycontinent")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Country> getAllCountriesByContinent(Continent continent) {
		return continentService.getAllCountriesByContinent(continent);
	}

	@POST
	@Path("/addcontinent")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Continent addContinent(Continent continent) {
		return continentService.addContinent(continent);
	}

}
