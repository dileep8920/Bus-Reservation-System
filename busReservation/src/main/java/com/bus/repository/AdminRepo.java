package com.bus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{

	Admin findByAdminName(String adminName);
}
