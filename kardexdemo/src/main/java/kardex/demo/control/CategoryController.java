package kardex.demo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kardex.demo.entity.Category;
import kardex.demo.service.CategoryService;

/**
 * 
 * @author juan.garcia
 *
 */

@RestController
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("/query_category")
	public ResponseEntity<Category> getCategory() throws Exception {
		
		List<Category> listCategory;
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		listCategory = categoryService.obtenerCategorias();
		return new ResponseEntity<Category>(new Category(listCategory.get(0).getIdeCategoria(), listCategory.get(0).getDesCategoria()), headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/insert_category", method = RequestMethod.POST)
	public void newCategory(@RequestBody Category category) throws Exception {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		 
		categoryService.insert(category); 
	}
	
	@RequestMapping(value = "/update_category", method = RequestMethod.POST)
	public void updateCategory(@RequestBody Category category) throws Exception {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		 
		categoryService.update(category); 
	}
	
	@RequestMapping(value = "/delete_category", method = RequestMethod.POST)
	public void deleteCategory(@RequestBody Category category) throws Exception {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		 
		categoryService.delete(category); 
	}

}
