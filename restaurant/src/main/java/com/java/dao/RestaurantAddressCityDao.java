package com.java.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.RestaurantAddressCity;

@Repository
public class RestaurantAddressCityDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public List<RestaurantAddressCity> findAll()
	{
		TypedQuery<RestaurantAddressCity> query = getSession().createQuery("FROM RestaurantAddressCity", RestaurantAddressCity.class);
		List<RestaurantAddressCity> restaurantAddressCities = query.getResultList();
		return restaurantAddressCities;
	}
	
	public List<RestaurantAddressCity> findAllByCountryId(int countryId)
	{
		TypedQuery<RestaurantAddressCity> query = getSession().createQuery("FROM RestaurantAddressCity  WHERE country.id = :countryId", RestaurantAddressCity.class);
		query.setParameter("countryId", countryId);
		List<RestaurantAddressCity> restaurantAddressCities = query.getResultList();
		return restaurantAddressCities;
	}
	
	public RestaurantAddressCity findById(int id)
	{
		RestaurantAddressCity restaurantAddressCity = getSession().find(RestaurantAddressCity.class, id);
		return restaurantAddressCity;
	}
	
	public RestaurantAddressCity create(RestaurantAddressCity restaurantAddressCity)
	{
		getSession().save(restaurantAddressCity);
		return restaurantAddressCity;
	}
	
	public RestaurantAddressCity update(RestaurantAddressCity restaurantAddressCity)
	{
		getSession().update(restaurantAddressCity);
		return restaurantAddressCity;
	}
	
	public RestaurantAddressCity delete(RestaurantAddressCity restaurantAddressCity)
	{
		getSession().delete(restaurantAddressCity);
		return restaurantAddressCity;
	}
}
