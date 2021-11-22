package entidades;
import java.util.Scanner;

public class Reportero {
	private String nombreyApellidos;
	private String nif;
	private int telefono;
	Scanner read = new Scanner(System.in);

	public Reportero(String nombreyApellidos, String nif, int telefono) {
		this.nombreyApellidos = nombreyApellidos;
		this.nif = nif;
		this.telefono = telefono;
		
		System.out.print("introduce el nombre y ek apellido");
		nombreyApellidos = read.next();
		System.out.print("introduce el NIF");
		nif = read.next();
		System.out.print("introduce el telefono");
		telefono = read.nextInt();
		
		
		
	}

	public String getNombreyApellidoos() {
		return nombreyApellidos;
	}

	public void setNombreyApellidos(String nombreyapellidos) {
		nombreyApellidos = nombreyapellidos;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public int gettelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String toString() {
		return "Reportero [NombreyApellidos=" + nombreyApellidos + ", NIF=" + nif + ", Telefono=" + telefono + "]";
	}

}
