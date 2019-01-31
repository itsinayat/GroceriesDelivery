package com.app.groceries.delivery.serviceImpl;
import java.util.Date;
import java.util.List;

import com.app.groceries.delivery.dao.UserDao;
import com.app.groceries.delivery.daoImpl.UserDaoImpl;
import com.app.groceries.delivery.model.UserModel;
import com.app.groceries.delivery.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public UserModel doRegister(UserModel userModel) {
		System.out.println("Entered in userSignUpServiceImpl:doRegister.");
	    UserDao dao=new UserDaoImpl();
		userModel.setCreatedon(new Date());
	    userModel=dao.doSave(userModel);
		return userModel;
	}

	@Override
	public UserModel doLogin(UserModel userModel) {
		System.out.println("Entered in userSignUpServiceImpl:dologin.");
		 UserDao dao=new UserDaoImpl();
		  UserModel result=dao.doAuthenticate(userModel);
		return result;
	}

	@Override
	public String getPassword(String username,String secretans) {
		 UserDao dao=new UserDaoImpl();
		String result=dao.getPasswod(username,secretans);
		return result;
	}
	
	
	

	
	

}
