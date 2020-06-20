package com.easttobuy;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/couponAPI")
public class CouponRestController {
private CouponRepository couponRepository;
public CouponRestController(CouponRepository couponRepository) {
	this.couponRepository=couponRepository;
	
}
@RequestMapping(value= "/coupon/{couponCode}",method= RequestMethod.GET)
public Coupon findByCouponCode(@PathVariable("couponCode") String couponCode){
	
	Coupon coupon=couponRepository.findByCouponCode(couponCode);
	return coupon;
	}
}
