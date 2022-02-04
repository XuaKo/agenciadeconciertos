package entidades;
//autor Germ�n


import java.time.LocalDate;
import java.util.Scanner;
///*Aqu� puse los atributos*
public class Momento {
	private long identificador;
	private String descripcion;
	private LocalDate fecha;
	
	
	
	//Aqu� est� el construcor de los atributos 
	public Momento(long identificador, String descripcion, LocalDate fecha) {
		this.identificador = identificador;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}
	//constructor por defecto de Momento	
	public Momento() {
	}
	// en este metodo se introduce informacion en los difernetes metodos
	public static Momento nuevoMomento() {
		Scanner read =  new Scanner(System.in);
		Momento ret = new Momento();// se hace el ret para poder hacer un return
		long identificador = -1;
		String descripcion = "";
		System.out.print("introuzca el identificador");
		identificador = read.nextLong();
		//bucle while para validaar el identificador
		boolean bool1 = false;
		if(identificador < 0){
			while(!bool1) {
				System.out.print("El identificador es incorrecto");
				read.nextLong();
				if(identificador > 0){
					bool1 = true;
				}
			}
		}
		
		System.out.print("introduzca una descripcion");
		descripcion = read.next();
		System.out.print("introduce la fecha");
		
		
		read.close();//con esto se cierra el scanner
		return ret;//aqui se ejecuta el return
	}
		
		
		
	
	//getter de identificacdor
	public long getIdentificador() {
		return identificador;
	}
	//setter de identificador
	public void setidentificador(long identificador) {
		this.identificador = identificador;
	}
	//getter de descripcion
	public String getDescripcion() {
		return descripcion;
	}
	//setter de identificador
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	//getter de fecha
	public LocalDate getFecha() {
		return fecha;
	}
	//setter de descripcion
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	//Aqu� esta el string
	public String toString() {
		return "Momento [Identificador=" + identificador + ", Descripcion=" + descripcion + ", Fecha=" + fecha + "]";
	}

}
