package org.inayat.novo.ringelweb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "celebration_table")
@Table(name = "celebration_table")
public class CelebrationModel {

	@Id
	private int id;
	private String celebrationDayName;
	private String celebrationDayDate;
	private String celebrationText;
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

	public String getCelebrationDayName() {
		return celebrationDayName;
	}
	public void setCelebrationDayName(String celebrationDayName) {
		this.celebrationDayName = celebrationDayName;
	}

	public String getCelebrationDayDate() {
		return celebrationDayDate;
	}
	public void setCelebrationDayDate(String celebrationDayDate) {
		this.celebrationDayDate = celebrationDayDate;
	}
	public String getCelebrationText() {
		return celebrationText;
	}
	public void setCelebrationText(String celebrationText) {
		this.celebrationText = celebrationText;
	}

}
