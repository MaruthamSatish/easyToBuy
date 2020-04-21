package com.easttobuy;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CouponRepository extends JpaRepository<Coupon, Integer> {
	/* List<Coupon> findByCouponCode(String couponCode); */
  Coupon findByCouponCode(String couponCode);
}
