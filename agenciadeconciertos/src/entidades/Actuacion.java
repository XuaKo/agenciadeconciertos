package entidades;
import java.util.ArrayList;
import java.util.Scanner;
//autor Germ�n

///*Aqu� puse los atributos*
public class Actuacion {
	private long identificacion;
	private int numero_Secuencia;
	private int duracion;
	private ArrayList<Momento> momento = new ArrayList<Momento>();
	
//Aqu� est� el construcor de los atributos 
	public Actuacion(long identificacion, int numero_Secuencia, int duracion, ArrayList<Momento>momento){// con este ultimo atributo se esteblece relaci�n con la clase momento// 
		this.identificacion = identificacion;
		this.numero_Secuencia = numero_Secuencia;
		this.duracion = duracion;
		this.momento = momento;
	}
	//constructor por defecto de Actuacion
	public  Actuacion() {
		 
	}
	// en este metodo se introduce informacion en los difernetes metodos
	public  Actuacion nuevaActuacion() {
		Actuacion ret = new Actuacion();// se hace el ret para poder hacer un return
		Scanner read = new Scanner(System.in);
		
		System.out.print("introduzca la identificaci�n");
		identificacion = read.nextLong();
		//bucle while para validaar la identificacion
		boolean bool1 = false;
		if (identificacion <0) {
			while(!bool1) {
				System.out.print("identificaion incorrecta");
				identificacion = read.nextLong();
				if (identificacion > 1) {
					bool1 = true;
				}
			}
		}
		
		System.out.print("introduzca el numero de secuencia");
		numero_Secuencia = read.nextInt();
		//bucle while para validar el numero de secuencia
		boolean bool2= false;
		if(numero_Secuencia < 5|| numero_Secuencia > 10) {
			while(!bool2) {
				System.out.print("el numero de secuencia no cumple los requisitos porfavor");
				duracion = read.nextInt();
				if(duracion > 5| duracion < 10){
					bool2 = true;
				}
			}
		}
		
		System.out.print("introduzca la duraci�n de la actuaci�n");
		duracion = read.nextInt();
		//bucle while para validar la duracion		
		boolean  bool3 = false;
		if(duracion < 1|| duracion>5) {
			while(!bool3 ) {
				System.out.print("la duracion o bien es demasiado corta o demasiada larga porfavor introduzca otra");
				duracion = read.nextInt();
				if(duracion > 1|duracion < 5) {
					bool3 = true;
				}
			}
		}
		read.close();//con esto se cierra el scanner
		return ret;//aqui se ejecuta el return
	}
		
		
	
	//getter de identificacion
	public long getIdentificacion() {
		return identificacion;
	}
	//setter de identificacion
	public void setIdentificacion(long identificacion) {
		this.identificacion = identificacion;
	}
	//getter de n�mero de secuencia
	public int getNumero_Secuencia() {
		return numero_Secuencia;
	}
	//setter de n�mero de secuecia 
	public void setNumero_Secuencia(int numero_secuencia) {
		this.numero_Secuencia = numero_secuencia;
	}
	//getter de duraci�n
	public int getDuracion() {
		return duracion;
	}
	//setter de durac�n
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	// Aqu� se mete los Strings
	public String toString() {
		return "Actuacion [Identificacion=" + identificacion + ", Numero_Secuencia=" + numero_Secuencia + ", Duracion="
				+ duracion + "]";
	}
	
	//getter de <Momento> 
	public ArrayList<Momento> getTMomento() {
        return momento;
    }
	// setter de <Momento>
	public void setArtista(ArrayList<Momento> momento) {
		this.momento = momento;
	}
}
