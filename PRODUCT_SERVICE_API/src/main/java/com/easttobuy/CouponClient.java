package com.easttobuy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient("COUPON_SERVICE")
public  interface CouponClient {
	@GetMapping("/couponAPI/coupon/{couponCode}")
	Coupon findByCouponCode(@PathVariable("couponCode")String couponCode); 
}
