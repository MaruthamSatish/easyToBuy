package com.easttobuy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productAPI")
public class ProductRestController {

	@Autowired
   ProductRepository productRepository;

	
	/*
	 * @Autowired private CouponClient couponClient;
	 */
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		List<Product> getProducts = new ArrayList<>();
		productRepository.findAll().forEach(product -> getProducts.add(product));
		System.out.println("getProducts" + getProducts.size());
		return getProducts;
	}

	/*
	 * @PostMapping public ResponseEntity<Product> create(@RequestBody Product
	 * product) { Coupon coupon =
	 * couponClient.findByCouponCode(product.getCouponCode());
	 * product.setDiscountAmount(coupon.getDiscount()); return
	 * ResponseEntity.ok(productRepository.save(product)); }
	 * 
	 * @GetMapping("/products/{categoryId}") public List<Product>
	 * getAllProductsByCategoryId(@PathVariable("categoryId") Integer couponCode) {
	 * List<Product> getProducts = new ArrayList<>();
	 * productRepository.findByCategoryId(couponCode).forEach(product ->
	 * getProducts.add(product)); System.out.println("getProducts" +
	 * getProducts.size()); return getProducts; }
	 */

}
