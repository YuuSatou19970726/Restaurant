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
@Table(name="restaurant")
public class Restaurant 
{
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="manager")
	private String manager;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="web")
	private String web;
	
	@Column(name="email")
	private String email;
	
	@Column(name="restaurant_code")
	private String restaurantCode;
	
	@Column(name="detail")
	private String detail;
	
	@Column(name="status")
	private String status;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_city_id")
	private RestaurantAddressCity restaurantAddressCity;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_country_id")
	private RestaurantAddressCountry restaurantAddressCountry;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_street_id")
	private RestaurantAddressStreet restaurantAddressStreet;

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

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRestaurantCode() {
		return restaurantCode;
	}

	public void setRestaurantCode(String restaurantCode) {
		this.restaurantCode = restaurantCode;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public RestaurantAddressCity getRestaurantAddressCity() {
		return restaurantAddressCity;
	}

	public void setRestaurantAddressCity(RestaurantAddressCity restaurantAddressCity) {
		this.restaurantAddressCity = restaurantAddressCity;
	}

	public RestaurantAddressCountry getRestaurantAddressCountry() {
		return restaurantAddressCountry;
	}

	public void setRestaurantAddressCountry(RestaurantAddressCountry restaurantAddressCountry) {
		this.restaurantAddressCountry = restaurantAddressCountry;
	}

	public RestaurantAddressStreet getRestaurantAddressStreet() {
		return restaurantAddressStreet;
	}

	public void setRestaurantAddressStreet(RestaurantAddressStreet restaurantAddressStreet) {
		this.restaurantAddressStreet = restaurantAddressStreet;
	}
	
}
