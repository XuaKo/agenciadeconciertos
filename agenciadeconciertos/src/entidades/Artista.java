package entidades;

public class Artista {
	private long Identificador;
	private String Nombre_Artistico;
	private char Genero;

	public Artista(long identificador, String nombre_Artistico, char genero) {
	
		Identificador = identificador;
		Nombre_Artistico = nombre_Artistico;
		Genero = genero;
	}

	public long getidentIdenficador() {
		return Identificador;
	}

	public void setidentIdenficador(long identificador) {
		Identificador = identificador;
	}

	public String getNombre_Artistico() {
		return Nombre_Artistico;
	}

	public void setNombre_Artistico(String nombre_artistico) {
		Nombre_Artistico = nombre_artistico;
	}

	public long getGenero() {
		return Genero;
	}

	public void setGenero(char genero) {
		Genero = genero;
	}

	public String toString() {
		return "Artista [Identificador=" + Identificador + ", Nombre_Artistico=" + Nombre_Artistico + ", Genero="
				+ Genero + "]";
	}

}
