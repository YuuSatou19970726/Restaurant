package com.java.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.RestaurantSum;

@Repository
public class RestaurantSumDao 
{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public List<RestaurantSum> findAll()
	{
		TypedQuery<RestaurantSum> query = getSession().createQuery("FROM RestaurantSum", RestaurantSum.class);
		List<RestaurantSum> restaurantSums = query.getResultList();
		return restaurantSums;
	}
	
	public RestaurantSum findById(int id)
	{
		RestaurantSum restaurantSum = getSession().find(RestaurantSum.class, id);
		return restaurantSum;
	}
	
	public RestaurantSum create(RestaurantSum restaurantSum)
	{
		getSession().save(restaurantSum);
		return restaurantSum;
	}
	
	public RestaurantSum update(RestaurantSum restaurantSum)
	{
		getSession().update(restaurantSum);
		return restaurantSum;
	}
	
	public RestaurantSum delete(RestaurantSum restaurantSum)
	{
		getSession().delete(restaurantSum);
		return restaurantSum;
	}
}
