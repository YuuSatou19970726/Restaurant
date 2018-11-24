package com.java.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.UserInformation;

@Repository
public class UserInformationDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public List<UserInformation> findAllByName(String name)
	{
		TypedQuery<UserInformation> query = getSession().createQuery("FROM UserInformation WHERE fullName = :name", UserInformation.class);
		query.setParameter("name", name);
		List<UserInformation> userInformations = query.getResultList();
		return userInformations;
	}
	
	public UserInformation findByUserManagerId(int userManagerId)
	{
		TypedQuery<UserInformation> query = getSession().createQuery("FROM UserInformation WHERE userManager.id = :userManagerId", UserInformation.class);
		query.setParameter("userManagerId", userManagerId);
		UserInformation userInformation = query.getSingleResult();
		return userInformation;
	}
	
	public UserInformation findById(int id)
	{
		UserInformation userInformation = getSession().find(UserInformation.class, id);
		return userInformation;
	}
	
	public UserInformation create(UserInformation userInformation)
	{
		getSession().save(userInformation);
		return userInformation;
	}
	
	public UserInformation update(UserInformation userInformation)
	{
		getSession().update(userInformation);
		return userInformation;
	}
	
	public UserInformation delete(UserInformation userInformation)
	{
		getSession().delete(userInformation);
		return userInformation;
	}
}
