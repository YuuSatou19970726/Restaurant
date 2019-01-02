package com.java.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.ProductFoodStyleDao;
import com.java.entity.ProductFoodStyle;
import com.java.model.ProductFoodModel;

@Service
@Transactional
public class ProductFoodStyleService 
{
	@Autowired
	private ProductFoodStyleDao productFoodStyleDao;
	
	public List<ProductFoodStyle> findAll()
	{
		return productFoodStyleDao.findAll();
	}
	
	public ProductFoodStyle findByProductFoodStyleId(int productFoodStyleId)
	{
		return productFoodStyleDao.findById(productFoodStyleId);
	}
	
	public ProductFoodStyle createProductFoodStyle(ProductFoodModel productFoodModel)
	{
		ProductFoodStyle productFoodStyle = new ProductFoodStyle();
		productFoodModel.toProductFoodStyle(productFoodStyle);
		
		return productFoodStyleDao.create(productFoodStyle);
	}
	
	public ProductFoodStyle updateProductFoodStyle(ProductFoodModel productFoodModel)
	{
		ProductFoodStyle productFoodStyle = new ProductFoodStyle();
		productFoodModel.toProductFoodStyle(productFoodStyle);
		
		return productFoodStyleDao.update(productFoodStyle);
	}
	
	public ProductFoodStyle deleteProductFoodStyle(ProductFoodModel productFoodModel)
	{
		ProductFoodStyle productFoodStyle = new ProductFoodStyle();
		productFoodModel.toProductFoodStyle(productFoodStyle);
		
		return productFoodStyleDao.delete(productFoodStyle);
	}
}
