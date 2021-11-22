package entidades;
import java.util.ArrayList;
import java.util.Scanner;


public class Actuacion {
	private long identificacion;
	private int numero_Secuencia;
	private int duracion;
	Scanner read = new Scanner(System.in);
	private ArrayList<Artista> artistas = new ArrayList<Artista>();
	

	public Actuacion(long identificacion, int numero_Secuencia, int duracion, ArrayList<Artista> artista) {
		this.identificacion = identificacion;
		this.numero_Secuencia = numero_Secuencia;
		this.duracion = duracion;
		this.artistas = artistas;
		boolean bool1 = false;
		boolean bool2 = false;
		
		System.out.print("introduzca la identificación");
		identificacion = read.nextLong();
		System.out.print("introduzca el numero de secuencia");
		numero_Secuencia = read.nextInt();
		System.out.print("introduzca la duración de la actuación");
		duracion = read.nextInt();
			
		if(duracion < 1| duracion>5) {
			while(bool1 == false) {
				System.out.print("la duracion o bien es demasiado corta o demasiada larga porfavor introduzca otra");
				duracion = read.nextInt();
				if(duracion > 1|duracion < 5) {
					bool1 = true;
				}
			}
		}
		if(numero_Secuencia < 5|numero_Secuencia > 10) {
			while(bool2 == false) {
				System.out.print("el numero de secuencia no cumple los requisitos porfavor");
				duracion = read.nextInt();
				if(duracion > 5| duracion < 10){
					bool2 = true;
				}
			}
		}
		
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
	

	public ArrayList<Artista> getTArtistas() {
        return artistas;
    }
	
	public void setArtista(ArrayList<Artista> artistas) {
		this.artistas = artistas;
	}
}
