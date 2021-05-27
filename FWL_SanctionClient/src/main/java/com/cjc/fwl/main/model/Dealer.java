package com.cjc.fwl.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dealer {

	@Id
	private int dlr_id;
	private String dlr_name;
	private String contact_no;
	private String account_no;
	private String bank_name;
	private String ifsc_code;
	private String bank_branch;
	
	public int getDlr_id() {
		return dlr_id;
	}
	public void setDlr_id(int dlr_id) {
		this.dlr_id = dlr_id;
	}
	public String getDlr_name() {
		return dlr_name;
	}
	public void setDlr_name(String dlr_name) {
		this.dlr_name = dlr_name;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public String getBank_branch() {
		return bank_branch;
	}
	public void setBank_branch(String bank_branch) {
		this.bank_branch = bank_branch;
	}
}