package org.inayat.novo.ringelweb.dao;

import java.util.List;

import org.inayat.novo.ringelweb.model.FaqModel;
import org.inayat.novo.ringelweb.model.GfBfDataModel;
import org.inayat.novo.ringelweb.model.MessageModel;
import org.inayat.novo.ringelweb.model.UserModel;

public  interface UserDao {
	
	public UserModel doSave(UserModel model);

	public UserModel doAuthenticate(UserModel userModel);
	

	public UserModel getUserDataByUserId(int id);

	public String getPasswod(String username,String secretans);
	

	public GfBfDataModel saveGfBfData(GfBfDataModel gfBfDataModel);

	public List<FaqModel> getFaq();

	public MessageModel sendMessage(MessageModel message);
	
	
	
}
