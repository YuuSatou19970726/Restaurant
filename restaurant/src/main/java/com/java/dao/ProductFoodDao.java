package com.java.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.ProductFood;

@Repository
public class ProductFoodDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public List<ProductFood> findAll()
	{
		TypedQuery<ProductFood> query = getSession().createQuery("FROM ProductFood", ProductFood.class);
		List<ProductFood> productFoods = query.getResultList();
		return productFoods;
	}
	
	public List<ProductFood> findAllByRestaurantId(int restaurantId)
	{
		TypedQuery<ProductFood> query = getSession().createQuery("FROM ProductFood WHERE restaurant.id = :restaurantId", ProductFood.class);
		query.setParameter("restaurantId", restaurantId);
		List<ProductFood> productFoods = query.getResultList();
		return productFoods;
	}
	
	public List<ProductFood> findAllByCountryId(int countryId)
	{
		TypedQuery<ProductFood> query = getSession().createQuery("FROM ProductFood WHERE country.id = :countryId", ProductFood.class);
		query.setParameter("countryId", countryId);
		List<ProductFood> productFoods = query.getResultList();
		return productFoods;
	}
	
	public List<ProductFood> findAllByStyleId(int styleId)
	{
		TypedQuery<ProductFood> query = getSession().createQuery("FROM ProductFood WHERE productFoodStyle.id = :styleId", ProductFood.class);
		query.setParameter("styleId", styleId);
		List<ProductFood> productFoods = query.getResultList();
		return productFoods;
	}
	
	public List<ProductFood> findAllByName(String name)
	{
		TypedQuery<ProductFood> query = getSession().createQuery("FROM ProductFood WHERE name = :name", ProductFood.class);
		query.setParameter("name", name);
		List<ProductFood> productFoods = query.getResultList();
		return productFoods;
	}
	
	public ProductFood findById(int id)
	{
		ProductFood productFood = getSession().find(ProductFood.class, id);
		return productFood;
	}
	
	public ProductFood create (ProductFood productFood)
	{
		getSession().save(productFood);
		return productFood;
	}
	
	public ProductFood update (ProductFood productFood)
	{
		getSession().update(productFood);
		return productFood;
	}
	
	public ProductFood delete (ProductFood productFood)
	{
		getSession().delete(productFood);
		return productFood;
	}
}
