package entidades;

import java.time.LocalDate;

public class Momento {
	private long Identificador;
	private String Descripcion;
	private LocalDate Fecha;

	public Momento(long identificador, String descripcion, LocalDate fecha) {
		super();
		Identificador = identificador;
		Descripcion = descripcion;
		Fecha = fecha;
	}

	public long getIdentificador() {
		return Identificador;
	}

	public void setidentificador(long identificador) {
		Identificador = identificador;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public LocalDate getFecha() {
		return Fecha;
	}

	public void setFecha(LocalDate fecha) {
		Fecha = fecha;
	}

}
