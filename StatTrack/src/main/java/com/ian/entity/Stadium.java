/**
 * 
 */
package com.ian.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Ian
 *
 */
@Entity
@Table(name = "stadium")
public class Stadium extends Building implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "capacity")
	private Integer capacity;

	/**
	 * 
	 */
	public Stadium() {

	}

	@Override
	public String toString() {

		return super.toString() + "\ncapacity=" + getCapacity();

	}

	/**
	 * @return the capacity
	 */
	public Integer getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity
	 *            the capacity to set
	 */
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

}
