package com.java.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.RestaurantSumDao;
import com.java.entity.RestaurantSum;

@Service
@Transactional
public class RestaurantSumService 
{
	@Autowired
	private RestaurantSumDao restaurantSumDao;
	
	public List<RestaurantSum> findAll()
	{
		return restaurantSumDao.findAll();
	}
	
	public RestaurantSum findRestaurantSumId(int restaurantSumId)
	{
		return restaurantSumDao.findById(restaurantSumId);
	}
	
	public RestaurantSum createRestaurantSum(RestaurantSum restaurantSum)
	{
		return restaurantSumDao.create(restaurantSum);
	}
	
	public RestaurantSum updateRestaurantSum(RestaurantSum restaurantSum)
	{
		return restaurantSumDao.update(restaurantSum);
	}
	
	public RestaurantSum deleteRestaurantSum(RestaurantSum restaurantSum)
	{
		return restaurantSumDao.delete(restaurantSum);
	}
}
