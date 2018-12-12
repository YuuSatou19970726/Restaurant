package com.java.model;

import com.java.entity.Country;
import com.java.entity.Restaurant;
import com.java.entity.RestaurantAddressCity;
import com.java.entity.RestaurantAddressRegion;
import com.java.entity.RestaurantAddressStreet;

public class RestaurantModel 
{
	private int restaurantId;
	private String address;
	private String detail;
	private String email;
	private String manager;
	private String name;
	private String phone;
	private String restaurantCode;
	private String status;
	private String web;
	private String addressZipCode;
	private Country country;
	private RestaurantAddressCity restaurantAddressCity;
	private RestaurantAddressRegion restaurantAddressRegion;
	private RestaurantAddressStreet restaurantAddressStreet;
	private int countryId;
	private String countryName;
	private int restaurantAddressCityId;
	private String restaurantAddressCityName;
	private int restaurantAddressRegionId;
	private String restaurantAddressRegionName;
	private int restaurantAddressStreetId;
	private String restaurantAddressStreetName;
	
	public Country toCountry(Country country)
	{
		country.setId(this.countryId);
		country.setName(this.countryName);
		return country;
	}
	
	public void fromCountry(Country country)
	{
		this.setCountryId(country.getId());
		this.setCountryName(country.getName());
	}
	
	public RestaurantAddressCity toRestaurantAddressCity(RestaurantAddressCity restaurantAddressCity)
	{
		restaurantAddressCity.setId(this.restaurantAddressCityId);
		restaurantAddressCity.setName(this.restaurantAddressCityName);
		return restaurantAddressCity;
	}
	
	public void fromRestaurantAddressCity(RestaurantAddressCity restaurantAddressCity)
	{
		this.setRestaurantAddressCityId(restaurantAddressCity.getId());
		this.setRestaurantAddressCityName(restaurantAddressCity.getName());
		this.setCountryId(restaurantAddressCity.getCountry().getId());
	}
	
	public RestaurantAddressRegion toRestaurantAddressRegion(RestaurantAddressRegion restaurantAddressRegion)
	{
		restaurantAddressRegion.setId(this.restaurantAddressRegionId);
		restaurantAddressRegion.setName(this.restaurantAddressRegionName);
		return restaurantAddressRegion;
	}
	
	public void fromRestaurantAddressRegion(RestaurantAddressRegion restaurantAddressRegion)
	{
		this.setRestaurantAddressRegionId(restaurantAddressRegion.getId());
		this.setRestaurantAddressRegionName(restaurantAddressRegion.getName());
		this.setRestaurantAddressCityId(restaurantAddressRegion.getRestaurantAddressCity().getId());
	}
	
	public RestaurantAddressStreet toRestaurantAddressStreet(RestaurantAddressStreet restaurantAddressStreet)
	{
		restaurantAddressStreet.setId(this.restaurantAddressStreetId);
		restaurantAddressStreet.setName(this.restaurantAddressStreetName);
		return restaurantAddressStreet;
	}
	
	public void fromRestaurantAddressStreet(RestaurantAddressStreet restaurantAddressStreet)
	{
		this.setRestaurantAddressStreetId(restaurantAddressStreet.getId());
		this.setRestaurantAddressStreetName(restaurantAddressStreet.getName());
		this.setRestaurantAddressRegionId(restaurantAddressStreet.getRestaurantAddressRegion().getId());
	}
	
	public Restaurant toRestaurant(Restaurant restaurant)
	{
		restaurant.setAddress(this.address);
		restaurant.setAddressZipcode(this.addressZipCode);
		restaurant.setDetail(this.detail);
		restaurant.setEmail(this.email);
		restaurant.setManager(this.manager);
		restaurant.setName(this.name);
		restaurant.setPhone(this.phone);
		restaurant.setRestaurantCode(this.restaurantCode);
		restaurant.setStatus(this.status);
		restaurant.setWeb(this.web);
		return restaurant;
	}
	
	public void fromRestaurant(Restaurant restaurant)
	{
		this.setRestaurantId(restaurant.getId());
		this.setAddress(restaurant.getAddress());
		this.setAddressZipCode(restaurant.getAddressZipcode());
		this.setDetail(restaurant.getDetail());
		this.setEmail(restaurant.getEmail());
		this.setManager(restaurant.getManager());
		this.setName(restaurant.getName());
		this.setPhone(restaurant.getPhone());
		this.setRestaurantCode(restaurant.getRestaurantCode());
		this.setStatus(restaurant.getStatus());
		this.setWeb(restaurant.getWeb());
		this.setCountryId(restaurant.getCountry().getId());
		this.setRestaurantAddressCityId(restaurant.getRestaurantAddressCity().getId());
		this.setRestaurantAddressRegionId(restaurant.getRestaurantAddressRegion().getId());
		this.setRestaurantAddressStreetId(restaurant.getRestaurantAddressStreet().getId());
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRestaurantCode() {
		return restaurantCode;
	}
	public void setRestaurantCode(String restaurantCode) {
		this.restaurantCode = restaurantCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getAddressZipCode() {
		return addressZipCode;
	}
	public void setAddressZipCode(String addressZipCode) {
		this.addressZipCode = addressZipCode;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public RestaurantAddressCity getRestaurantAddressCity() {
		return restaurantAddressCity;
	}
	public void setRestaurantAddressCity(RestaurantAddressCity restaurantAddressCity) {
		this.restaurantAddressCity = restaurantAddressCity;
	}
	public RestaurantAddressRegion getRestaurantAddressRegion() {
		return restaurantAddressRegion;
	}
	public void setRestaurantAddressRegion(RestaurantAddressRegion restaurantAddressRegion) {
		this.restaurantAddressRegion = restaurantAddressRegion;
	}
	public RestaurantAddressStreet getRestaurantAddressStreet() {
		return restaurantAddressStreet;
	}
	public void setRestaurantAddressStreet(RestaurantAddressStreet restaurantAddressStreet) {
		this.restaurantAddressStreet = restaurantAddressStreet;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getRestaurantAddressCityId() {
		return restaurantAddressCityId;
	}
	public void setRestaurantAddressCityId(int restaurantAddressCityId) {
		this.restaurantAddressCityId = restaurantAddressCityId;
	}
	public String getRestaurantAddressCityName() {
		return restaurantAddressCityName;
	}
	public void setRestaurantAddressCityName(String restaurantAddressCityName) {
		this.restaurantAddressCityName = restaurantAddressCityName;
	}
	public int getRestaurantAddressRegionId() {
		return restaurantAddressRegionId;
	}
	public void setRestaurantAddressRegionId(int restaurantAddressRegionId) {
		this.restaurantAddressRegionId = restaurantAddressRegionId;
	}
	public String getRestaurantAddressRegionName() {
		return restaurantAddressRegionName;
	}
	public void setRestaurantAddressRegionName(String restaurantAddressRegionName) {
		this.restaurantAddressRegionName = restaurantAddressRegionName;
	}
	public int getRestaurantAddressStreetId() {
		return restaurantAddressStreetId;
	}
	public void setRestaurantAddressStreetId(int restaurantAddressStreetId) {
		this.restaurantAddressStreetId = restaurantAddressStreetId;
	}
	public String getRestaurantAddressStreetName() {
		return restaurantAddressStreetName;
	}
	public void setRestaurantAddressStreetName(String restaurantAddressStreetName) {
		this.restaurantAddressStreetName = restaurantAddressStreetName;
	}
	
}
