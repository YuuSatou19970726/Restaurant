package com.java.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.RestaurantImage;

@Repository
public class RestaurantImageDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public List<RestaurantImage> findAll()
	{
		TypedQuery<RestaurantImage> query = getSession().createQuery("FROM RestaurantImage", RestaurantImage.class);
		List<RestaurantImage> restaurantImages = query.getResultList();
		return restaurantImages;
	}
	
	public List<RestaurantImage> findAllByRestaurantId(int restaurantId)
	{
		TypedQuery<RestaurantImage> query = getSession().createQuery("FROM RestaurantImage WHERE restaurant.id = :restaurantId", RestaurantImage.class);
		query.setParameter("restaurantId", restaurantId);
		List<RestaurantImage> restaurantImages = query.getResultList();
		return restaurantImages;
	}
	
	public RestaurantImage create(RestaurantImage restaurantImage)
	{
		getSession().save(restaurantImage);
		return restaurantImage;
	}
	
	public RestaurantImage delete(RestaurantImage restaurantImage)
	{
		getSession().delete(restaurantImage);
		return restaurantImage;
	}
}
