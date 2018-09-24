package kardex.demo.service.impl.movimientos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kardex.demo.entity.TipoMovimiento;
import kardex.demo.persistence.dao.TipoMovimientoDao;
import kardex.demo.service.TiposMovimientosService;

@Service
public class TiposMovimientosServiceImpl implements TiposMovimientosService{

	@Autowired TipoMovimientoDao TipoMovimientoDao;
	
	@Override
	public void insert(TipoMovimiento tipoMovimiento) throws Exception {
		TipoMovimientoDao.insertarTipoMovimiento(tipoMovimiento);
		
	}

	@Override
	public void update(TipoMovimiento tipoMovimiento) throws Exception {
		// TODO Auto-generated method stub
		TipoMovimientoDao.actualizarTipoMovimiento(tipoMovimiento);
		
	}

	@Override
	public void delete(TipoMovimiento tipoMovimiento) throws Exception {
		// TODO Auto-generated method stub
		TipoMovimientoDao.borrarTipoMovimiento(tipoMovimiento);
		
	}
	

}
