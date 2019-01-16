package com.java.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.ProductFoodSum;

@Repository
public class ProductFoodSumDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public List<ProductFoodSum> findAll()
	{
		TypedQuery<ProductFoodSum> query = getSession().createQuery("FROM ProductFoodSum", ProductFoodSum.class);
		List<ProductFoodSum> productFoodSums = query.getResultList();
		return productFoodSums;
	}
	
	public List<ProductFoodSum> findAllByRestaurantId(int restaurantId)
	{
		TypedQuery<ProductFoodSum> query = getSession().createQuery("FROM ProductFoodSum WHERE restaurant.id = :restaurantId", ProductFoodSum.class);
		query.setParameter("restaurantId", restaurantId);
		List<ProductFoodSum> productFoodSums = query.getResultList();
		return productFoodSums;
	}
	
	public ProductFoodSum findById(int id)
	{
		ProductFoodSum productFoodSum = getSession().find(ProductFoodSum.class, id);
		return productFoodSum;
	}
	
	public ProductFoodSum create(ProductFoodSum productFoodSum)
	{
		getSession().save(productFoodSum);
		return productFoodSum;
	}
	
	public ProductFoodSum update(ProductFoodSum productFoodSum)
	{
		getSession().update(productFoodSum);
		return productFoodSum;
	}
	
	public ProductFoodSum delete(ProductFoodSum productFoodSum)
	{
		getSession().delete(productFoodSum);
		return productFoodSum;
	}
}
