/**
 * 
 */
package com.ian.rest;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ian.entity.Country;
import com.ian.service.CountryService;

/**
 * @author Ian
 *
 */
@Path("/country")
@Stateless
public class CountryRest {

	@EJB
	private CountryService countryService;

	/**
	 * 
	 */
	public CountryRest() {
	}

	@GET
	@Path("/getallcountries")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Country> getAllCountries() {
		return countryService.getAllCountries();
	}

	@POST
	@Path("/addallcountries")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addAllCountries(Collection<Country> countries) {
		countryService.addAllCountries(countries);
	}

	@POST
	@Path("/getcountrybyname")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Country getCountryByName(Country country) {
		return countryService.getCountryByName(country);
	}

	@POST
	@Path("/addcountry")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Country addCountry(Country country) {
		return countryService.addCountry(country);
	}

}
