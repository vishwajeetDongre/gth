package com.example.GirisTechHub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.GirisTechHub.entity.Register;
import com.example.GirisTechHub.service.RegisterService;

@RestController
public class RegisterController {
	@Autowired
	RegisterService regservice;
	@PostMapping(value="/save")
	public String isregister(@RequestBody Register register)
	{
		boolean b=regservice.isregister(register);
		if(b)
		{
			return "Data saved...";
		}else
		{
			return "data not saved";
		}
	}

}
