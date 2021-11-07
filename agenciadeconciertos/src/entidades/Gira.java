package entidades;

import java.time.LocalDate;

public class Gira {

	private String NombreUnico;
	private LocalDate FechaApertura;
	private LocalDate FechaCierre;

	private Gira(String nombreUnico, LocalDate fechaApertura, LocalDate fechaCierre) {
		super();
		NombreUnico = nombreUnico;
		FechaApertura = fechaApertura;
		FechaCierre = fechaCierre;
	}

	public String getNombreUnico() {
		return NombreUnico;
	}

	public void setNombreUnico(String nombreUnico) {
		NombreUnico = nombreUnico;
	}

	public LocalDate getFechaApertura() {
		return FechaApertura;
	}

	public void setFechaApertura(LocalDate fechaApertura) {
		FechaApertura = fechaApertura;
	}

	public LocalDate getFechaCierre() {
		return FechaCierre;
	}

	public void setFechaCierre(LocalDate fechaCierre) {
		FechaCierre = fechaCierre;
	}

}
