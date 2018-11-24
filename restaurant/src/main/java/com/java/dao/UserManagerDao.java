package com.java.dao;

import java.util.List;

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
	
	public List<UserManager> findAll()
	{
		TypedQuery<UserManager> query = getSession().createQuery("FROM UserManager", UserManager.class);
		List<UserManager> userManagers = query.getResultList();
		return userManagers;
	}
	
	public List<UserManager> findAllByStyleId(int styleId)
	{
		TypedQuery<UserManager> query = getSession().createQuery("FROM UserManager WHERE userStyle.id = :styleId", UserManager.class);
		query.setParameter("styleId", styleId);
		List<UserManager> userManagers = query.getResultList();
		return userManagers;
	}
	
	public UserManager findByUserName(String userName)
	{
		TypedQuery<UserManager> query = getSession().createQuery("FROM UserManager WHERE userName = :userName", UserManager.class);
		query.setParameter("userName", userName);
		UserManager userManager = query.getSingleResult();
		return userManager;
	}
	
	public UserManager findById(int id)
	{
		UserManager userManager = getSession().find(UserManager.class, id);
		return userManager;
	}
	
	public UserManager create (UserManager userManager)
	{
		getSession().save(userManager);
		return userManager;
	}
	
	public UserManager update (UserManager userManager)
	{
		getSession().update(userManager);
		return userManager;
	}
	
	public UserManager delete (UserManager userManager)
	{
		getSession().delete(userManager);
		return userManager;
	}
}
