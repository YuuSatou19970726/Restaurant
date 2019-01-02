package com.java.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.CountryDao;
import com.java.entity.Country;
import com.java.model.RestaurantModel;

@Service
@Transactional
public class CountryService 
{
	@Autowired
	private CountryDao countryDao;
	
	public List<Country> findAll()
	{
		return countryDao.findAll();
	}
	
	public Country findCountryId(int countryId)
	{
		return countryDao.findById(countryId);
	}
	
	public Country createCountry(RestaurantModel restaurantModel)
	{
		Country country = new Country();
		restaurantModel.toCountry(country);
		
		return countryDao.create(country);
	}
	
	public Country updateCountry(RestaurantModel restaurantModel)
	{
		Country country = new Country();
		restaurantModel.toCountry(country);
		
		return countryDao.update(country);
	}
	
	public Country deleteCountry(RestaurantModel restaurantModel)
	{
		Country country = new Country();
		restaurantModel.toCountry(country);
		
		return countryDao.delete(country);
	}
}
