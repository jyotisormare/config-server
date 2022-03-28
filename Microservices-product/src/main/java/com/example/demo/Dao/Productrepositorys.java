package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;
import com.example.demo.entity.ProductCategory;

public interface Productrepositorys extends JpaRepository<Product, Integer>{
	
	 //ProductCategory getProductCategory(int productid);

}
