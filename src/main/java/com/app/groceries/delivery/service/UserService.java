package com.app.groceries.delivery.service;

import com.app.groceries.delivery.model.UserModel;

public interface UserService {

	public UserModel doLogin(UserModel user);

	public UserModel doRegister(UserModel user);

	public String getPassword(String secretans, String secretans2);
}
