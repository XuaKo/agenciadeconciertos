package entidades;

import java.time.LocalDate;

public class Gira {

	private String NombreUnico;
	private LocalDate FechaApertura;
	private LocalDate FechaCierre;

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
