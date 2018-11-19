package com.java.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.java.dao.UserManagerDao;
import com.java.entity.UserManager;

@Service
public class UserDetailsServiceImpl implements UserDetailsService
{
	@Autowired
	private UserManagerDao userManagerDao;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException
	{
		UserManager userManager = userManagerDao.findByUserName(userName);
		if(userManager==null)
			throw new UsernameNotFoundException(userName + " not found!");
		
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		UserDetails user = new User(userManager.getUserName(), userManager.getPassword(), authorities);
		return user;
	}
}
