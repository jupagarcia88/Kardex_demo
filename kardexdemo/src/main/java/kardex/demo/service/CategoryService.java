package kardex.demo.service;

import java.util.List;

import kardex.demo.entity.Category;

/**
 * 
 * @author juan.garcia
 *
 */
public interface CategoryService {
	
	void insert (Category category) throws Exception;
	void update (Category category) throws Exception;
	void delete (Category category) throws Exception;
	List<Category> obtenerCategorias() throws Exception;

}
