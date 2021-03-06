package com.java.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="restaurant_address_streets")
public class RestaurantAddressStreet 
{
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="restaurant_region_id")
	private RestaurantAddressRegion restaurantAddressRegion;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RestaurantAddressRegion getRestaurantAddressRegion() {
		return restaurantAddressRegion;
	}

	public void setRestaurantAddressRegion(RestaurantAddressRegion restaurantAddressRegion) {
		this.restaurantAddressRegion = restaurantAddressRegion;
	}
	
}
