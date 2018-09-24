package kardex.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Movimiento {
	
	private long       ideMovimiento    ;
	private long       ideTipoMovimiento;
	private Date       fecMovimiento    ;
	private long       ideProducto      ;
	private BigDecimal vlrUnitario      ;
	private long       cantidad         ;
	private BigDecimal vlrTotal         ;
	private long       ideCategoria     ;
	
	public Movimiento ( long ideMovimiento, long ideTipoMovimiento, Date fecMovimiento , long ideProducto, BigDecimal vlrUnitario, 
			            long cantidad, BigDecimal vlrTotal ,long ideCategoria) {
		this.ideMovimiento     = ideMovimiento    ;
		this.ideTipoMovimiento = ideTipoMovimiento;
		this.fecMovimiento     = fecMovimiento    ;
		this.ideProducto       = ideProducto      ;
		this.vlrUnitario       = vlrUnitario      ;
		this.cantidad          = cantidad         ;
		this.vlrTotal          = vlrTotal         ;
	}

	public long getIdeMovimiento() {
		return ideMovimiento;
	}

	public void setIdeMovimiento(long ideMovimiento) {
		this.ideMovimiento = ideMovimiento;
	}

	public long getIdeTipoMovimiento() {
		return ideTipoMovimiento;
	}

	public void setIdeTipoMovimiento(long ideTipoMovimiento) {
		this.ideTipoMovimiento = ideTipoMovimiento;
	}

	public Date getFecMovimiento() {
		return fecMovimiento;
	}

	public void setFecMovimiento(Date fecMovimiento) {
		this.fecMovimiento = fecMovimiento;
	}

	public long getIdeProducto() {
		return ideProducto;
	}

	public void setIdeProducto(long ideProducto) {
		this.ideProducto = ideProducto;
	}

	public BigDecimal getVlrUnitario() {
		return vlrUnitario;
	}

	public void setVlrUnitario(BigDecimal vlrUnitario) {
		this.vlrUnitario = vlrUnitario;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getVlrTotal() {
		return vlrTotal;
	}

	public void setVlrTotal(BigDecimal vlrTotal) {
		this.vlrTotal = vlrTotal;
	}

	public long getIdeCategoria() {
		return ideCategoria;
	}

	public void setIdeCategoria(long ideCategoria) {
		this.ideCategoria = ideCategoria;
	}

}
