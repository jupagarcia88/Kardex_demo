package kardex.demo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kardex.demo.entity.Casa;
import kardex.demo.service.CasaService;

@RestController
public class CasaController {
	
	@Autowired
	CasaService casaService;
	
	@RequestMapping("/query_casa")
	public ResponseEntity<Casa> getCasa() throws Exception {
		
		List<Casa> listCasa;
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		listCasa = casaService.obtenerCasas();
		return new ResponseEntity<Casa>(new Casa(listCasa.get(0).getIdeCasa(), listCasa.get(0).getNomCasa()), headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/insert_casa", method = RequestMethod.POST)
	public void newCasa(@RequestBody Casa casa) throws Exception {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		 
		casaService.insert(casa); 
	}
	
	@RequestMapping(value = "/update_casa", method = RequestMethod.POST)
	public void updateCasa(@RequestBody Casa casa) throws Exception {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		 
		casaService.update(casa); 
	}
	
	@RequestMapping(value = "/delete_casa", method = RequestMethod.POST)
	public void deleteCasa(@RequestBody Casa casa) throws Exception {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		 
		casaService.delete(casa); 
	}

}
