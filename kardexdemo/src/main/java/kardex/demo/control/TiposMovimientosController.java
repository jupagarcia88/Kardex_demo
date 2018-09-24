package kardex.demo.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kardex.demo.entity.TipoMovimiento;
import kardex.demo.service.TiposMovimientosService;

@RestController
public class TiposMovimientosController {
	
	@Autowired
	TiposMovimientosService tipoMovimientoService;

	
	@RequestMapping(value = "insert_tipo_movimiento", method = RequestMethod.POST)
	public void newTipoMovimiento(@RequestBody TipoMovimiento tipoMovimiento) throws Exception {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		 
		tipoMovimientoService.insert(tipoMovimiento); 
	}
	
	@RequestMapping(value = "/update_tipo_movimiento", method = RequestMethod.POST)
	public void updateCasa(@RequestBody TipoMovimiento tipoMovimiento ) throws Exception {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		 
		tipoMovimientoService.update(tipoMovimiento); 
	}
	
	@RequestMapping(value = "/delete_tipo_movimiento", method = RequestMethod.POST)
	public void deleteCasa(@RequestBody TipoMovimiento tipoMovimiento) throws Exception {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		 
		tipoMovimientoService.delete(tipoMovimiento); 
	}

}
