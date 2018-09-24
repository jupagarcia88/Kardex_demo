package kardex.demo.service.impl.casa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kardex.demo.entity.Casa;
import kardex.demo.persistence.dao.EmpresaCasaDao;
import kardex.demo.service.CasaService;

@Service
public class CasaServiceImpl implements CasaService{

	@Autowired EmpresaCasaDao casaDao;
	
	@Override
	public void insert(Casa casa) throws Exception {
		casaDao.insertarCasa(casa);
		
	}

	@Override
	public void update(Casa casa) throws Exception {
		// TODO Auto-generated method stub
		casaDao.actualizarCasa(casa);
		
	}

	@Override
	public void delete(Casa casa) throws Exception {
		// TODO Auto-generated method stub
		casaDao.borrarCasa(casa);
		
	}

	@Override
	public List<Casa> obtenerCasas() throws Exception {
		// TODO Auto-generated method stub
		System.err.println("aquí llegó");
		return casaDao.obtenerCasas();
	}
	

}
