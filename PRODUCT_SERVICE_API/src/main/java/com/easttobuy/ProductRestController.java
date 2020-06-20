package com.easttobuy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/productAPI")
public class ProductRestController {

	@Autowired
	ProductRepository productRepository;

	
	@Autowired
	private CouponClient couponClient;
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		List<Product> getProducts = new ArrayList<>();
		productRepository.findAll().forEach(product -> getProducts.add(product));
	
		return getProducts;
	}
    @HystrixCommand(fallbackMethod ="sendErrorResponse")
	@PostMapping("/createProduct")
	public Product create(@RequestBody Product product) {
		Coupon coupon = couponClient.findByCouponCode(product.getCouponCode());
		product.setProductPrice(product.getProductPrice()-coupon.getDiscount());
	    product.setDiscountAmount(coupon.getDiscount());
		Product returnProduct=productRepository.save(product);
		return returnProduct; 
	}

	@GetMapping("/products/{categoryId}")
	public List<Product> getAllProductsByCategoryId(@PathVariable("categoryId") Integer couponCode) {
		List<Product> getProducts = new ArrayList<>();
		productRepository.findByCategoryId(couponCode).forEach(product -> getProducts.add(product));
		
		return getProducts;
	}
	@GetMapping( "/coupon/{couponCode}")
	public Coupon findByCouponCode(@PathVariable("couponCode") String couponCode){
		Coupon coupon=couponClient.findByCouponCode(couponCode);
		return coupon;
		}
	public Product sendErrorResponse(Product product) {
		return product; 
	}
}
