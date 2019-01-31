package com.app.groceries.delivery.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name = "user_table")
@Table(name = "user_table")
public class UserModel {
@Id
@GeneratedValue
private int id;	
private	String fname;
private	String lname;
private String username;
private String password;
private String email; 
private	String mobile;
private	String feedback;
private String userType;
private String secretans;
private String returnedMsg;
private String exception;
private Date createdon;
private Boolean success;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getFeedback() {
	return feedback;
}
public void setFeedback(String feedback) {
	this.feedback = feedback;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
public String getReturnedMsg() {
	return returnedMsg;
}
public void setReturnedMsg(String returnedMsg) {
	this.returnedMsg = returnedMsg;
}
public String getException() {
	return exception;
}
public void setException(String exception) {
	this.exception = exception;
}
public Date getCreatedon() {
	return createdon;
}
public void setCreatedon(Date createdon) {
	this.createdon = createdon;
}
public Boolean getSuccess() {
	return success;
}
public void setSuccess(Boolean success) {
	this.success = success;
}
public String getSecretans() {
	return secretans;
}
public void setSecretans(String secretans) {
	this.secretans = secretans;
}

}