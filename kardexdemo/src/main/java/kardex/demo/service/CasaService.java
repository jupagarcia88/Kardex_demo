package kardex.demo.service;

import java.util.List;

import kardex.demo.entity.Casa;

/**
 * 
 * @author juan.garcia
 *
 */
public interface CasaService {

	void insert (Casa casa) throws Exception;
	void update (Casa casa) throws Exception;
	void delete (Casa casa) throws Exception;
	List<Casa> obtenerCasas() throws Exception;
	
}
