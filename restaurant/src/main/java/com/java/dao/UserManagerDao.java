package com.java.dao;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.UserManager;

@Repository
public class UserManagerDao
{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public UserManager findByUserName(String userName)
	{
		TypedQuery<UserManager> query = getSession().createQuery("FROM UserManager WHERE userName = :userName", UserManager.class);
		query.setParameter("userName", userName);
		UserManager userManager = query.getSingleResult();
		return userManager;
	}
}
