package entidades;
import java.util.ArrayList;
import java.util.Scanner;


public class Actuacion {
	private long identificacion;
	private int numero_Secuencia;
	private int duracion;
	private ArrayList<Momento> momento = new ArrayList<Momento>();
	

	public Actuacion(long identificacion, int numero_Secuencia, int duracion, ArrayList<Momento>momento) {
		this.identificacion = identificacion;
		this.numero_Secuencia = numero_Secuencia;
		this.duracion = duracion;
		this.momento = momento;
	}
	
	public  Actuacion() {
		 
	}
	
	public  Actuacion nuevaActuacion() {
		Actuacion ret = new Actuacion();
		Scanner read = new Scanner(System.in);
		
		System.out.print("introduzca la identificación");
		identificacion = read.nextLong();
		
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
		
		System.out.print("introduzca la duración de la actuación");
		duracion = read.nextInt();
				
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
		return ret;
	}
		
		
	

	public long getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(long identificacion) {
		this.identificacion = identificacion;
	}

	public int getNumero_Secuencia() {
		return numero_Secuencia;
	}

	public void setNumero_Secuencia(int numero_secuencia) {
		this.numero_Secuencia = numero_secuencia;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String toString() {
		return "Actuacion [Identificacion=" + identificacion + ", Numero_Secuencia=" + numero_Secuencia + ", Duracion="
				+ duracion + "]";
	}
	

	public ArrayList<Momento> getTMomento() {
        return momento;
    }
	
	public void setArtista(ArrayList<Momento> momento) {
		this.momento = momento;
	}
}
