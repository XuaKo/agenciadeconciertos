package entidades;

public class Artista {
	private long Identificador;
	private String Nombre_Artistico;
	private long Genero;

	private Artista(long identificador, String nombre_Artistico, long genero) {
		super();
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

	public void setGenero(long genero) {
		Genero = genero;
	}

}
