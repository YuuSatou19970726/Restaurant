package com.java.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.RestaurantAddressStreetDao;
import com.java.entity.RestaurantAddressStreet;
import com.java.model.RestaurantModel;

@Service
@Transactional
public class RestaurantAddressStreetService 
{
	@Autowired
	private RestaurantAddressStreetDao restaurantAddressStreetDao;
	
	public List<RestaurantAddressStreet> findAll()
	{
		return restaurantAddressStreetDao.findAll();
	}
	
	public List<RestaurantAddressStreet> findAllByRegionId(int regionId)
	{
		return restaurantAddressStreetDao.findAllByRegionId(regionId);
	}
	
	public RestaurantAddressStreet findByRestaurantAddressStreetId(int restaurantAddressStreetId)
	{
		return restaurantAddressStreetDao.findById(restaurantAddressStreetId);
	}
	
	public RestaurantAddressStreet createRestaurantAddressStreet(RestaurantModel restaurantModel)
	{
		RestaurantAddressStreet restaurantAddressStreet = new RestaurantAddressStreet();
		restaurantModel.toRestaurantAddressStreet(restaurantAddressStreet);
		
		return restaurantAddressStreetDao.create(restaurantAddressStreet);
	}
	
	public RestaurantAddressStreet updateRestaurantAddressStreet(RestaurantModel restaurantModel)
	{
		RestaurantAddressStreet restaurantAddressStreet = new RestaurantAddressStreet();
		restaurantModel.toRestaurantAddressStreet(restaurantAddressStreet);
		
		return restaurantAddressStreetDao.update(restaurantAddressStreet);
	}
	
	public RestaurantAddressStreet deleteRestaurantAddressStreet(RestaurantModel restaurantModel)
	{
		RestaurantAddressStreet restaurantAddressStreet = new RestaurantAddressStreet();
		restaurantModel.toRestaurantAddressStreet(restaurantAddressStreet);
		
		return restaurantAddressStreetDao.delete(restaurantAddressStreet);
	}
}
