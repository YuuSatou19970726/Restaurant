package com.java.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.ProductFoodStyle;

@Repository
public class ProductFoodStyleDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public List<ProductFoodStyle> findAll()
	{
		TypedQuery<ProductFoodStyle> query = getSession().createQuery("FROM ProductFoodStyle", ProductFoodStyle.class);
		List<ProductFoodStyle> productFoodStyles = query.getResultList();
		return productFoodStyles;
	}
	
	public ProductFoodStyle findById(int id)
	{
		ProductFoodStyle productFoodStyle = getSession().find(ProductFoodStyle.class, id);
		return productFoodStyle;
	}
	
	public ProductFoodStyle create(ProductFoodStyle productFoodStyle)
	{
		getSession().save(productFoodStyle);
		return productFoodStyle;
	}
	
	public ProductFoodStyle update(ProductFoodStyle productFoodStyle)
	{
		getSession().update(productFoodStyle);
		return productFoodStyle;
	}
	
	public ProductFoodStyle delete(ProductFoodStyle productFoodStyle)
	{
		getSession().delete(productFoodStyle);
		return productFoodStyle;
	}
}
