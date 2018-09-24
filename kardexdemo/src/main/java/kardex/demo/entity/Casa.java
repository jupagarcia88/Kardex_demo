package kardex.demo.entity;

public class Casa {
	
	private long   ideCasa;
	private String nomCasa;
	
	public Casa(long ideCasa, String nomCasa) {
		this.ideCasa = ideCasa;
		this.nomCasa = nomCasa;
	}
	
	public long getIdeCasa() {
		return ideCasa;
	}
	public void setIdeCasa(long ideCasa) {
		this.ideCasa = ideCasa;
	}
	public String getNomCasa() {
		return nomCasa;
	}
	public void setNomCasa(String nomCasa) {
		this.nomCasa = nomCasa;
	}

}
