package entidades;

import java.time.LocalDate;
import java.util.Scanner;

public class Momento {
	private long identificador;
	private String descripcion;
	private LocalDate fecha;
	Scanner read =  new Scanner(System.in);

	public Momento(long identificador, String descripcion, LocalDate fecha) {
		this.identificador = identificador;
		this.descripcion = descripcion;
		this.fecha = fecha;
		
		System.out.print("introuzca el identificador");
		identificador = read.nextLong();
		System.out.print("introduzca una descripcion");
		descripcion = read.next();
		System.out.print("introduce la fecha");
		fecha.adjustInto(fecha);
		
		
	}

	public long getIdentificador() {
		return identificador;
	}

	public void setidentificador(long identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String toString() {
		return "Momento [Identificador=" + identificador + ", Descripcion=" + descripcion + ", Fecha=" + fecha + "]";
	}

}
