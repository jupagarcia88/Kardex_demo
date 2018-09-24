package kardex.demo.service.impl.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kardex.demo.entity.Category;
import kardex.demo.persistence.dao.CategoryDao;
import kardex.demo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired CategoryDao categoryDao;
	
	@Override
	public void insert(Category category) throws Exception {
		categoryDao.insertarCategoria(category);
		
	}

	@Override
	public void update(Category category) throws Exception {
		// TODO Auto-generated method stub
		categoryDao.actualizarCategoria(category);
		
	}

	@Override
	public void delete(Category category) throws Exception {
		// TODO Auto-generated method stub
		categoryDao.borrarCategoria(category);
		
	}

	@Override
	public List<Category> obtenerCategorias() throws Exception {
		// TODO Auto-generated method stub
		System.err.println("aquí llegó");
		return categoryDao.obtenerCategorias();
	}
	

}
