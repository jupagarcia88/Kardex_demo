package kardex.demo.service.impl.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kardex.demo.entity.Product;
import kardex.demo.persistence.dao.ProductDao;
import kardex.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired ProductDao productDao;
	
	@Override
	public void insert(Product product) {
		productDao.insert(product);
	}

}
