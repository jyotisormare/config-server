package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Registration;
import com.example.demo.service.RegistrationServiceImpl;

@RestController
@RequestMapping("/registration")
public class Registrationcontroller {
	
	@Autowired
	private RegistrationServiceImpl service;
	
	@PostMapping("/save")
	public Registration saveRegistraion(@RequestBody Registration registration) {
		return service.addRegistration(registration);
	}
	
	@GetMapping("/get")
	public List<Registration> getAllRegistration(){
		return service.getfindAllRegistration();
		
	}
	
	@DeleteMapping("/delete")
	public void delete(@PathVariable Registration reg) {
		service.delete(reg);
	}
	
	@GetMapping("/{username}")
	public List<Registration> findByUserName(@PathVariable String username){
		return service.findByUsername(username);
	}

	
}
