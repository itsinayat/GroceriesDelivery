package com.app.groceries.delivery.dao;

import com.app.groceries.delivery.model.UserModel;

public  interface UserDao {
	
	public UserModel doSave(UserModel model);

	public UserModel doAuthenticate(UserModel userModel);
	

	public UserModel getUserDataByUserId(int id);

	public String getPasswod(String username,String secretans);
	
	
	
}
