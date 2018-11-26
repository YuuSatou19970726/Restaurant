package com.java.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="restaurant_sum")
public class RestaurantSum 
{
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="update_day")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDay;
	
	@Column(name="restaurant_number")
	private int restaurantNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getUpdateDay() {
		return updateDay;
	}

	public void setUpdateDay(Date updateDay) {
		this.updateDay = updateDay;
	}

	public int getRestaurantNumber() {
		return restaurantNumber;
	}

	public void setRestaurantNumber(int restaurantNumber) {
		this.restaurantNumber = restaurantNumber;
	}
	
}
