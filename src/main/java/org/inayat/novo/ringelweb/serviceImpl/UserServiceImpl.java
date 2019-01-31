package org.inayat.novo.ringelweb.serviceImpl;
import java.util.Date;
import java.util.List;

import org.inayat.novo.ringelweb.dao.UserDao;
import org.inayat.novo.ringelweb.daoImpl.UserDaoImpl;
import org.inayat.novo.ringelweb.model.FaqModel;
import org.inayat.novo.ringelweb.model.GfBfDataModel;
import org.inayat.novo.ringelweb.model.MessageModel;
import org.inayat.novo.ringelweb.model.UserModel;
import org.inayat.novo.ringelweb.service.UserService;

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
	
	
	@Override
	public GfBfDataModel doSaveGfBfData(GfBfDataModel gfBfDataModel) {
		System.out.println("Entered in fBfserviceImpl:doSaveGfBfData.");
	 UserDao dao=new UserDaoImpl();
	    gfBfDataModel= dao.saveGfBfData(gfBfDataModel);
		return gfBfDataModel;
	
	}

	@Override
	public List<FaqModel> getFaqService() {
	   UserDao dao=new UserDaoImpl();
		List<FaqModel> list=dao.getFaq();
		return list;
	

	}

	@Override
	public MessageModel sendMessage(MessageModel message) {
		System.out.println("Entered in userSignUpServiceImpl.send message.");
	    UserDao dao=new UserDaoImpl();
		message.setCreatedon(new Date());
	    message=dao.sendMessage(message);
	    return message;
	}
	
	

}
