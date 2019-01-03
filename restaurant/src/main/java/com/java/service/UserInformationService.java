package com.java.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.UserInformationDao;
import com.java.entity.UserInformation;
import com.java.model.UserInformationModel;

@Service
@Transactional
public class UserInformationService 
{
	@Autowired
	private UserInformationDao userInformationDao;
	
	public List<UserInformation> findAllByName(String name)
	{
		return userInformationDao.findAllByName(name);
	}
	
	public UserInformation findByUserManagerId(int userManagerId)
	{
		return userInformationDao.findByUserManagerId(userManagerId);
	}
	
	public UserInformation findByUserInformationId(int userInformationId)
	{
		return userInformationDao.findById(userInformationId);
	}
	
	public UserInformation createUserInformation(UserInformationModel userInformationModel)
	{
		UserInformation userInformation = new UserInformation();
		userInformationModel.toUserInformation(userInformation);
		
		return userInformationDao.create(userInformation);
	}
	
	public UserInformation updateUserInformation(UserInformationModel userInformationModel)
	{
		UserInformation userInformation = new UserInformation();
		userInformationModel.toUserInformation(userInformation);
		
		return userInformationDao.update(userInformation);
	}
	
	public UserInformation deleteUserInformation(UserInformationModel userInformationModel)
	{
		UserInformation userInformation = new UserInformation();
		userInformationModel.toUserInformation(userInformation);
		
		return userInformationDao.delete(userInformation);
	}
}
