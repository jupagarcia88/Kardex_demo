package kardex.demo.entity;

/**
 * 
 * @author juan.garcia
 *
 */
public class Category {
	
	private long   ideCategoria;
	private String desCategoria;
	
	public Category(long ideCategoria, String desCategoria) {
		this.ideCategoria = ideCategoria;
		this.desCategoria = desCategoria;
	}
	
	public long getIdeCategoria() {
		return ideCategoria;
	}
	public void setIdeCategoria(long ideCategoria) {
		this.ideCategoria = ideCategoria;
	}
	public String getDesCategoria() {
		return desCategoria;
	}
	public void setDesCategoria(String desCategoria) {
		this.desCategoria = desCategoria;
	}
}
