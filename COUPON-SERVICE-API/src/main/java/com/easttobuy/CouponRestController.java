package com.easttobuy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/couponAPI")
public class CouponRestController {
private CouponRepository couponRepository;
public CouponRestController(CouponRepository couponRepository) {
	this.couponRepository=couponRepository;
	
}
@GetMapping("/coupon/{couponCode}")
public Coupon findByCouponCode(@PathVariable("couponCode") String couponCode){
	
	Coupon coupon=couponRepository.findByCouponCode(couponCode);
	return coupon;
	}
}
