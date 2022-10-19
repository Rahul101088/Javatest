package com.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.user.model.Users;

public interface UsersRepository extends CrudRepository<Users, Integer>{
	Users findById(int i);
  
}
