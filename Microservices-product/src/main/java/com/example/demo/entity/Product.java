package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private Integer productid;
	
	@Column(name="product_name")
	private String productname;
	
	@Column(name="unit_price")
	private Integer unitprice;
	
	@Column(name="category_id")
	private Integer categoryid;

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Integer getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(Integer unitprice) {
		this.unitprice = unitprice;
	}

	public Integer getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	public Product(Integer productid, String productname, Integer unitprice, Integer categoryid) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.unitprice = unitprice;
		this.categoryid = categoryid;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", unitprice=" + unitprice
				+ ", categoryid=" + categoryid + "]";
	}
	
	
}
