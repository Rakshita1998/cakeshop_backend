package com.team5.cake.cookies.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.team5.cake.cookies.entity.ProductCategory;
import com.team5.cake.cookies.entity.product;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		
		RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
		
		HttpMethod[] theUnsupportedActions = {HttpMethod.PUT,HttpMethod.POST, HttpMethod.DELETE};
		
		//disable HTTP method for Product:put,post and delete
		config.getExposureConfiguration()
		    .forDomainType(product.class)
		    .withItemExposure((metadata, httpMethods)->httpMethods.disable(theUnsupportedActions))
		    .withCollectionExposure((metadata, httpMethods)->httpMethods.disable(theUnsupportedActions));
		
		
		
	}
	

}
