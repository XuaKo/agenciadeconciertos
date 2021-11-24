package entidades;

import java.time.LocalDate;

import java.util.Scanner;
	
public class Gira {

	private String nombreGira;
	private LocalDate fechaApertura;
	private LocalDate fechaCierre;

	public Gira() {

	}

	public Gira(String nombreGira, LocalDate fechaApertura, LocalDate fechaCierre) {
		this.nombreGira = nombreGira;
		this.fechaApertura = fechaApertura;
		this.fechaCierre = fechaCierre;

	}

	public Gira nuevaGira() {
		Gira gira1 = new Gira();
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el nombre de la gira:");
		nombreGira = teclado.next();
		LocalDate fechaApertura = LocalDate.of(0, 0, 0);
		gira1.setFechaApertura(fechaApertura);
		LocalDate fechaCierre = LocalDate.of(0, 0, 0);
		gira1.setFechaCierre(fechaCierre);
		teclado.close();
		return gira1;
	}

	public String getNombreGira() {
		return nombreGira;
	}

	public void setNombreUnico(String nombreGira) {
		this.nombreGira = nombreGira;
	}

	public LocalDate getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public LocalDate getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(LocalDate fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	public String toString() {
		return "Gira [NombreGira=" + nombreGira + ", FechaApertura=" + fechaApertura + ", FechaCierre=" + fechaCierre
				+ "]";
	}

}
