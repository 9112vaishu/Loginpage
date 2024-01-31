package com.entites;
/* this is pojo class 
 rules for pojo class
 1)every variable is private
 2) constructor are use
 3)use getter setter method*/
public class User {
 
private int id;
 private String uname;
 private String email;
 private String password;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
//public User(int id, String uname, String email, String password) {
//		super();
//		this.id = id;
//		this.uname = uname;
//		this.email = email;
//		this.password = password;
//	}
public User( String uname, String email, String password) {
	super();
	this.uname = uname;
	this.email = email;
	this.password = password;
}
//public int getId() {
//	return id;
//}
//public void setId(int id) {
//	this.id = id;
//}
public String getuname() {
	return uname;
}
public void setuname(String uname) {
	this.uname = uname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
