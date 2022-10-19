package com.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Users")
public class Users {
  public Users() {
	  super();
  }
  @Id
  @Column(name="user_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int userid;
  @Column(name = "user_name")
  private String username;
  @Column (name="expiry_date")
  private String expirydate;
public Users(int userid, String username, String expirydate) {
	super();
	this.userid = userid;
	this.username = username;
	this.expirydate = expirydate;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getExpirydate() {
	return expirydate;
}
public void setExpirydate(String expirydate) {
	this.expirydate = expirydate;
}
  
}
