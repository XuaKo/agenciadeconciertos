package entidades;

public class Reportero {
	private String NombreyApellidos;
	private String NIF;
	private String Telefono;

	public Reportero(String nombreyApellidos, String nIF, String telefono) {
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

	public String gettelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String toString() {
		return "Reportero [NombreyApellidos=" + NombreyApellidos + ", NIF=" + NIF + ", Telefono=" + Telefono + "]";
	}

}
