package com.bus.service;

import java.util.List;

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
		

		User u= uRepo.save(user);
		return u;
	}


	@Override
	public User updateUser(User user) throws UserException {
		// TODO Auto-generated method stub
		
		
		return null;
	}


	@Override
	public User deleteUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User viewUser(int userid) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<User> viewAllUser() throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

}
