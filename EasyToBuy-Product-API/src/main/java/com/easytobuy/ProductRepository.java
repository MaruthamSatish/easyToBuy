/**
 * 
 */
package com.easytobuy;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Satish Redy
 *
 */
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(path = "product", collectionResourceRel = "product")
public interface ProductRepository extends JpaRepository<Product, Integer> {
	/* List<Product> findByCategoryId(@Param("categoryId") Integer categoryId); */
	
	Page<Product> findByCategoryId(@RequestParam("categoryId")Integer categoryId,Pageable pageable);

}
