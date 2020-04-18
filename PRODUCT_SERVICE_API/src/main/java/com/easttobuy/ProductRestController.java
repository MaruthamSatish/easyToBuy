package com.easttobuy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("productAPI")
public class ProductRestController {
    @Autowired
	ProductRepository productRepository;
    @GetMapping("/products")
    public List<Product> getAllProducts(){
    	List<Product>  getProducts= new ArrayList<>();
    	productRepository.findAll().forEach(product->getProducts.add(product));
    	return getProducts;
    }
}
