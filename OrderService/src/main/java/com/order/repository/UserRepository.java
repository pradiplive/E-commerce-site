package com.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.entity.User;
 

public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByUserName(String username);

}