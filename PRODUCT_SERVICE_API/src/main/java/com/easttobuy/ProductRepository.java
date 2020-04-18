/**
 * 
 */
package com.easttobuy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author chiru
 *
 */
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "product",path = "product",exported = true)
public interface ProductRepository extends JpaRepository<Product, Integer> {
	 //Page<Product> findByCategoryId(@RequestParam("categoryId")Integer categoryId,Pageable pageable);
	 //List<Product> findByCategoryId(Integer categoryId);

}
