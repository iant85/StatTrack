/**
 * 
 */
package com.ian.driver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ian.entity.Club;
import com.ian.entity.Country;
import com.ian.entity.Person;
import com.ian.entity.Place;
import com.ian.entity.Player;
import com.ian.entity.Position;
import com.ian.util.Foot;
import com.ian.util.PitchPosition;

/**
 * @author Ian
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Place place1 = new Country();
		place1.setName("Ireland");
		((Country) place1).setDemonym("Irish");

		List<Position> positions = new ArrayList<Position>();
		positions.add(0, new Position());
		positions.get(0).setPitchPosition(
				PitchPosition.CENTRE_ATTACKING_MIDFIELD);
		positions.add(1, new Position());
		positions.get(1).setPitchPosition(PitchPosition.CENTRE_MIDFIELD);

		Person player1 = new Player();
		player1.setFirstName("Tom");
		player1.setDateOfBirth(new Date());
		player1.setLastName("Thumb");
		player1.setHeight(1.80);
		player1.setWeight(64.0);
		player1.setNationality((Country) place1);
		((Player) player1).setClub(new Club());
		((Player) player1).getClub().setName("Manchester United");
		((Player) player1).setPositions(positions);
		((Player) player1).setFoot(Foot.RIGHT);

		System.out.println(((Player) player1).toString());

	}

}
