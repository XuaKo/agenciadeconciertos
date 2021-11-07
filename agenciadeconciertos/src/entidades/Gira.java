package entidades;

import java.time.LocalDate;

public class Gira {

	private String NombreGira;
	private LocalDate FechaApertura;
	private LocalDate FechaCierre;

	public Gira(String nombreUnico, LocalDate fechaApertura, LocalDate fechaCierre) {
		NombreGira = nombreUnico;
		FechaApertura = fechaApertura;
		FechaCierre = fechaCierre;
	}

	public String getNombreGira() {
		return NombreGira;
	}

	public void setNombreUnico(String nombreGira) {
		NombreGira = nombreGira;
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

	public String toString() {
		return "Gira [NombreGira=" + NombreGira + ", FechaApertura=" + FechaApertura + ", FechaCierre=" + FechaCierre
				+ "]";
	}

}
