package com.bus.service;

import com.bus.entity.User;
import com.bus.exception.UserException;

public interface UserService {

	public User createUser(User user) throws UserException;
	
}
