package org.inayat.novo.ringelweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "helpText_table")
@Table(name = "helpText_table")
public class HelpTextModel {
	@Id
	@GeneratedValue
	private int id;
	private String disclaimerOnSignupPage;
	private String disclaimerOnPartnerPage;
	private String disclaimerOnSendmsgPage;
	private String returnedMsg;
	private String exception;
	private Boolean success;
	 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getDisclaimerOnSignupPage() {
		return disclaimerOnSignupPage;
	}
	public void setDisclaimerOnSignupPage(String disclaimerOnSignupPage) {
		this.disclaimerOnSignupPage = disclaimerOnSignupPage;
	}
	public String getDisclaimerOnPartnerPage() {
		return disclaimerOnPartnerPage;
	}
	public void setDisclaimerOnPartnerPage(String disclaimerOnPartnerPage) {
		this.disclaimerOnPartnerPage = disclaimerOnPartnerPage;
	}
	public String getDisclaimerOnSendmsgPage() {
		return disclaimerOnSendmsgPage;
	}
	public void setDisclaimerOnSendmsgPage(String disclaimerOnSendmsgPage) {
		this.disclaimerOnSendmsgPage = disclaimerOnSendmsgPage;
	}
	
	

}
