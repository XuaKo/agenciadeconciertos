package entidades;
//autor Germ�n


import java.time.LocalDate;
import java.util.Scanner;
///*Aqu� puse los atributos*
public class Momento {
	private long idMomento;
	private String descripcion;
	private LocalDate fecha;
	
	
	//Aqu� est� el construcor de los atributos 
	public Momento(long idMomento, String descripcion, LocalDate fecha) {
		this.idMomento = idMomento;
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
		long idMomento = -1;
		String descripcion = "";
		System.out.print("introuzca el identificador");
		idMomento = read.nextLong();
		//bucle while para validaar el identificador
		boolean bool1 = false;
		if(idMomento < 0){
			while(!bool1) {
				System.out.print("El identificador es incorrecto");
				read.nextLong();
				if(idMomento > 0){
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
	public long getIdMomento() {
		return idMomento;
	}
	//setter de identificador
	public void setIdMomento(long idMomento) {
		this.idMomento = idMomento;
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
		return "Momento [Identificador=" + idMomento + ", Descripcion=" + descripcion + ", Fecha=" + fecha + "]";
	}

}
