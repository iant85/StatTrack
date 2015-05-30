/**
 * 
 */
package com.ian.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ian.util.Foot;

/**
 * @author Ian
 *
 */
@Entity
@Table(name = "player")
public class Player extends Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManyToOne()
	private Club club;
	@Column(name = "position")
	@ManyToMany(mappedBy = "players")
	private Collection<Position> positions;
	@Column(name = "foot")
	private Foot foot;

	/**
	 * 
	 */
	public Player() {

	}

	@Override
	public String toString() {

		StringBuilder positions = new StringBuilder();

		if (getPositions() != null && getClub() != null && getFoot() != null) {
			for (Position p : getPositions())
				positions.append(p.getPitchPosition().getPitchPosition() + ", ");
			
			return super.toString() + "\nclub=" + getClub().getName()
					+ "\nposition=" + positions 
					+ "\nfoot=" + getFoot().getFoot();

		} else {
			
			return super.toString() + "\nclub=" + null
					+ "\nposition=" + null 
					+ "\nfoot=" + null;
			
		}

	}

	/**
	 * @return the club
	 */
	public Club getClub() {
		return club;
	}

	/**
	 * @param club
	 *            the club to set
	 */
	public void setClub(Club club) {
		this.club = club;
	}

	/**
	 * @return the positions
	 */
	public Collection<Position> getPositions() {
		return positions;
	}

	/**
	 * @param positions
	 *            the positions to set
	 */
	public void setPositions(Collection<Position> positions) {
		this.positions = positions;
	}

	/**
	 * @return the foot
	 */
	public Foot getFoot() {
		return foot;
	}

	/**
	 * @param foot
	 *            the foot to set
	 */
	public void setFoot(Foot foot) {
		this.foot = foot;
	}

}
