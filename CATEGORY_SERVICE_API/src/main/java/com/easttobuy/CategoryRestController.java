/**
 * 
 */
package com.easttobuy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Satish Reddy
 *
 */
@RestController
@RequestMapping("/categoryAPI")
public class CategoryRestController {

	/*
	 * @Autowired CategoryRepository categoryRepository;
	 */

	/*
	 * @GetMapping("/categories/{categoryId}") public ResponseEntity<Category>
	 * getByCategoryId(@PathVariable("categoryId") Integer categoryId) { Category
	 * categoryData = categoryRepository.findByCategoryId(categoryId); if
	 * (categoryData != null) { return new ResponseEntity<Category>(categoryData,
	 * HttpStatus.OK); } else { return new ResponseEntity<>(HttpStatus.NOT_FOUND); }
	 * }
	 * 
	 * @GetMapping("/categories") public List<Category> getAllCategory() {
	 * List<Category> getAllCategories=new ArrayList<>(); try {
	 * categoryRepository.findAll().forEach(category->getAllCategories.add(category)
	 * ); System.out.println(getAllCategories);
	 * 
	 * } catch (Exception e) {
	 * 
	 * // TODO: handle exception } return getAllCategories;
	 * 
	 * }
	 * 
	 * @PostMapping(value = "/categories") private ResponseEntity<Category>
	 * addCategory(@Valid @RequestBody Category category) { return ResponseEntity
	 * .ok() .body(this.categoryRepository.save(category)); }
	 */
}
