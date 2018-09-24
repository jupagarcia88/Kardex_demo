package kardex.demo.persistence.dao;

import kardex.demo.entity.Product;

public interface ProductDao {

	void insert(Product product);
	
	Product findProductById(long product_id);
	
}
