package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Registration;

@Repository
public interface RegistrationDao extends JpaRepository<Registration, Integer>{

	List<Registration> findByUsername(String username);
}
