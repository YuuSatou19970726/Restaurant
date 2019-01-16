package com.java.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.ProductFoodSumDao;
import com.java.entity.ProductFoodSum;

@Service
@Transactional
public class ProductFoodSumService
{
	@Autowired
	private ProductFoodSumDao productFoodSumDao;
	
	public List<ProductFoodSum> findAll()
	{
		return productFoodSumDao.findAll();
	}
	
	public List<ProductFoodSum> findAllByRestaurantId(int restaurantId)
	{
		return productFoodSumDao.findAllByRestaurantId(restaurantId);
	}
	
	public ProductFoodSum findByProductFoodSumId(int productFoodSumId)
	{
		return productFoodSumDao.findById(productFoodSumId);
	}
	
	public ProductFoodSum createProductFoodSum(ProductFoodSum productFoodSum)
	{
		return productFoodSumDao.create(productFoodSum);
	}
	
	public ProductFoodSum updateProductFoodSum(ProductFoodSum productFoodSum)
	{
		return productFoodSumDao.update(productFoodSum);
	}
	
	public ProductFoodSum deleteProductFoodSum(ProductFoodSum productFoodSum)
	{
		return productFoodSumDao.delete(productFoodSum);
	}
}
