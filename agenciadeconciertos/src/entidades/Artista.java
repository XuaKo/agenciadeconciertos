package entidades;

import java.util.Scanner;

public class Artista {
	private long idArtista;
	private String nombre_Artistico;
	private char genero;

	public Artista() {

	}

	public Artista(long idArtista, String nombre_Artistico, char genero) {

		this.idArtista = idArtista;
		this.nombre_Artistico = nombre_Artistico;
		this.genero = genero;

	}

	public static Artista nuevoArtista() {
		Artista ret = new Artista();
		Scanner teclado = new Scanner(System.in);
		long idArtista = -1;
		String nombre_Artistico = "";
		char genero;
		boolean idvalido = false;
		do {
			System.out.print("Introduzca su identificador:");
			idArtista = teclado.nextLong();
			if (idArtista < 1) {
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

	public long getidentIdArtista() {
		return idArtista;
	}

	public void setidentIdArtista(long idArtista) {
		this.idArtista = idArtista;
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
		return "Artista [Identificador=" + idArtista + ", Nombre_Artistico=" + nombre_Artistico + ", Genero="
				+ genero + "]";
	}

}
