package kardex.demo.service;

import java.util.List;

import kardex.demo.entity.Movimiento;

/**
 * 
 * @author juan.garcia
 *
 */
public interface MovimientoService {
	
	void insert (Movimiento movimiento) throws Exception;
	List<Movimiento> obtenerMovimientos() throws Exception;
}
