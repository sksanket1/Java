package com.cjc.fwl.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Disbursement {
	
	@Id
	private int disbursement_id;
	private String payment_type;
	private String payment_date;
	private String transfer_amount;
	@OneToOne
	private Sanction sanction;

	public int getDisbursement_id() {
		return disbursement_id;
	}
	public void setDisbursement_id(int disbursement_id) {
		this.disbursement_id = disbursement_id;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public String getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}
	public String getTransfer_amount() {
		return transfer_amount;
	}
	public void setTransfer_amount(String transfer_amount) {
		this.transfer_amount = transfer_amount;
	}
	public Sanction getSanction() {
		return sanction;
	}
	public void setSanction(Sanction sanction) {
		this.sanction = sanction;
	}
}