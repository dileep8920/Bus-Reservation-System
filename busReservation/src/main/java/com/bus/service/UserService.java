package com.bus.service;

import java.util.List;

import com.bus.entity.User;
import com.bus.exception.UserException;

public interface UserService {

	public User createUser(User user) throws UserException;
	
	public User updateUser(User user) throws UserException;
	
	public User deleteUser(User user) throws UserException;
	
    public User viewUser(int userid) throws UserException;
	
	public List<User> viewAllUser() throws UserException ;
}
