package entidades;

public class Reportero {
	private String NombreyApellidos;
	private String NIF;
	private int Telefono;

	private Reportero(String nombreyApellidos, String nIF, int telefono) {
		super();
		NombreyApellidos = nombreyApellidos;
		NIF = nIF;
		Telefono = telefono;
	}

	public String getNombreyApellidoos() {
		return NombreyApellidos;
	}

	public void setNombreyApellidos(String nombreyapellidos) {
		NombreyApellidos = nombreyapellidos;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nif) {
		NIF = nif;
	}

	public int gettelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}

}
