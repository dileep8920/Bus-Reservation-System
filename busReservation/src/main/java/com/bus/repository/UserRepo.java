package com.bus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	
}
