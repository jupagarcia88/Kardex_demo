package kardex.demo.persistence.impl.product;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import kardex.demo.entity.TipoMovimiento;
import kardex.demo.persistence.constant.QryProductCnt;
import kardex.demo.persistence.dao.TipoMovimientoDao;

/**
 * @author Juan Garcia
 *
 */
@Repository
public class TipoMovimientoImpl extends JdbcDaoSupport implements TipoMovimientoDao {

	@Autowired
	DataSource dataSource;
	
	public static Logger logger = Logger.getLogger(TipoMovimientoImpl.class.getName());

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public boolean actualizarTipoMovimiento(TipoMovimiento TipoMovimiento) throws Exception {
		try {
			String sql = "UPDATE " + QryProductCnt.TABLE_TIPO_MOVIMIENTO+ " "   
					               + "SET "   + QryProductCnt.COL_NOM_TIPO_MOVIMIENTO + " = " +TipoMovimiento.getDesTipoMovimiento ()
					               + "WHERE " + QryProductCnt.COL_IDE_TIPO_MOVIMIENTO + " = " + TipoMovimiento.getIdeTipoMovimiento();
			
			
			getJdbcTemplate().update(sql, new Object[] { TipoMovimiento.getIdeTipoMovimiento  (),
														 TipoMovimiento.getDesTipoMovimiento  () });
		} catch (Exception e) {
			logger.log(Level.INFO, e.toString());
			throw new Exception();
		}
		
		return true;
	}

	@Override
	public boolean borrarTipoMovimiento(TipoMovimiento TipoMovimiento) throws Exception {
		
		try {
			String sql = "DELETE FROM " + QryProductCnt.TABLE_TIPO_MOVIMIENTO + " "   
					                    + "WHERE " + QryProductCnt.COL_IDE_TIPO_MOVIMIENTO + " = " + TipoMovimiento.getIdeTipoMovimiento();
			
			
			getJdbcTemplate().update(sql, new Object[] { TipoMovimiento.getIdeTipoMovimiento  (),
														 TipoMovimiento.getDesTipoMovimiento  () });
		} catch (Exception e) {
			logger.log(Level.INFO, e.toString());
			throw new Exception();
		}
		
		return true;
	}

	@Override
	public boolean insertarTipoMovimiento(TipoMovimiento TipoMovimiento) throws Exception {
		
		try {
			String sql = "INSERT INTO " + QryProductCnt.TABLE_TIPO_MOVIMIENTO + " (" + QryProductCnt.COL_IDE_TIPO_MOVIMIENTO  + ", " 
					     	  + QryProductCnt.COL_NOM_TIPO_MOVIMIENTO + ") VALUES (?, ?)";
			
			
			getJdbcTemplate().update(sql, new Object[] { TipoMovimiento.getIdeTipoMovimiento  (),
														 TipoMovimiento.getDesTipoMovimiento  () });
		} catch (Exception e) {
			logger.log(Level.INFO, e.toString());
			throw new Exception();
		}
		
		return true;
	}

}
