package com.java.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="product_food_sum")
public class ProductFoodSum 
{
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="update_day")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDay;
	
	@Column(name="time_number_of_time_set")
	private int tnots;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="product_food_id")
	private ProductFood productFood;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="restaurant_id")
	private Restaurant restaurant;

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

	public int getTnots() {
		return tnots;
	}

	public void setTnots(int tnots) {
		this.tnots = tnots;
	}

	public ProductFood getProductFood() {
		return productFood;
	}

	public void setProductFood(ProductFood productFood) {
		this.productFood = productFood;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
}
