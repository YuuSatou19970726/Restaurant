package com.java.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.Restaurant;

@Repository
public class RestaurantDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public List<Restaurant> findAll()
	{
		TypedQuery<Restaurant> query = getSession().createQuery("FROM Restaurant", Restaurant.class);
		List<Restaurant> restaurants = query.getResultList();
		return restaurants;
	}
	
	public List<Restaurant> findAllByCountryId(int countryId)
	{
		TypedQuery<Restaurant> query = getSession().createQuery("FROM Restaurant WHERE country.id = :countryId", Restaurant.class);
		query.setParameter("countryId", countryId);
		List<Restaurant> restaurants = query.getResultList();
		return restaurants;
	}
	
	public List<Restaurant> findAllByCityId(int cityId)
	{
		TypedQuery<Restaurant> query = getSession().createQuery("FROM Restaurant WHERE restaurantAddressCity.id = :cityId", Restaurant.class);
		query.setParameter("cityId", cityId);
		List<Restaurant> restaurants = query.getResultList();
		return restaurants;
	}
	
	public List<Restaurant> findAllByRegionId(int regionId)
	{
		TypedQuery<Restaurant> query = getSession().createQuery("FROM Restaurant WHERE restaurantAddressRegion.id = :regionId", Restaurant.class);
		query.setParameter("regionId", regionId);
		List<Restaurant> restaurants = query.getResultList();
		return restaurants;
	}
	
	public List<Restaurant> findAllByStreetId(int streetId)
	{
		TypedQuery<Restaurant> query = getSession().createQuery("FROM Restaurant WHERE restaurantAddressStreet.id = :streetId", Restaurant.class);
		query.setParameter("streetId", streetId);
		List<Restaurant> restaurants = query.getResultList();
		return restaurants;
	}
	
	public List<Restaurant> findAllByName(String name)
	{
		TypedQuery<Restaurant> query = getSession().createQuery("FROM Restaurant WHERE name = :name", Restaurant.class);
		query.setParameter("name", name);
		List<Restaurant> restaurants = query.getResultList();
		return restaurants;
	}
	
	public Restaurant findById(int id)
	{
		Restaurant restaurant = getSession().find(Restaurant.class, id);
		return restaurant;
	}
	
	public Restaurant create(Restaurant restaurant)
	{
		getSession().save(restaurant);
		return restaurant;
	}
	
	public Restaurant update(Restaurant restaurant)
	{
		getSession().update(restaurant);
		return restaurant;
	}
	
	public Restaurant delete(Restaurant restaurant)
	{
		getSession().delete(restaurant);
		return restaurant;
	}
}
