package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.Dao.RegistrationDao;
import com.example.demo.entity.Registration;
import com.example.demo.service.RegistrationServiceImpl;

import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;



@SpringBootTest
class FacebookAppApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private RegistrationServiceImpl service;

	@MockBean
	private RegistrationDao repo;

	@Test
	public void saveRegistraionTest() {
		Registration registration = new Registration(2,"Jiyaa","jiyaa","ss","iyaa@d.com","Pune",123445);
		when(repo.save(registration)).thenReturn(registration);
		assertEquals(registration, service.addRegistration(registration));	
	}
	
	@Test
	public void getRegistrationTest() {
		when(repo.findAll()).thenReturn(Stream
				.of(new Registration(2,"Jiyaa","jiyaa","ss","iyaa@d.com","Pune",123445), new Registration(2,"Jiyaa","jiyaa","ss","iyaa@d.com","Pune",123445)).collect(Collectors.toList()));
		assertEquals(2, service.getfindAllRegistration().size());
	}

	@Test
	public void getUserNameTest() {
		String username = "jiyaa";
		when(repo.findByUsername(username))
				.thenReturn(Stream.of(new Registration(2,"Jiyaa","jiyaa","ss","iyaa@d.com","Pune",123445)).collect(Collectors.toList()));
		assertEquals(1, service.findByUsername(username).size());
	}

	@IgnoreForBinding
	public void deleteTest() {
		Registration registration = new Registration(2,"Jiyaa","jiyaa","ss","iyaa@d.com","Pune",123445);
		service.delete(registration);
		verify(repo, times(1)).delete(registration);
	}


	
}
