package com.java.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.ProductFoodDao;
import com.java.entity.ProductFood;
import com.java.model.ProductFoodModel;

@Service
@Transactional
public class ProductFoodService 
{
	@Autowired
	private ProductFoodDao productFoodDao;
	
	public List<ProductFood> findAll()
	{
		return productFoodDao.findAll();
	}
	
	public List<ProductFood> findAllByRestaurantId(int restaurantId)
	{
		return productFoodDao.findAllByRestaurantId(restaurantId);
	}
	
	public List<ProductFood> findAllByCountryId(int countryId)
	{
		return productFoodDao.findAllByCountryId(countryId);
	}
	
	public List<ProductFood> findAllByStyleId(int styleId)
	{
		return productFoodDao.findAllByStyleId(styleId);
	}
	
	public List<ProductFood> findAllByName(String name)
	{
		return productFoodDao.findAllByName(name);
	}
	
	public ProductFood createProductFood(ProductFoodModel productFoodModel)
	{
		ProductFood productFood = new ProductFood();
		productFoodModel.toProductFood(productFood);
		
		return productFoodDao.create(productFood);
	}
	
	public ProductFood updateProductFood(ProductFoodModel productFoodModel)
	{
		ProductFood productFood = new ProductFood();
		productFoodModel.toProductFood(productFood);
		
		return productFoodDao.create(productFood);
	}
	
	public ProductFood deleteProductFood(ProductFoodModel productFoodModel)
	{
		ProductFood productFood = new ProductFood();
		productFoodModel.toProductFood(productFood);
		
		return productFoodDao.create(productFood);
	}
}
