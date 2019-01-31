package org.inayat.novo.ringelweb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "faq_table")
@Table(name = "faq_table")
public class FaqModel {
  
	@Id
	private int id;
	private String question;
	private String answer;
	private String returnedMsg;
	private String exception;
	private Boolean success;
	
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
