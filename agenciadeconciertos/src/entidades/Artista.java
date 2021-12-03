package entidades;

import java.util.Scanner;

public class Artista {
	private long identificador;
	private String nombre_Artistico;
	private char genero;

	public Artista() {

	}

	public Artista(long identificador, String nombre_Artistico, char genero) {

		this.identificador = identificador;
		this.nombre_Artistico = nombre_Artistico;
		this.genero = genero;

	}

	public Artista nuevoArtista() {
		Artista ret = new Artista();
		Scanner teclado = new Scanner(System.in);
		boolean idvalido = false;
		do {
			System.out.print("Introduzca su identificador:");
			identificador = teclado.nextLong();
			if (identificador < 1) {
				System.out.println("El identificador ha de ser mayor que 0");
				idvalido = false;
			} else {
				idvalido = true;
			}
		} while (!idvalido);
		System.out.print("Introduzca su nombre artistico:");
		nombre_Artistico = teclado.next();
		System.out.print("Introduzca la inicial de su genero musical:");
		genero = teclado.nextLine().charAt(0);

		teclado.close();
		return ret;
	}

	public long getidentIdenficador() {
		return identificador;
	}

	public void setidentIdenficador(long identificador) {
		this.identificador = identificador;
	}

	public String getNombre_Artistico() {
		return nombre_Artistico;
	}

	public void setNombre_Artistico(String nombre_artistico) {
		nombre_Artistico = nombre_artistico;
	}

	public long getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String toString() {
		return "Artista [Identificador=" + identificador + ", Nombre_Artistico=" + nombre_Artistico + ", Genero="
				+ genero + "]";
	}

}
