package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import utils.Utiles;
	
public class Gira {
	private long idGira;
	private String nombreGira;
	private LocalDate fechaApertura;
	private LocalDate fechaCierre;
	
	//conexion con concierto (segun el diagrama de clases deberia ser al reves,pero la logica me dice que un objeto gira puede tener una lista de 
	//conciertos,y que un concierto pertenece a una sola gira
	ArrayList<Concierto>conciertos=new ArrayList<Concierto>();

	public Gira() {
	}

	public Gira(long idGira, String nombreGira, LocalDate fechaApertura, LocalDate fechaCierre) {
		this.idGira = idGira;
		this.nombreGira = nombreGira;
		this.fechaApertura = fechaApertura;
		this.fechaCierre = fechaCierre;

	}

	public static Gira nuevaGira() {
		Gira gira1 = new Gira();
		Scanner teclado = new Scanner(System.in);
		long idGira = -1;
		String nombreGira = "";
		LocalDate fechaApertura;
		LocalDate fechaCierre;
		boolean idvalido = false;
		do {
			System.out.print("Introduzca su identificador:");
			idGira = teclado.nextLong();
			if (idGira < 1) {
				System.out.println("El identificador ha de ser mayor que 0");
				idvalido = false;
			} else {
				idvalido = true;
			}
		} while (!idvalido);
		System.out.print("Introduzca el nombre de la gira:");
		nombreGira = teclado.next();
		System.out.print("Introduzca la fecha de apertura de la gira:");
		fechaApertura = Utiles.leerFecha();
		System.out.print("Introduzca la fecha de cierre de la gira:");
		fechaCierre = Utiles.leerFecha();
		
		teclado.close();
		return gira1;
	}

	public long getIdGira() {
		return idGira;
	}

	public void setIdGira(long idGira) {
		this.idGira = idGira;
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
		return "Gira [id=" + idGira + ", NombreGira=" + nombreGira + ", FechaApertura=" + fechaApertura + ", FechaCierre=" + fechaCierre
				+ "]";
	}

}
