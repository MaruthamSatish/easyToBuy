/**
 * 
 */
package com.easttobuy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Satish Redy
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	List<Product> findByCategoryId(Integer categoryId);

}
