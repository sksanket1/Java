package com.cjc.fwl.main.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.fwl.main.model.Disbursement;
import com.cjc.fwl.main.service.HomeService;

@CrossOrigin("*")
@RestController
public class DisbursementController {

	@Autowired
	HomeService hs;
	
	@GetMapping("/getdis")
	public List<Disbursement> getdisdata()
	{
		List<Disbursement> disdata=hs.getdis();
		return disdata;
	}
	
	@PostMapping("/savedis")
	public String savedata(@RequestBody Disbursement d)
	{
		hs.savedisdata(d);
		return "Disbursement saved!";
	}
}
