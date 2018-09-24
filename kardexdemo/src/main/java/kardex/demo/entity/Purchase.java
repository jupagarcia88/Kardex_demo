package kardex.demo.entity;

import java.math.BigDecimal;

/**
 * @author Juan Garcia
 *
 */
public class Purchase {
	
	private long id;
	private String description;
	private BigDecimal value;
	private long quantity;
	private Product product;
	
	public Purchase(long id, Product product, String description, BigDecimal value, long quantity){
		this.id = id;
		this.product = product;
		this.description = description;
		this.value = value;
		this.quantity = quantity;		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
