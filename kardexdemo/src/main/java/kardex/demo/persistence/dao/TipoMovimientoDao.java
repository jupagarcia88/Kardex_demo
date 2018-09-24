package kardex.demo.persistence.dao;


import kardex.demo.entity.TipoMovimiento;

public interface TipoMovimientoDao {

	/**
	 * @author Juan Garcia
	 * 
	 * Metodo que permite actualizar una TipoMovimiento
	 * 
	 * @param idTipoMovimiento
	 * @return
	 * @throws Exception 
	 */
	 boolean actualizarTipoMovimiento(TipoMovimiento tipoMovimiento) throws Exception;

	
	/**
	 * @author Juan Garcia
	 * 
	 * Metodo que permite de eliminar una TipoMovimiento
	 * @param idTipoMovimiento
	 * @return
	 * @throws Exception 
	 */
	 boolean borrarTipoMovimiento(TipoMovimiento tipoMovimiento) throws Exception;
	
	
	
	/**
	 * Metodo que agrega una nueva TipoMovimiento
	 * 
	 * @author Juan Garcia
	 * 
	 * @param TipoMovimiento
	 * @return
	 * @throws Exception 
	 */
	 boolean insertarTipoMovimiento(TipoMovimiento tipoMovimiento ) throws Exception;

}
