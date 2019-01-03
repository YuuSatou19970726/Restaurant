package com.java.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.UserManagerDao;
import com.java.entity.UserManager;
import com.java.model.UserInformationModel;

@Service
@Transactional
public class UserManagerService 
{
	@Autowired
	private UserManagerDao userManagerDao;
	
	public List<UserManager> findAll()
	{
		return userManagerDao.findAll();
	}
	
	public List<UserManager> findAllByStyleId(int styleId)
	{
		return userManagerDao.findAllByStyleId(styleId);
	}
	
	public UserManager findByName(String name)
	{
		return userManagerDao.findByUserName(name);
	}
	
	public UserManager findByUserManagerId(int userManagerId)
	{
		return userManagerDao.findById(userManagerId);
	}
	
	public UserManager createUserManager(UserInformationModel userInformationModel)
	{
		UserManager userManager =  new UserManager();
		userInformationModel.toUserManager(userManager);
		
		return userManagerDao.create(userManager);
	}
	
	public UserManager updateUserManager(UserInformationModel userInformationModel)
	{
		UserManager userManager =  new UserManager();
		userInformationModel.toUserManager(userManager);
		
		return userManagerDao.update(userManager);
	}
	
	public UserManager deleteUserManager(UserInformationModel userInformationModel)
	{
		UserManager userManager =  new UserManager();
		userInformationModel.toUserManager(userManager);
		
		return userManagerDao.delete(userManager);
	}
}
