package com.java.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.ManagerRestaurantDao;
import com.java.entity.ManagerRestaurant;

@Service
@Transactional
public class ManagerRestaurantService 
{
	@Autowired
	ManagerRestaurantDao managerRestaurantDao;
	
	public List<ManagerRestaurant> findAll()
	{
		return managerRestaurantDao.findAll();
	}
	
	public ManagerRestaurant findManagerRestaurantId(int managerRestaurantId)
	{
		return managerRestaurantDao.findById(managerRestaurantId);
	}
	
	public ManagerRestaurant createManagerRestaurant(ManagerRestaurant managerRestaurant)
	{
		return managerRestaurantDao.create(managerRestaurant);
	}
	
	public ManagerRestaurant updateManagerRestaurant(ManagerRestaurant managerRestaurant)
	{
		return managerRestaurantDao.update(managerRestaurant);
	}
	
	public ManagerRestaurant deleteManagerRestaurant(ManagerRestaurant managerRestaurant)
	{
		return managerRestaurantDao.delete(managerRestaurant);
	}
}
