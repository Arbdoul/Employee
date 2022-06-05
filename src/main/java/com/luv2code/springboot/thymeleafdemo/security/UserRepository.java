package com.luv2code.springboot.thymeleafdemo.security;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends CrudRepository<User, Integer> {
	
	@Query("SELECT u FROM User u WHERE u.username = :username")
	public User getUserByUserName(@Param("username") String username);

}
