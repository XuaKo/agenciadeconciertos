package entidades;
import java.time.LocalDate;
import java.util.Scanner;

import utils.Utiles;
public class Reserva {
	//autor Gabriel
	
	//atributos de la clase
    private long identificador;
    private LocalDate fecha;
    private boolean entradaCanjeada = false;
    //constructor por defecto
    public Reserva() {
    	
    }
    //constructor con todos los atributos
    public Reserva(long identificador, LocalDate fecha, boolean entradaCanjeada) {
        super();
        this.identificador = identificador;
        this.fecha = fecha;
        entradaCanjeada = this.entradaCanjeada;
    }
    //getters y setters
    public boolean isentradaCanjeada() {
        return entradaCanjeada;
    }
    public void setEntradaCanjeada(boolean entradaCanjeada) {
        entradaCanjeada = this.entradaCanjeada;
    }
    public long getIdentificador() {
        return identificador;
    }
    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    //metodo to string
    public String toString() {
        return "Reserva [identificador=" + identificador + ", fecha=" + fecha + ", EntradaCanjeada=" + entradaCanjeada
                + "]";
    }
    
    public static Reserva nuevareserva() {
    	Reserva ret= new Reserva();
    	Scanner sc = new Scanner (System.in);
    	long identificador = -1;
    	LocalDate fecha;
    	boolean entradaCanjeada = false;
    	boolean idvalido = false;
		do {
			System.out.print("Introduzca su identificador:");
			identificador = sc.nextLong();
			if (identificador < 1) {
				System.out.println("El identificador ha de ser mayor que 0");
				idvalido = false;
			} else {
				idvalido = true;
			}
		} while (!idvalido);
		System.out.println("Introduzca la fecha de la rserva:");
		fecha = Utiles.leerFecha();
		System.out.println("Su entrada ha sido canjeada ('true' para si, 'false' para no):");
		entradaCanjeada = sc.nextBoolean();
    	return ret;// aqui hace ek reuturn
    	
    }
}
