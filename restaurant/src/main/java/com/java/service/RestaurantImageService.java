package com.java.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.RestaurantImageDao;
import com.java.entity.RestaurantImage;

@Service
@Transactional
public class RestaurantImageService 
{
	@Autowired
	private RestaurantImageDao restaurantImageDao;
	
	public List<RestaurantImage> findAll()
	{
		return restaurantImageDao.findAll();
	}
	
	public List<RestaurantImage> findAllByRestaurantId(int restaurantId)
	{
		return restaurantImageDao.findAllByRestaurantId(restaurantId);
	}
	
	public RestaurantImage findByRestaurantImage(int restaurantImageId)
	{
		return restaurantImageDao.findById(restaurantImageId);
	}
	
	public RestaurantImage createRestaurantImage(RestaurantImage restaurantImage)
	{
		return restaurantImageDao.create(restaurantImage);
	}
	
	public RestaurantImage deleteRestaurantImage(RestaurantImage restaurantImage)
	{
		return restaurantImageDao.delete(restaurantImage);
	}
}
