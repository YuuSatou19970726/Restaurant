package com.java.model;

import com.java.entity.Country;
import com.java.entity.ProductFood;
import com.java.entity.ProductFoodStyle;
import com.java.entity.Restaurant;

public class ProductFoodModel 
{
	private int productFoodId;
	private String detail;
	private String image;
	private String name;
	private int price;
	private String status;
	private Country country;
	private int countryId;
	private ProductFoodStyle productFoodStyle;
	private int productFoodStyleId;
	private String productFoodStyleName;
	private Restaurant restaurant;
	private int restaurantId;
	
	public ProductFoodStyle toProductFoodStyle(ProductFoodStyle productFoodStyle)
	{
		productFoodStyle.setId(this.productFoodStyleId);
		productFoodStyle.setName(this.productFoodStyleName);
		return productFoodStyle;
	}
	
	public void fromProductFoodStyle(ProductFoodStyle productFoodStyle)
	{
		this.setProductFoodStyleId(productFoodStyle.getId());
		this.setProductFoodStyleName(productFoodStyle.getName());
	}
	
	public ProductFood toProductFood(ProductFood productFood)
	{
		productFood.setDetail(this.detail);
		productFood.setImage(this.image);
		productFood.setName(this.name);
		productFood.setPrice(this.price);
		productFood.setStatus(this.status);
		return productFood;
	}
	
	public void fromProductFood(ProductFood productFood)
	{
		this.setProductFoodId(productFood.getId());
		this.setDetail(productFood.getDetail());
		this.setImage(productFood.getImage());
		this.setName(productFood.getName());
		this.setPrice(productFood.getPrice());
		this.setStatus(productFood.getStatus());
		this.setCountryId(productFood.getCountry().getId());
		this.setProductFoodStyleId(productFood.getProductFoodStyle().getId());
		this.setRestaurantId(productFood.getRestaurant().getId());
	}
	
	public int getProductFoodId() {
		return productFoodId;
	}
	public void setProductFoodId(int productFoodId) {
		this.productFoodId = productFoodId;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public ProductFoodStyle getProductFoodStyle() {
		return productFoodStyle;
	}
	public void setProductFoodStyle(ProductFoodStyle productFoodStyle) {
		this.productFoodStyle = productFoodStyle;
	}
	public int getProductFoodStyleId() {
		return productFoodStyleId;
	}
	public void setProductFoodStyleId(int productFoodStyleId) {
		this.productFoodStyleId = productFoodStyleId;
	}
	public String getProductFoodStyleName() {
		return productFoodStyleName;
	}
	public void setProductFoodStyleName(String productFoodStyleName) {
		this.productFoodStyleName = productFoodStyleName;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	
}
