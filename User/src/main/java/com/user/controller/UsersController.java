package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.Users;
import com.user.service.UsersService;

@RestController
public class UsersController {
  @Autowired
  UsersService usersService;
  @GetMapping("/getAllUsers")
  public List <Users> getAllUsers(){
	  return usersService.getAllUsers();
  }
  @GetMapping("/getUserById/{userid}")
  public Users getUsers(@PathVariable("userid")int userid) {
	  return usersService.getUsersById(userid);
  }
  @DeleteMapping("/deleteBook/{bookid}")
  public int deleteUser(@PathVariable("userid")int userid) {
	  usersService.delete(userid);
	  return userid;
  }
  @PostMapping("/saveBook")
  public Users saveBook(@RequestBody Users users) {
	  usersService.saveorUpdate(users);
	  return users;
  }
  @PutMapping("/updateUser")
  public Users update (@RequestBody Users users) {
	  usersService.saveorUpdate(users);
	  return users;
  }
  
}
