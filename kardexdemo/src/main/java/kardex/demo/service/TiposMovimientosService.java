package kardex.demo.service;

import kardex.demo.entity.TipoMovimiento;

/**
 * 
 * @author juan.garcia
 *
 */
public interface TiposMovimientosService {
	
	void insert (TipoMovimiento tipoMovimiento) throws Exception;
	void update (TipoMovimiento tipoMovimiento) throws Exception;
	void delete (TipoMovimiento tipoMovimiento) throws Exception;

}
