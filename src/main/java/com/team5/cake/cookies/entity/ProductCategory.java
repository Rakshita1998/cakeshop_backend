package com.team5.cake.cookies.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="product_category")
//@Data -- known bug
@Getter
@Setter
public class ProductCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cat_id")
	private int id;
	
	@Column(name = "cat_name")
	private String categoryName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	private Set<product>products;
	
	
}

//CREATE TABLE  product_category (
//		  cat_id SERIAL PRIMARY KEY,
//		  cat_name VARCHAR(255) DEFAULT NULL
//		 )