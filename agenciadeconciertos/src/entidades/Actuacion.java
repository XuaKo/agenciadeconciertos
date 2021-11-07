package entidades;

public class Actuacion {
	private long Identificacion;
	private int Numero_Secuencia;
	private String Duracion;

	
	public Actuacion(long identificacion, int numero_Secuencia, String duracion) {
		super();
		Identificacion = identificacion;
		Numero_Secuencia = numero_Secuencia;
		Duracion = duracion;
	}


	public long getIdentificacion() {
		return Identificacion;
	}

	public void setIdentificacion(long identificacion) {
		Identificacion = identificacion;
	}

	public int getNumero_Secuencia() {
		return Numero_Secuencia;
	}

	public void setNumero_Secuencia(int numero_secuencia) {
		Numero_Secuencia = numero_secuencia;
	}

	public String getDuracion() {
		return Duracion;
	}

	public void setDuracion(String duracion) {
		Duracion = duracion;
	}

}
