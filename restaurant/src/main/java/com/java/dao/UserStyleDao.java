package com.java.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.UserStyle;

@Repository
public class UserStyleDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public List<UserStyle> findAll()
	{
		TypedQuery<UserStyle> query = getSession().createQuery("FROM UserStyle", UserStyle.class);
		List<UserStyle> userStyles = query.getResultList();
		return userStyles;
	}
	
	public UserStyle findById(int id)
	{
		UserStyle userStyle = getSession().find(UserStyle.class, id);
		return userStyle;
	}
	
	public UserStyle create(UserStyle userStyle)
	{
		getSession().save(userStyle);
		return userStyle;
	}
	
	public UserStyle update(UserStyle userStyle)
	{
		getSession().update(userStyle);
		return userStyle;
	}
	
	public UserStyle delete(UserStyle userStyle)
	{
		getSession().delete(userStyle);
		return userStyle;
	}
}
