package ctseproject.productservice.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ctseproject.productservice.domain.Products;
import ctseproject.productservice.repository.ProductsRepository;


/**
 * @author : M.A.M Nusky
 * Registration Number : IT19167442
 */


@Service
public class ProductApi {
	
	 private static final Logger logger = LoggerFactory.getLogger("ProductService.class");
	 
	 @Autowired
	 private ProductsRepository sellerrepo;
	
	 
	    public int saveImage(Products products) {
	        try{
	        	sellerrepo.save(products);
	            return 1;
	        } catch (Exception e) {
	            logger.error("Error", e);
	            return 0;
	        }
	    }
	
}
