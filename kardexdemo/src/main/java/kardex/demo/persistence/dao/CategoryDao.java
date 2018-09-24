package kardex.demo.persistence.dao;

import java.util.List;

import kardex.demo.entity.Category;

public interface CategoryDao {
	
	/**
	 * @author Juan Garcia
	 * 
	 * Metodo que permite actualizar una categoria
	 * 
	 * @param Category
	 * @return
	 * @throws Exception 
	 */
	 boolean actualizarCategoria(Category category) throws Exception;

	
	/**
	 * @author Juan Garcia
	 * 
	 * Metodo que permite de eliminar una categoria
	 * @param Category
	 * @return
	 * @throws Exception 
	 */
	 boolean borrarCategoria(Category category) throws Exception;
	
	
	
	/**
	 * Metodo que agrega una nueva categoria
	 * 
	 * @author Juan Garcia
	 * 
	 * @param Category
	 * @return
	 * @throws Exception 
	 */
	 boolean insertarCategoria(Category category ) throws Exception;

	/**
	 * @author Juan Garcia
	 * 
	 * Metodo que obtiene las categorias
	 * 
	 * @return
	 * @throws Exception 
	 */
	 List<Category> obtenerCategorias() throws Exception;
	 
	 Category findProductById(long category_id);

}
