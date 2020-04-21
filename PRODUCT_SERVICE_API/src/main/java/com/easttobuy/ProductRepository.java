/**
 * 
 */
package com.easttobuy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author Satish Redy
 *
 */

public interface ProductRepository extends JpaRepository<Product, Integer> {
	List<Product> findByCategoryId(@Param("categoryId") Integer categoryId);
	

}
