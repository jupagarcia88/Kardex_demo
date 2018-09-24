/**
 * 
 */
package kardex.demo.control;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kardex.demo.entity.Kardex;
import kardex.demo.entity.Product;
import kardex.demo.entity.Purchase;
import kardex.demo.entity.Sale;

/**
 * @author Juan Garcia
 *
 */
@RestController
public class KardexController {

	@RequestMapping("/kardex")
	public List<Kardex> getKardexList() {
		// TODO: Este es una llenado de demostracion esta operacion se puede hacer en
		// una clase servicio y los datos son de BD.
		List<Kardex> kardexList = new ArrayList<Kardex>();
		Kardex kardex = new Kardex();
		Purchase purchase = new Purchase(1, new Product(1, "Product1", "Product1",1, 5, 0), "Purchase Description",
				new BigDecimal(2000), 2);
		kardex.setDate(new Date());
		kardex.setInput(purchase);
		Kardex kardex1 = new Kardex();
		Sale sale = new Sale(1, new Product(1, "Product1", "Product1",1, 5, 0), "Sale Description", new BigDecimal(1000), 1);
		kardex1.setDate(new Date());
		kardex1.setOutput(sale);
		kardex.setBalance(purchase.getValue());
		kardexList.add(kardex);
		kardex1.setBalance(purchase.getValue().subtract(sale.getValue()));
		kardexList.add(kardex1);
		return kardexList;
	}
}
