package entidades;

import java.time.LocalDate;

import java.util.Scanner;

import utils.Utiles;
	
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

	public static Gira nuevaGira() {
		Gira gira1 = new Gira();
		Scanner teclado = new Scanner(System.in);
		String nombreGira = "";
		LocalDate fechaApertura;
		LocalDate fechaCierre;
		System.out.print("Introduzca el nombre de la gira:");
		nombreGira = teclado.next();
		System.out.print("Introduzca la fecha de apertura de la gira:");
		fechaApertura = Utiles.leerFecha();
		System.out.print("Introduzca la fecha de cierre de la gira:");
		fechaCierre = Utiles.leerFecha();
		
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
