package com.java.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.ManagerRestaurant;

@Repository
public class ManagerRestaurantDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public List<ManagerRestaurant> findAll()
	{
		TypedQuery<ManagerRestaurant> query = getSession().createQuery("FROM ManagerRestaurant", ManagerRestaurant.class);
		List<ManagerRestaurant> managerRestaurants = query.getResultList();
		return managerRestaurants;
	}
	
	public ManagerRestaurant findById(int id)
	{
		ManagerRestaurant managerRestaurant = getSession().find(ManagerRestaurant.class, id);
		return managerRestaurant;
	}
	
	public ManagerRestaurant create(ManagerRestaurant managerRestaurant)
	{
		getSession().save(managerRestaurant);
		return managerRestaurant;
	}
	
	public ManagerRestaurant update(ManagerRestaurant managerRestaurant)
	{
		getSession().update(managerRestaurant);
		return managerRestaurant;
	}
	
	public ManagerRestaurant delete(ManagerRestaurant managerRestaurant)
	{
		getSession().delete(managerRestaurant);
		return managerRestaurant;
	}
}
