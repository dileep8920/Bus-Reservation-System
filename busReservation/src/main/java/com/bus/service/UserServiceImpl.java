package com.bus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.entity.User;
import com.bus.exception.UserException;
import com.bus.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserRepo uRepo;
	
	
	@Override
	public User createUser(User user) throws UserException {
		// TODO Auto-generated method stub
		

		
		return null;
	}

}
