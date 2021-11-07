package entidades;

public class Usuario {
	private long identificador;
	private String NombreyApellidos;
	private long email;
	private String NIF;

	public Usuario(long identificador, String nombreyApellidos, long email, String nIF) {
		super();
		this.identificador = identificador;
		NombreyApellidos = nombreyApellidos;
		this.email = email;
		NIF = nIF;
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
