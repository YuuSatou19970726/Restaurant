package com.java.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.Country;

@Repository
public class CountryDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public List<Country> findAll()
	{
		TypedQuery<Country> query = getSession().createQuery("FROM Country", Country.class);
		List<Country> countries = query.getResultList();
		return countries;
	}
	
	public Country findById(int id)
	{
		Country country = getSession().find(Country.class, id);
		return country;
	}
	
	public Country create(Country country)
	{
		getSession().save(country);
		return country;
	}
	
	public Country update(Country country)
	{
		getSession().update(country);
		return country;
	}
	
	public Country delete(Country country)
	{
		getSession().delete(country);
		return country;
	}
}
