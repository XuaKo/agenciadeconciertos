package entidades;

import java.time.LocalDate;
import java.util.Scanner;

import utils.Utiles;

public class Concierto {
	
	protected long identificado;
	protected LocalDate fechayhor;
	
    //constructor por defecto
	public Concierto() {
	}

    //constructor con todos los atributos de la clase
	public Concierto(long identificador, LocalDate fechayHora) {
		super();
		identificado = identificador;
		fechayhor = fechayHora;
	}
    //getters y setters
	public long getIdentificado() {
		return identificado;
	}

	public void setIdentificador(long identificador) {
		identificado = identificador;
	}

	public LocalDate getFechayHora() {
		return fechayhor;
	}

	public void setFechayHora(LocalDate fechayhora) {
		fechayhor = fechayhora;
	}
    //metodo to String
	public String toString() {
		return "Concierto [Identificador=" + identificado + ", FechayHora=" + fechayhor + "]";
	}
		
	//parece estar perfectamente declarado pero no funciona	
		public static Concierto nuevoconcierto() {
			Concierto ret = new Concierto();
			Scanner scan =new Scanner(System.in);
			long identificado = -1;
			LocalDate fechayhor; 
			System.out.println("indique cual es su identificador");
			identificado = scan.nextLong();
			System.out.println("indique el codigo de su descuento");
			fechayhor = Utiles.leerFecha();
			scan.close();
			return ret;
		
	}
	
   
	
	
	
}
