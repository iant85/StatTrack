/**
 * 
 */
package com.ian.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Ian
 *
 */
@Entity
@Table(name = "club")
public class Club extends SportingOrganisation implements
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "club")
	@Column(name = "players")
	private Collection<Player> players;
	@ManyToOne
	private League league;
	@Column(name = "stadium")
	private Stadium stadium;
	@Column(name = "net_worth")
	private Double netWorth;

	/**
	 * 
	 */
	public Club() {

	}

	@Override
	public String toString() {

		return super.toString() + "\nleague=" + getLeague().getLeagueName()
				+ "\nstadium=" + getStadium().getName() + "\nnetWorth="
				+ getNetWorth();

	}

	/**
	 * @return the players
	 */
	public Collection<Player> getPlayers() {
		return players;
	}

	/**
	 * @param players
	 *            the players to set
	 */
	public void setPlayers(Collection<Player> players) {
		this.players = players;
	}

	/**
	 * @return the league
	 */
	public League getLeague() {
		return league;
	}

	/**
	 * @param league
	 *            the league to set
	 */
	public void setLeague(League league) {
		this.league = league;
	}

	/**
	 * @return the stadium
	 */
	public Stadium getStadium() {
		return stadium;
	}

	/**
	 * @param stadium
	 *            the stadium to set
	 */
	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

	/**
	 * @return the netWorth
	 */
	public Double getNetWorth() {
		return netWorth;
	}

	/**
	 * @param netWorth
	 *            the netWorth to set
	 */
	public void setNetWorth(Double netWorth) {
		this.netWorth = netWorth;
	}

}
