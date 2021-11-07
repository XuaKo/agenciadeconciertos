package entidades;

import java.time.LocalDate;

public class Momento {
	private long Identificador;
	private String Descripcion;
	private LocalDate Hora;

	private Momento(long identificador, String descripcion, LocalDate hora) {
		super();
		Identificador = identificador;
		Descripcion = descripcion;
		Hora = hora;
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

	public LocalDate getHora() {
		return Hora;
	}

	public void setHora(LocalDate hora) {
		Hora = hora;
	}

}
