package com.example.demo.entity;

public class ProductCategory {
	
	private Product product;
	private Category category;
	
	@Override
	public String toString() {
		return "ProductCategory [product=" + product + ", category=" + category + "]";
	}
	public ProductCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductCategory(Product product, Category category) {
		super();
		this.product = product;
		this.category = category;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

}
