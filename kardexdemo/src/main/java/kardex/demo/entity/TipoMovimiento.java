package kardex.demo.entity;

public class TipoMovimiento {
	
	private long   ideTipoMovimiento;
	public long getIdeTipoMovimiento() {
		return ideTipoMovimiento;
	}

	public void setIdeTipoMovimiento(long ideTipoMovimiento) {
		this.ideTipoMovimiento = ideTipoMovimiento;
	}

	public String getDesTipoMovimiento() {
		return desTipoMovimiento;
	}

	public void setDesTipoMovimiento(String desTipoMovimiento) {
		this.desTipoMovimiento = desTipoMovimiento;
	}

	private String desTipoMovimiento;
	
	public TipoMovimiento(long ideTipoMovimiento, String desTipoMovimiento) {
		this.ideTipoMovimiento = ideTipoMovimiento;
		this.desTipoMovimiento = desTipoMovimiento;
	}

}
