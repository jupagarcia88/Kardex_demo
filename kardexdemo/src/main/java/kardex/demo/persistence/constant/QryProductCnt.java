/**
 * 
 */
package kardex.demo.persistence.constant;

/**
 * @author Juan Garcia
 *
 */
public class QryProductCnt {

	private QryProductCnt() {

	}
	// CONSTANTES TABLA DE PRODUCTOS
	public static final String TABLE_PRODUCTO    = "\"PRODUCTO\""     ;
	public static final String COL_IDE_PRODUCTO  = "\"IDE_PRODUCTO\"" ;
	public static final String COL_NOM_PRODUCTO  = "\"NOM_PRODUCTO\"" ;
	public static final String COL_DESCRIPCION   = "\"DESCRIPCION\""  ;
	public static final String COL_IDE_CASA      = "\"IDE_CASA\""     ;
	public static final String COL_IDE_CATEGORIA = "\"IDE_CATEGORIA\"";
	
	// CONSTANTES TABLA DE CATEGORIA
	public static final String TABLE_CATEGORIA    = "\"CATEGORIA\""     ;
	public static final String COL_NOM_CATEGORIA  = "\"DES_CATEGORIA\"" ;
	
	// CONSTANTES TABLA DE CATEGORIA
	public static final String TABLE_CASA    = "\"CASA\""     ;
	public static final String COL_NOM_CASA  = "\"NOM_CASA\"" ;
	
	// CONSTANTES TABLA DE TIPO MOVIMIENTO
	public static final String COL_IDE_TIPO_MOVIMIENTO  = "\"IDE_TIPO_MOVIMIENTO\"";
	public static final String TABLE_TIPO_MOVIMIENTO    = "\"TIPO_MOVIMIENTO\""     ;
	public static final String COL_NOM_TIPO_MOVIMIENTO  = "\"DES_TIPO_MOVIMIENTO\"" ;
	
	// CONSTANTES TABLA DE MOVIMIENTOS
	public static final String COL_IDE_MOVIMIENTO  = "\"IDE_MOVIMIENTO\"" ;
	public static final String TABLE_MOVIMIENTO    = "\"MOVIMIENTO\""     ;
	public static final String COL_FEC_MOVIMIENTO  = "\"FEC_MOVIMIENTO\"" ;
	public static final String COL_VLR_UNITARIO    = "\"VLR_UNITARIO\""   ;
	public static final String COL_VLAR_TOTAL      = "\"VLR_TOTAL\""      ;
	public static final String COL_CANTIDAD        = "\"CANTIDAD\""       ;
}
