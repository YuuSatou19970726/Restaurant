package com.java.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.RestaurantAddressCityDao;
import com.java.entity.RestaurantAddressCity;
import com.java.model.RestaurantModel;

@Service
@Transactional
public class RestaurantAddressCityService 
{
	@Autowired
	private RestaurantAddressCityDao restaurantAddressCityDao;
	
	public List<RestaurantAddressCity> findAll()
	{
		return restaurantAddressCityDao.findAll();
	}
	
	public List<RestaurantAddressCity> findAllByCountryId(int countryId)
	{
		return restaurantAddressCityDao.findAllByCountryId(countryId);
	}
	
	public RestaurantAddressCity findByRestaurantAddressCityId(int restaurantAddressCityId)
	{
		return restaurantAddressCityDao.findById(restaurantAddressCityId);
	}
	
	public RestaurantAddressCity createRestaurantAddressCity(RestaurantModel restaurantModel)
	{
		RestaurantAddressCity restaurantAddressCity = new RestaurantAddressCity();
		restaurantModel.toRestaurantAddressCity(restaurantAddressCity);
		
		return restaurantAddressCityDao.create(restaurantAddressCity);
	}
	
	public RestaurantAddressCity updateRestaurantAddressCity(RestaurantModel restaurantModel)
	{
		RestaurantAddressCity restaurantAddressCity = new RestaurantAddressCity();
		restaurantModel.toRestaurantAddressCity(restaurantAddressCity);
		
		return restaurantAddressCityDao.update(restaurantAddressCity);
	}
	
	public RestaurantAddressCity deleteRestaurantAddressCity(RestaurantModel restaurantModel)
	{
		RestaurantAddressCity restaurantAddressCity = new RestaurantAddressCity();
		restaurantModel.toRestaurantAddressCity(restaurantAddressCity);
		
		return restaurantAddressCityDao.delete(restaurantAddressCity);
	}
}
