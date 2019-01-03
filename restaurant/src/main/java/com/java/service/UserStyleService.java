package com.java.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.UserStyleDao;
import com.java.entity.UserStyle;
import com.java.model.UserInformationModel;

@Service
@Transactional
public class UserStyleService 
{
	@Autowired
	private UserStyleDao userStyleDao;
	
	public List<UserStyle> findAll()
	{
		return userStyleDao.findAll();
	}
	
	public UserStyle findUserStyleId(int userStyleId)
	{
		return userStyleDao.findById(userStyleId);
	}
	
	public UserStyle createUserStyle(UserInformationModel userInformationModel)
	{
		UserStyle userStyle = new UserStyle();
		userInformationModel.toUserStyle(userStyle);
		
		return userStyleDao.create(userStyle);
	}
	
	public UserStyle updateUserStyle(UserInformationModel userInformationModel)
	{
		UserStyle userStyle = new UserStyle();
		userInformationModel.toUserStyle(userStyle);
		
		return userStyleDao.update(userStyle);
	}
	
	public UserStyle deleteUserStyle(UserInformationModel userInformationModel)
	{
		UserStyle userStyle = new UserStyle();
		userInformationModel.toUserStyle(userStyle);
		
		return userStyleDao.delete(userStyle);
	}
}
