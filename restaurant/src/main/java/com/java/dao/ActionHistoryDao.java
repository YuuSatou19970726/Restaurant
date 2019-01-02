package com.java.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.entity.ActionHistory;

@Repository
public class ActionHistoryDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	public List<ActionHistory> findAll()
	{
		TypedQuery<ActionHistory> query = getSession().createQuery("FROM ActionHistory", ActionHistory.class);
		List<ActionHistory> actionHistories = query.getResultList();
		return actionHistories;
	}

	public List<ActionHistory> findAllByRestaurantId(int restaurantId)
	{
		TypedQuery<ActionHistory> query = getSession().createQuery("FROM ActionHistory WHERE restaurant.id = :restaurantId", ActionHistory.class);
		query.setParameter("restaurantId", restaurantId);
		List<ActionHistory> actionHistories = query.getResultList();
		return actionHistories;
	}
	
	public ActionHistory create(ActionHistory actionHistory)
	{
		getSession().save(actionHistory);
		return actionHistory;
	}
	
	public ActionHistory delete(ActionHistory actionHistory)
	{
		getSession().delete(actionHistory);
		return actionHistory;
	}
}
