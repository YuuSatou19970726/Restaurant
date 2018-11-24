package com.java.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.RestaurantAddressRegion;

@Repository
public class RestaurantAddressRegionDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public List<RestaurantAddressRegion> findAll()
	{
		TypedQuery<RestaurantAddressRegion> query = getSession().createQuery("FROM RestaurantAddressRegion", RestaurantAddressRegion.class);
		List<RestaurantAddressRegion> restaurantAddressRegions = query.getResultList();
		return restaurantAddressRegions;
	}
	
	public List<RestaurantAddressRegion> findAllByCityId(int cityId)
	{
		TypedQuery<RestaurantAddressRegion> query = getSession().createQuery("FROM RestaurantAddressRegion WHERE restaurantAddressCity.id = :cityId", RestaurantAddressRegion.class);
		query.setParameter("cityId", cityId);
		List<RestaurantAddressRegion> restaurantAddressRegions = query.getResultList();
		return restaurantAddressRegions;
	}
	
	public RestaurantAddressRegion findById(int id)
	{
		RestaurantAddressRegion restaurantAddressRegion = getSession().find(RestaurantAddressRegion.class, id);
		return restaurantAddressRegion;
	}
	
	public RestaurantAddressRegion create(RestaurantAddressRegion restaurantAddressRegion)
	{
		getSession().save(restaurantAddressRegion);
		return restaurantAddressRegion;
	}
	
	public RestaurantAddressRegion update(RestaurantAddressRegion restaurantAddressRegion)
	{
		getSession().update(restaurantAddressRegion);
		return restaurantAddressRegion;
	}
	
	public RestaurantAddressRegion delete(RestaurantAddressRegion restaurantAddressRegion)
	{
		getSession().delete(restaurantAddressRegion);
		return restaurantAddressRegion;
	}
}
