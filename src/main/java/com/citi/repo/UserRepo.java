package com.citi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citi.model.User;

@Repository
public interface UserRepo extends  JpaRepository<User,String>{
	
User findByUserId(String userId);
}
 