package com.java.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.RestaurantAddressStreet;

@Repository
public class RestaurantAddressStreetDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public List<RestaurantAddressStreet> findAll()
	{
		TypedQuery<RestaurantAddressStreet> query = getSession().createQuery("FROM RestaurantAddressStreet", RestaurantAddressStreet.class);
		List<RestaurantAddressStreet> restaurantAddressStreets = query.getResultList();
		return restaurantAddressStreets;
	}
	
	public List<RestaurantAddressStreet> findAllByRegionId(int regionId)
	{
		TypedQuery<RestaurantAddressStreet> query = getSession().createQuery("FROM RestaurantAddressStreet restaurantAddressRegion.id = :regionId", RestaurantAddressStreet.class);
		query.setParameter("regionId", regionId);
		List<RestaurantAddressStreet> restaurantAddressStreets = query.getResultList();
		return restaurantAddressStreets;
	}
	
	public RestaurantAddressStreet findById(int id)
	{
		RestaurantAddressStreet restaurantAddressStreet = getSession().find(RestaurantAddressStreet.class, id);
		return restaurantAddressStreet;
	}
	
	public RestaurantAddressStreet create(RestaurantAddressStreet restaurantAddressStreet)
	{
		getSession().save(restaurantAddressStreet);
		return restaurantAddressStreet;
	}
	
	public RestaurantAddressStreet update(RestaurantAddressStreet restaurantAddressStreet)
	{
		getSession().update(restaurantAddressStreet);
		return restaurantAddressStreet;
	}
	
	public RestaurantAddressStreet delete(RestaurantAddressStreet restaurantAddressStreet)
	{
		getSession().delete(restaurantAddressStreet);
		return restaurantAddressStreet;
	}
}
