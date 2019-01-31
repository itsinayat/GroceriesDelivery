package org.inayat.novo.ringelweb.service;

import java.util.List;

import org.inayat.novo.ringelweb.model.FaqModel;
import org.inayat.novo.ringelweb.model.GfBfDataModel;
import org.inayat.novo.ringelweb.model.MessageModel;
import org.inayat.novo.ringelweb.model.ReportUserModel;
import org.inayat.novo.ringelweb.model.UserModel;

public interface UserService {

	public UserModel doLogin(UserModel user);

	public UserModel doRegister(UserModel user);

	public String getPassword(String secretans, String secretans2);

	public GfBfDataModel doSaveGfBfData(GfBfDataModel data);

	public List<FaqModel> getFaqService();

	public MessageModel sendMessage(MessageModel message);

}
