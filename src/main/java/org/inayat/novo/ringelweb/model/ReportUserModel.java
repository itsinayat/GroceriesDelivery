package org.inayat.novo.ringelweb.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "reportAbuse_table")
@Table(name = "reportAbuse_table")
public class ReportUserModel {
	@Id
	@GeneratedValue
	private int id;
	private int reportFrom;
	private int reportTo;
	private String message;
	private String returnedMsg;
	private String exception;
	private Date createdon;
	private Boolean success;
	private Boolean isExistingUser;
	
	private String name;
	private String Mobile;
	private String location;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getReportFrom() {
		return reportFrom;
	}
	public void setReportFrom(int reportFrom) {
		this.reportFrom = reportFrom;
	}
	public int getReportTo() {
		return reportTo;
	}
	public void setReportTo(int reportTo) {
		this.reportTo = reportTo;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
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
	public Boolean getIsExistingUser() {
		return isExistingUser;
	}
	public void setIsExistingUser(Boolean isExistingUser) {
		this.isExistingUser = isExistingUser;
	}
	
	
	
	
	
	
}
