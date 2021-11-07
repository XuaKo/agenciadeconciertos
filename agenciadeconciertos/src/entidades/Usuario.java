package entidades;

public class Usuario {
	long identificador;
	String NombreyApellidos;
	long email;
	String NIF;

	public long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(long identificador) {
		this.identificador = identificador;
	}

	public String getNombreyApellidos() {
		return NombreyApellidos;
	}

	public void setNombreyApellidos(String nombreyApellidos) {
		NombreyApellidos = nombreyApellidos;
	}

	public long getEmail() {
		return email;
	}

	public void setEmail(long email) {
		this.email = email;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

}
