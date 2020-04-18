/**
 * 
 */
package com.easttobuy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author chiru
 * 
 */
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "category", path = "category")
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	@RestResource(path = "getByCategoryID",rel = "getByCategoryID")
	Category findByCategoryId(@Param("categoryId")Integer categoryId);

	
}
