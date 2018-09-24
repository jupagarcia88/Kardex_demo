/**
 * Control package
 */
package kardex.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kardex.demo.entity.Product;
import kardex.demo.service.ProductService;

/**
 * @author Juan Garcia
 *
 */
@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping("/product/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id") long id) {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		return new ResponseEntity<Product>(new Product(1, "producto1", "Description1",1, 5, 0), headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public ResponseEntity<Long> newProduct(@RequestBody Product product) {
		System.out.println("entró al servicio y vamos bn");
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		//long id = 
				productService.insert(product);
		return new ResponseEntity(headers, HttpStatus.CREATED);
	}
}
