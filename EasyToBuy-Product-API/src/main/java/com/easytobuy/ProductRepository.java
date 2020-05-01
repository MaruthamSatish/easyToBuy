/**
 * 
 */
package com.easytobuy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Satish Redy
 *
 */
@RepositoryRestResource(path = "products", collectionResourceRel = "products")
public interface ProductRepository extends JpaRepository<Product, Integer> {
	/* List<Product> findByCategoryId(@Param("categoryId") Integer categoryId); */

}
