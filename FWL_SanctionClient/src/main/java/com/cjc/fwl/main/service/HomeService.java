package com.cjc.fwl.main.service;

import java.util.List;

import com.cjc.fwl.main.model.Disbursement;
import com.cjc.fwl.main.model.Sanction;


public interface HomeService {

	public List<Sanction> getall();

	public void saverecord(Sanction s);

	public List<Disbursement> getdis();

	public void savedisdata(Disbursement d);



}