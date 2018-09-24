package kardex.demo.persistence.dao;

import java.util.List;

import kardex.demo.entity.Casa;

public interface EmpresaCasaDao{
	
	/**
	 * @author Juan Garcia
	 * 
	 * Metodo que permite actualizar una Casa
	 * 
	 * @param Casa
	 * @return
	 * @throws Exception 
	 */
	 boolean actualizarCasa(Casa casa) throws Exception;

	
	/**
	 * @author Juan Garcia
	 * 
	 * Metodo que permite de eliminar una Casa
	 * @param Casa
	 * @return
	 * @throws Exception 
	 */
	 boolean borrarCasa(Casa casa) throws Exception;
	
	
	
	/**
	 * Metodo que agrega una nueva Casa
	 * 
	 * @author Juan Garcia
	 * 
	 * @param Casa
	 * @return
	 * @throws Exception 
	 */
	 boolean insertarCasa( Casa casa) throws Exception;

	/**
	 * @author Juan Garcia
	 * 
	 * Metodo que obtiene las Casas
	 * 
	 * @return
	 * @throws Exception 
	 */
	 List<Casa> obtenerCasas() throws Exception;
	 
	 Casa findProductById(long category_id);
}
