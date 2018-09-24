/**
 * 
 */
package kardex.demo.persistence.impl.product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import kardex.demo.entity.Category;
import kardex.demo.persistence.constant.QryProductCnt;
import kardex.demo.persistence.dao.CategoryDao;

/**
 * @author Juan Garcia
 *
 */
@Repository
public class CategoryImpl extends JdbcDaoSupport implements CategoryDao {

	@Autowired
	DataSource dataSource;
	
	public static Logger logger = Logger.getLogger(CategoryImpl.class.getName());

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public boolean actualizarCategoria(Category category) throws Exception {
		try {
			String sql = "UPDATE " + QryProductCnt.TABLE_CATEGORIA + " "   
					               + "SET "   + QryProductCnt.COL_NOM_CATEGORIA + " = " +category.getDesCategoria ()
					               + "WHERE " + QryProductCnt.COL_IDE_CATEGORIA + " = " + category.getIdeCategoria();
			
			
			getJdbcTemplate().update(sql, new Object[] { category.getIdeCategoria  (),
														 category.getDesCategoria  () });
		} catch (Exception e) {
			logger.log(Level.INFO, e.toString());
			throw new Exception();
		}
		
		return true;
	}

	@Override
	public boolean borrarCategoria(Category category) throws Exception {
		
		try {
			String sql = "DELETE FROM " + QryProductCnt.TABLE_CATEGORIA + " "   
					                    + "WHERE " + QryProductCnt.COL_IDE_CATEGORIA + " = " + category.getIdeCategoria();
			
			
			getJdbcTemplate().update(sql, new Object[] { category.getIdeCategoria  (),
														 category.getDesCategoria  () });
		} catch (Exception e) {
			logger.log(Level.INFO, e.toString());
			throw new Exception();
		}
		
		return true;
	}

	@Override
	public boolean insertarCategoria(Category category) throws Exception {
		
		try {
			String sql = "INSERT INTO " + QryProductCnt.TABLE_CATEGORIA + " (" + QryProductCnt.COL_IDE_CATEGORIA  + ", " 
					     	  + QryProductCnt.COL_NOM_CATEGORIA + ") VALUES (?, ?)";
			
			
			getJdbcTemplate().update(sql, new Object[] { category.getIdeCategoria  (),
														 category.getDesCategoria  () });
		} catch (Exception e) {
			logger.log(Level.INFO, e.toString());
			throw new Exception();
		}
		
		return true;
	}

	@Override
	public List<Category> obtenerCategorias() throws Exception {
		
		List<Category> listCategory = new ArrayList<Category>();
		Category categoria;
		
		
		try {
			String sql = "SELECT * FROM " + QryProductCnt.TABLE_CATEGORIA;
			
			System.err.println("entramos al dao = "+sql);
			
			categoria = (Category) getJdbcTemplate().queryForObject(sql, new RowMapper<Category>() {
				@Override
				public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
					Category category = new Category(rs.getLong(QryProductCnt.COL_IDE_CATEGORIA), rs.getString(QryProductCnt.COL_NOM_CATEGORIA));
					return category;
				}
			});
			
			listCategory.add(categoria);
			
			getJdbcTemplate().update(sql);
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.toString());
			throw new Exception();
		}
		
		return listCategory;
	}

	@Override
	public Category findProductById(long category_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
