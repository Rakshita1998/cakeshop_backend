package com.team5.cake.cookies.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.team5.cake.cookies.entity.product;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<product, Integer> {

	
}
