package com.cjc.fwl.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sanction {

	@Id
	private int	cust_id;
	private String cust_name;
	private String loan_id;
	private String loan_no;
	private String	loan_amount;
	private String emi;
	private String tenure;
	private String sanction;
	private String remark;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Dealer dealer_id;

	
	
	public String getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(String loan_id) {
		this.loan_id = loan_id;
	}

	public String getLoan_no() {
		return loan_no;
	}

	public void setLoan_no(String loan_no) {
		this.loan_no = loan_no;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	
	public String getLoan_amount() {
		return loan_amount;
	}

	public void setLoan_amount(String loan_amount) {
		this.loan_amount = loan_amount;
	}

	public String getEmi() {
		return emi;
	}

	public void setEmi(String emi) {
		this.emi = emi;
	}

	public String getTenure() {
		return tenure;
	}

	public void setTenure(String tenure) {
		this.tenure = tenure;
	}

	public String getSanction() {
		return sanction;
	}

	public void setSanction(String sanction) {
		this.sanction = sanction;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Dealer getDealer_id() {
		return dealer_id;
	}

	public void setDealer_id(Dealer dealer_id) {
		this.dealer_id = dealer_id;
	}
}