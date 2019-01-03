package com.java.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.RestaurantAddressRegionDao;
import com.java.entity.RestaurantAddressRegion;
import com.java.model.RestaurantModel;

@Service
@Transactional
public class RestaurantAddressRegionService 
{
	@Autowired
	private RestaurantAddressRegionDao restaurantAddressRegionDao;
	
	public List<RestaurantAddressRegion> findAll()
	{
		return restaurantAddressRegionDao.findAll();
	}
	
	public List<RestaurantAddressRegion> findAllByCityId(int cityId)
	{
		return restaurantAddressRegionDao.findAllByCityId(cityId);
	}
	
	public RestaurantAddressRegion findByRestaurantAddressRegionId(int restaurantAddressRegionId)
	{
		return restaurantAddressRegionDao.findById(restaurantAddressRegionId);
	}
	
	public RestaurantAddressRegion createRestaurantAddressRegion(RestaurantModel restaurantModel)
	{
		RestaurantAddressRegion restaurantAddressRegion = new RestaurantAddressRegion();
		restaurantModel.toRestaurantAddressRegion(restaurantAddressRegion);
		
		return restaurantAddressRegionDao.create(restaurantAddressRegion);
	}
	
	public RestaurantAddressRegion updateRestaurantAddressRegion(RestaurantModel restaurantModel)
	{
		RestaurantAddressRegion restaurantAddressRegion = new RestaurantAddressRegion();
		restaurantModel.toRestaurantAddressRegion(restaurantAddressRegion);
		
		return restaurantAddressRegionDao.update(restaurantAddressRegion);
	}
	
	public RestaurantAddressRegion deleteRestaurantAddressRegion(RestaurantModel restaurantModel)
	{
		RestaurantAddressRegion restaurantAddressRegion = new RestaurantAddressRegion();
		restaurantModel.toRestaurantAddressRegion(restaurantAddressRegion);
		
		return restaurantAddressRegionDao.delete(restaurantAddressRegion);
	}
}
