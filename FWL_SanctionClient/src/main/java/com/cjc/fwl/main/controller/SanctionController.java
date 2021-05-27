package com.cjc.fwl.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.fwl.main.model.Sanction;
import com.cjc.fwl.main.service.HomeService;
@CrossOrigin("*")
@RestController
public class SanctionController {

	@Autowired
	HomeService hs;
	
	@RequestMapping("/demo")
	public String demo()
	{
		return "success";
	}
	@GetMapping("/getsan")
	public List<Sanction> get()
	{
		List<Sanction> list=hs.getall();
		return list;
	}
	@PostMapping("/savesan")
	public String save(@RequestBody Sanction s)
	{
		hs.saverecord(s);
		return "Data Saved!!";
	}
}