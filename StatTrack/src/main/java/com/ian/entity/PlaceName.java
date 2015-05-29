/**
 * 
 */
package com.ian.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Ian
 *
 */
@Entity
@Table(name = "place_name")
public class PlaceName extends Place implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public PlaceName() {
		
	}

}
