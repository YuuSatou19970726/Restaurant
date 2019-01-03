package com.java.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.RestaurantDao;
import com.java.entity.Restaurant;
import com.java.model.RestaurantModel;

@Service
@Transactional
public class RestaurantService 
{
	@Autowired
	private RestaurantDao restaurantDao;
	
	public List<Restaurant> findAll()
	{
		return restaurantDao.findAll();
	}
	
	public List<Restaurant> findAllByCountryId(int countryId)
	{
		return restaurantDao.findAllByCountryId(countryId);
	}
	
	public List<Restaurant> findAllByCityId(int cityId)
	{
		return restaurantDao.findAllByCityId(cityId);
	}
	
	public List<Restaurant> findAllByRegionId(int regionId)
	{
		return restaurantDao.findAllByRegionId(regionId);
	}
	
	public List<Restaurant> findAllByStreetId(int streetId)
	{
		return restaurantDao.findAllByStreetId(streetId);
	}
	
	public List<Restaurant> findAllByName(String name)
	{
		return restaurantDao.findAllByName(name);
	}
	
	public Restaurant findByRestaurantId(int restaurantId)
	{
		return restaurantDao.findById(restaurantId);
	}
	
	public Restaurant createRestaurant(RestaurantModel restaurantModel)
	{
		Restaurant restaurant = new Restaurant();
		restaurantModel.toRestaurant(restaurant);
		
		return restaurantDao.create(restaurant);
	}
	
	public Restaurant updateRestaurant(RestaurantModel restaurantModel)
	{
		Restaurant restaurant = new Restaurant();
		restaurantModel.toRestaurant(restaurant);
		
		return restaurantDao.update(restaurant);
	}
	
	public Restaurant deleteRestaurant(RestaurantModel restaurantModel)
	{
		Restaurant restaurant = new Restaurant();
		restaurantModel.toRestaurant(restaurant);
		
		return restaurantDao.delete(restaurant);
	}
}
