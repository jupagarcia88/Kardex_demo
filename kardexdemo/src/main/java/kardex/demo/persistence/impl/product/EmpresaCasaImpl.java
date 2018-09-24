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

import kardex.demo.entity.Casa;
import kardex.demo.persistence.constant.QryProductCnt;
import kardex.demo.persistence.dao.EmpresaCasaDao;

/**
 * @author Juan Garcia
 *
 */
@Repository
public class EmpresaCasaImpl extends JdbcDaoSupport implements EmpresaCasaDao {

	@Autowired
	DataSource dataSource;
	
	public static Logger logger = Logger.getLogger(CategoryImpl.class.getName());

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public boolean actualizarCasa(Casa casa) throws Exception {
		try {
			String sql = "UPDATE " + QryProductCnt.TABLE_CASA + " "   
					               + "SET "   + QryProductCnt.COL_NOM_CASA + " = " +casa.getNomCasa ()
					               + "WHERE " + QryProductCnt.COL_IDE_CASA + " = " + casa.getIdeCasa();
			
			
			getJdbcTemplate().update(sql, new Object[] { casa.getIdeCasa  (),
														 casa.getNomCasa  () });
		} catch (Exception e) {
			logger.log(Level.INFO, e.toString());
			throw new Exception();
		}
		
		return true;
	}

	@Override
	public boolean borrarCasa(Casa casa) throws Exception {
		
		try {
			String sql = "DELETE FROM " + QryProductCnt.TABLE_CASA + " "   
					                    + "WHERE " + QryProductCnt.COL_IDE_CASA + " = " + casa.getIdeCasa();
			
			
			getJdbcTemplate().update(sql, new Object[] { casa.getIdeCasa  (),
														 casa.getNomCasa  () });
		} catch (Exception e) {
			logger.log(Level.INFO, e.toString());
			throw new Exception();
		}
		
		return true;
	}

	@Override
	public boolean insertarCasa(Casa casa) throws Exception {
		
		try {
			String sql = "INSERT INTO " + QryProductCnt.TABLE_CASA + " (" + QryProductCnt.COL_IDE_CASA  + ", " 
					     	  + QryProductCnt.COL_NOM_CASA + ") VALUES (?, ?)";
			
			
			getJdbcTemplate().update(sql, new Object[] { casa.getIdeCasa  (),
														 casa.getNomCasa  () });
		} catch (Exception e) {
			logger.log(Level.INFO, e.toString());
			throw new Exception();
		}
		
		return true;
	}

	@Override
	public List<Casa> obtenerCasas() throws Exception {
		
		List<Casa> listCategory = new ArrayList<Casa>();
		Casa Casa;
		
		
		try {
			String sql = "SELECT * FROM " + QryProductCnt.TABLE_CASA;
			
			System.err.println("entramos al dao = "+sql);
			
			Casa = (Casa) getJdbcTemplate().queryForObject(sql, new RowMapper<Casa>() {
				@Override
				public Casa mapRow(ResultSet rs, int rowNum) throws SQLException {
					Casa category = new Casa(rs.getLong(QryProductCnt.COL_IDE_CASA), rs.getString(QryProductCnt.COL_NOM_CASA));
					return category;
				}
			});
			
			listCategory.add(Casa);
			
			getJdbcTemplate().update(sql);
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.toString());
			throw new Exception();
		}
		
		return listCategory;
	}

	@Override
	public Casa findProductById(long category_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
