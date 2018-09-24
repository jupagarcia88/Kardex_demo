package kardex.demo.persistence.dao;

import java.util.List;

import kardex.demo.entity.Movimiento;

public interface MovimientoDao {
	
	
	
	/**
	 * Metodo que agrega un nuevo Movimiento
	 * 
	 * @author Juan Garcia
	 * 
	 * @param Movimiento
	 * @return
	 * @throws Exception 
	 */
	 boolean insertarMovimiento( Movimiento movimiento) throws Exception;

	/**
	 * @author Juan Garcia
	 * 
	 * Metodo que obtiene las Movimientos
	 * 
	 * @return
	 * @throws Exception 
	 */
	 List<Movimiento> obtenerMovimientos() throws Exception;
	 
	 Movimiento findProductById(long category_id);
}
