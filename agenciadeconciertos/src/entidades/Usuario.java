package entidades;

public class Usuario {
	private long identificador;
	private String NombreyApellidos;
	private String email;
	private String NIF;
	private boolean verificado = false;

	public Usuario(long identificador, String nombreyApellidos, String email, String nIF, boolean verificado) {
		super();
		this.identificador = identificador;
		NombreyApellidos = nombreyApellidos;
		this.email = email;
		NIF = nIF;
		this.verificado = verificado;
	}

	public boolean isVerificado() {
		return verificado;
	}

	public void setVerificado(boolean verificado) {
		this.verificado = verificado;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

}
