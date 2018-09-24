package kardex.demo.service.impl.movimientos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kardex.demo.entity.Movimiento;
import kardex.demo.persistence.dao.MovimientoDao;
import kardex.demo.service.MovimientoService;

@Service
public class MovimientosServiceImpl implements MovimientoService{

	@Autowired MovimientoDao movimientoDao;
	
	@Override
	public void insert(Movimiento movimiento) throws Exception {
		movimientoDao.insertarMovimiento(movimiento);
		
	}

	@Override
	public List<Movimiento> obtenerMovimientos() throws Exception {
		// TODO Auto-generated method stub
		System.err.println("aquí llegó");
		return movimientoDao.obtenerMovimientos();
	}
	

}
