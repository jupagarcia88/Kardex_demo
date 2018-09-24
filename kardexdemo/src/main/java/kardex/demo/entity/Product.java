/**
 * 
 */
package kardex.demo.entity;

/**
 * @author Juan Garcia
 *
 */
public class Product {
	
	private long   ideProduct;
	private String nameProduct;
	private String desProduct;
	private long   ideHouse;
	private long   ideCategoria;
	private long   cantidad    ;
	
	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	public Product(long ideProduct, String nameProduct, String desProduct, long ideHouse, long ideCategoria, long cantidad) {
		this.ideProduct = ideProduct;
		this.nameProduct = nameProduct;
		this.desProduct = desProduct;
		this.ideHouse = ideHouse;
		this.ideCategoria = ideCategoria;
	}
	
	public long getIdeProduct() {
		return ideProduct;
	}
	public void setIdeProduct(long ideProduct) {
		this.ideProduct = ideProduct;
	}
	public String getnameProduct() {
		return nameProduct;
	}
	public void setnameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public String getdesProduct() {
		return desProduct;
	}
	public void setdesProduct(String desProduct) {
		this.desProduct = desProduct;
	}
	public long getideCategoria() {
		return ideCategoria;
	}
	public void setideCategoria(long ideCategoria) {
		this.ideCategoria = ideCategoria;
	}
	public long getideHouse() {
		return ideHouse;
	}
	public void setideHouse(long ideHouse) {
		this.ideHouse = ideHouse;
	}
}
