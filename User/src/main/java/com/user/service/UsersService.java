package com.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.Users;
import com.user.repository.UsersRepository;

@Service
public class UsersService {
 @Autowired
 UsersRepository usersRepository;
 public List<Users> getAllUsers(){
	 List <Users> users = new ArrayList<Users>();
	 usersRepository.findAll().forEach(users1 -> users.add(users1));
	 return users;
 }
 public Users getUsersById(int id) {
	 return usersRepository.findById(id);
 }
 public Users saveorUpdate(Users users) {
	 return usersRepository.save(users);
 }
 public int delete (int id) {
	 return id;
 }
 public Users update (Users users,int userid) {
	 return usersRepository.save(users);
 }
}
