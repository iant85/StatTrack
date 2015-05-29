/**
 * 
 */
package com.ian.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.ian.util.BuildingType;

/**
 * @author Ian
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Building implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "construction_date")
	private Date constructionDate;

	@Column(name = "type")
	private BuildingType type;

	@Column(name = "area")
	private Double area;

	@Column(name = "height")
	private Double height;

	@Column(name = "stories")
	private Integer stories;

	@Column(name = "location")
	private Place place;

	/**
	 * 
	 */
	public Building() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Building other = (Building) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "\nid=" + id + "\nname=" + name
				+ "\nconstructionDate=" + constructionDate + "\ntype=" + type
				+ "\narea=" + area + "\nheight=" + height + "\nstories="
				+ stories + "\nplace=" + place;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the constructionDate
	 */
	public Date getConstructionDate() {
		return constructionDate;
	}

	/**
	 * @param constructionDate
	 *            the constructionDate to set
	 */
	public void setConstructionDate(Date constructionDate) {
		this.constructionDate = constructionDate;
	}

	/**
	 * @return the type
	 */
	public BuildingType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(BuildingType type) {
		this.type = type;
	}

	/**
	 * @return the area
	 */
	public Double getArea() {
		return area;
	}

	/**
	 * @param area
	 *            the area to set
	 */
	public void setArea(Double area) {
		this.area = area;
	}

	/**
	 * @return the height
	 */
	public Double getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(Double height) {
		this.height = height;
	}

	/**
	 * @return the stories
	 */
	public Integer getStories() {
		return stories;
	}

	/**
	 * @param stories
	 *            the stories to set
	 */
	public void setStories(Integer stories) {
		this.stories = stories;
	}

	/**
	 * @return the place
	 */
	public Place getPlace() {
		return place;
	}

	/**
	 * @param place
	 *            the place to set
	 */
	public void setPlace(Place place) {
		this.place = place;
	}

}
