package entidades;

import java.time.LocalDate;
import java.util.Scanner;

import utils.Utiles;

public class Concierto {
	
	protected long idConcierto;
	protected LocalDate fechayhor;
	
    //constructor por defecto
	public Concierto() {
	}

    //constructor con todos los atributos de la clase

	public Concierto(long idConcierto, LocalDate fechayHora) {

		super();
		this.idConcierto = idConcierto;
		this.fechayhor = fechayHora;
	}
    //getters y setters
	public long getIdConcierto() {
		return idConcierto;
	}

	public void setIdConcierto(long idConcierto) {
		this.idConcierto = idConcierto;
	}

	public LocalDate getFechayHora() {
		return fechayhor;
	}

	public void setFechayHora(LocalDate fechayhora) {
		fechayhor = fechayhora;
	}
    //metodo to String
	public String toString() {
		return "Concierto [Identificador=" + idConcierto + ", FechayHora=" + fechayhor + "]";
	}
		
	//parece estar perfectamente declarado pero no funciona	
		public static Concierto nuevoconcierto() {
			Concierto ret = new Concierto();
			Scanner scan =new Scanner(System.in);
			long idConcierto = -1;
			LocalDate fechayhor; 
			System.out.println("indique cual es su identificador");
			idConcierto = scan.nextLong();
			System.out.println("indique el codigo de su descuento");
			fechayhor = Utiles.leerFecha();
			scan.close();
			return ret;
		
	}
	
   
	
	
	
}
