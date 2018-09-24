/**
 * 
 */
package kardex.demo.persistence.impl.product;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import kardex.demo.entity.Product;
import kardex.demo.persistence.constant.QryProductCnt;
import kardex.demo.persistence.dao.ProductDao;

/**
 * @author Juan Garcia
 *
 */
@Repository
public class ProductImpl extends JdbcDaoSupport implements ProductDao {

	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public void insert(Product product) {
		String sql = "INSERT INTO " + QryProductCnt.TABLE_PRODUCTO + " (" + QryProductCnt.COL_IDE_PRODUCTO  + ", " 
																     	  + QryProductCnt.COL_NOM_PRODUCTO  + ", "
																	      + QryProductCnt.COL_DESCRIPCION   + ", " 
																	      + QryProductCnt.COL_IDE_CASA      + ", "
																	      + QryProductCnt.COL_CANTIDAD      + ", "
																	      + QryProductCnt.COL_IDE_CATEGORIA + ") VALUES (?, ?, ?, ?, ?, ?)";
	

		getJdbcTemplate().update(sql, new Object[] { product.getIdeProduct  (),
				                                     product.getnameProduct (),
				                                     product.getdesProduct  (),
				                                     product.getideHouse    (),
				                                     product.getideCategoria(),
				                                     product.getCantidad    () });
	}

	@Override
	public Product findProductById(long product_id) {
		String sql = "SELECT * FROM " + QryProductCnt.TABLE_PRODUCTO + " WHERE CUST_ID = ?";
		return (Product) getJdbcTemplate().queryForObject(sql, new Object[] { product_id }, new RowMapper<Product>() {
			@Override
			public Product mapRow(ResultSet rs, int rwNumber) throws SQLException {
				Product product = new Product(rs.getLong(QryProductCnt.COL_IDE_PRODUCTO), rs.getString(QryProductCnt.COL_IDE_CASA),
						rs.getString(QryProductCnt.COL_DESCRIPCION),1, 1, 0);
				product.setideHouse(rs.getLong(QryProductCnt.COL_IDE_CASA));
				return product;
			}
		});
	}

}
