package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Dao.Productrepositorys;
import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.entity.ProductCategory;

//import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class ProductService {
	//private static final String productCircuitBreaker="";
	
	@Autowired
	private Productrepositorys prodrepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	public List<Product> findAll(){
		
		return prodrepo.findAll();
	}
	
	public void save(Product p) {
		prodrepo.save(p);
	}
	
//	public void deleteById(int productid) {
//		prodrepo.deleteById(productid);
//	}

	
	//@CircuitBreaker(name=productCircuitBreaker,fallbackMethod="getfallbackmethod")
	public ProductCategory getProductCategory(int productid) {
		Product product=prodrepo.findById(productid).get();
		System.out.println(product);
		
		String url="http://localhost:8082/category/" + product.getCategoryid();
		System.out.println(url);
		
		Category category=restTemplate.getForObject(url, Category.class);
		System.out.println(category);
		ProductCategory catPro=new ProductCategory(product,category);
		
		
		return catPro;
		
			
		}
	
	public ProductCategory getfallBackMethod(Exception e) {
		return new ProductCategory();
	}
	

//	public ProductCategory getUserDetailsWithDepartment(int productid) {
//		Product product = prodrepo.findById(productid).get();
//		String url = "http://localhost:8081/products/" + product.getCategoryid();
//		
//		Category cate = restTemplate.getForObject(url, Category.class);
//		
//		ProductCategory prod_cat= new ProductCategory(product,cate);
//		
//		return prod_cat;
//	}
}