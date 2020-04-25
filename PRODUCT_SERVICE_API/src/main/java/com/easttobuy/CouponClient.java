package com.easttobuy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient("ZUUL-SERVER")
public  interface CouponClient {
	
	@GetMapping("/coupon-service/couponAPI/coupon/{couponCode}")
	Coupon findByCouponCode(@PathVariable("couponCode") String couponCode); 
}
