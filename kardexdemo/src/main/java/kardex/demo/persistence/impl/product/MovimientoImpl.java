package kardex.demo.persistence.impl.product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import kardex.demo.entity.Movimiento;
import kardex.demo.persistence.constant.QryProductCnt;
import kardex.demo.persistence.dao.MovimientoDao;

/**
 * @author Juan Garcia
 *
 */
@Repository
public class MovimientoImpl extends JdbcDaoSupport implements MovimientoDao {

	@Autowired
	DataSource dataSource;
	
	public static Logger logger = Logger.getLogger(CategoryImpl.class.getName());

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public boolean insertarMovimiento(Movimiento movimiento) throws Exception {
		
		try {
			String sql = "INSERT INTO " + QryProductCnt.TABLE_MOVIMIENTO + " (" + QryProductCnt.COL_IDE_MOVIMIENTO       + ", "
																				+ QryProductCnt.COL_IDE_TIPO_MOVIMIENTO  + ", "
																				+ QryProductCnt.COL_FEC_MOVIMIENTO       + ", "
																				+ QryProductCnt.COL_IDE_PRODUCTO         + ", "
																				+ QryProductCnt.COL_VLR_UNITARIO         + ", "
																				+ QryProductCnt.COL_CANTIDAD             + ", "
																				+ QryProductCnt.COL_VLAR_TOTAL           + ", "
																				+ QryProductCnt.COL_IDE_CATEGORIA        + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			
			getJdbcTemplate().update(sql, new Object[] { movimiento.getIdeMovimiento     (),
														 movimiento.getIdeTipoMovimiento (),
														 movimiento.getFecMovimiento     (),
														 movimiento.getIdeProducto       (),
														 movimiento.getVlrUnitario       (),
														 movimiento.getCantidad          (),
														 movimiento.getVlrTotal          (),
														 movimiento.getIdeCategoria      ()});
		} catch (Exception e) {
			logger.log(Level.INFO, e.toString());
			throw new Exception();
		}
		
		return true;
	}

	@Override
	public List<Movimiento> obtenerMovimientos() throws Exception {
		
		List<Movimiento> listCategory = new ArrayList<Movimiento>();
		Movimiento Movimiento;
		
		
		try {
			String sql = "SELECT * FROM " + QryProductCnt.TABLE_MOVIMIENTO;
			
			System.err.println("entramos al dao = "+sql);
			
			Movimiento = (Movimiento) getJdbcTemplate().queryForObject(sql, new RowMapper<Movimiento>() {
				@Override
				public Movimiento mapRow(ResultSet rs, int rowNum) throws SQLException {
					Movimiento category = new Movimiento(rs.getLong      (QryProductCnt.COL_IDE_MOVIMIENTO      ),
							                             rs.getLong      (QryProductCnt.COL_IDE_TIPO_MOVIMIENTO ),  
														 rs.getDate      (QryProductCnt.COL_FEC_MOVIMIENTO      ), 
														 rs.getLong      (QryProductCnt.COL_IDE_PRODUCTO        ),
														 rs.getBigDecimal(QryProductCnt.COL_VLR_UNITARIO        ),
														 rs.getLong      (QryProductCnt.COL_CANTIDAD            ),         
														 rs.getBigDecimal(QryProductCnt.COL_VLAR_TOTAL          ),           
														 rs.getLong      (QryProductCnt.COL_IDE_CATEGORIA       ));
					return category;
				}
			});
			
			listCategory.add(Movimiento);
			
			getJdbcTemplate().update(sql);
			
		} catch (Exception e) {
			logger.log(Level.INFO, e.toString());
			throw new Exception();
		}
		
		return listCategory;
	}

	@Override
	public Movimiento findProductById(long category_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
