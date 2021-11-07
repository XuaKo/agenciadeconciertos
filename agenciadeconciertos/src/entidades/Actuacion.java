package entidades;

public class Actuacion {
	private long Identificacion;
	private String Numero_Secuencia;
	private String Duracion;

	public Actuacion(long identificacion, String numero_Secuencia, String duracion) {
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

	public String getNumero_Secuencia() {
		return Numero_Secuencia;
	}

	public void setNumero_Secuencia(String numero_secuencia) {
		Numero_Secuencia = numero_secuencia;
	}

	public String getDuracion() {
		return Duracion;
	}

	public void setDuracion(String duracion) {
		Duracion = duracion;
	}

	public String toString() {
		return "Actuacion [Identificacion=" + Identificacion + ", Numero_Secuencia=" + Numero_Secuencia + ", Duracion="
				+ Duracion + "]";
	}

}
