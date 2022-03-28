package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.entity.ProductCategory;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
		@GetMapping("/")
		public List<Product> findAll(){

			return service.findAll();
		}
		
		
		
		@PostMapping("/save")
		public void save(@RequestBody Product p) {
			
			service.save(p);
		}
		
//		@GetMapping("/{productid}")
//		public void deleteById(@PathVariable int productid) {
//			service.deleteById(productid);
//		}
//		
		@GetMapping("/{id}")
	public ProductCategory getProductCategory(@PathVariable("id") int id) {
			//ProductCategory pc=new ProductCategory();
			
			System.out.println("In product");
//			return "oo";
		return service.getProductCategory(id);
		
	}
	

}
