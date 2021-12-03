package entidades;

import java.util.Scanner;
//autor Germán

///*Aquí puse los atributos*
public class Reportero {
	private String nombreyApellidos;
	private String nif;
	private int telefono;

	// Aquí está el construcor de los atributos
	public Reportero(String nombreyApellidos, String nif, int telefono) {
		this.nombreyApellidos = nombreyApellidos;
		this.nif = nif;
		this.telefono = telefono;
	}

	// Aquí está el construcor de los Reportero
	public Reportero() {
	}

	// en este metodo se introduce informacion en los difernetes metodos
	public Reportero nuevoReportero() {
		Reportero ret = new Reportero(); // se hace el ret para poder hacer un return
		Scanner read = new Scanner(System.in);

		System.out.print("introduce el nombre y el apellido");
		nombreyApellidos = read.next();

		System.out.print("introduce el NIF");
		nif = read.next();

		System.out.print("introduce el telefono");
		telefono = read.nextInt();

		read.close();

		return ret;// aqui se ejecuta el return
	}

	// getter de nombre y apellidos
	public String getNombreyApellidoos() {
		return nombreyApellidos;
	}

	// setter de nombre y apellidos
	public void setNombreyApellidos(String nombreyapellidos) {
		nombreyApellidos = nombreyapellidos;
	}

	// getter de NIF
	public String getNif() {
		return nif;
	}

	// setter de NIF
	public void setNif(String nif) {
		this.nif = nif;
	}

	// getter de telefono
	public int gettelefono() {
		return telefono;
	}

	// setter de telefono
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	// Aqui está los strings
	public String toString() {
		return "Reportero [NombreyApellidos=" + nombreyApellidos + ", NIF=" + nif + ", Telefono=" + telefono + "]";
	}

}
