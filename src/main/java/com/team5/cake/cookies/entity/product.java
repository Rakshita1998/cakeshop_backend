package com.team5.cake.cookies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "prod_id")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private ProductCategory category;

	@Column(name = "prod_name")
	private String name;

	@Column(name = "prod_desc")
	private String description;

	@Column(name = "prod_price")
	private double prodprice;
	
	@Column(name = "prod_weigth")
	private Integer prodweigth;

	@Column(name = "image_url")
	private String imageurl;

}

//CREATE TABLE product(
//		 prod_id SERIAL PRIMARY KEY, 
//			prod_name VARCHAR(250) DEFAULT NULL,
//			prod_desc VARCHAR(250) DEFAULT NULL,
//			prod_price DECIMAL(13,2) DEFAULT NULL,
//			image_url VARCHAR(225)DEFAULT NULL
//			
//		)