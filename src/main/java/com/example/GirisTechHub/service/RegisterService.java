package com.example.GirisTechHub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GirisTechHub.entity.Register;
import com.example.GirisTechHub.repository.RegisterRepo;

@Service("regservice")
public class RegisterService {
	@Autowired
	RegisterRepo registerRepo;
	public boolean isregister(Register register)
	{
		Register r=registerRepo.save(register);
		if(r!=null)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
}
