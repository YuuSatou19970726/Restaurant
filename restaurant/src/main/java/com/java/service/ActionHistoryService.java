package com.java.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.ActionHistoryDao;
import com.java.entity.ActionHistory;

@Service
@Transactional
public class ActionHistoryService 
{
	@Autowired
	private ActionHistoryDao actionHistoryDao;
	
	public List<ActionHistory> findAll()
	{

		return actionHistoryDao.findAll();
	}
	
	public List<ActionHistory> findByRestaurantId(int restaurantId)
	{
		return actionHistoryDao.findAllByRestaurantId(restaurantId);
	}
	
	public ActionHistory createActionHistory(ActionHistory actionHistory)
	{
		return actionHistoryDao.create(actionHistory);
	}
	
	public ActionHistory deleteActionHistory(ActionHistory actionHistory)
	{
		return actionHistoryDao.delete(actionHistory);
	}
}
