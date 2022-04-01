package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.RegistrationDao;
import com.example.demo.entity.Registration;

@Service
public class RegistrationServiceImpl {

	@Autowired
	RegistrationDao dao;
	
	public Registration addRegistration(Registration registration) {
		return dao.save(registration);
		
	}
	
	public List<Registration> getfindAllRegistration() {
		List<Registration> reg= dao.findAll();
		
		return reg;
	}
	
	
	public void delete(Registration reg) {
		dao.delete(reg);
	}
	
	public List<Registration> findByUsername(String username){
		return dao.findByUsername(username);
	}
}
