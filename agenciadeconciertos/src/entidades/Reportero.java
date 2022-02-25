package entidades;


//importamos la clase arraylist para poder implementarla
import java.util.ArrayList;
import java.util.Scanner;
//autor Germ�n

///*Aqu� puse los atributos*
public class Reportero {
	private String nombreyApellidos;
	private String nif;
	private int telefono;
	
	//autor de la conexion con momento:Gabriel importante:no se si es correcta pero adjunto el link de donde saque la informacion para
	//realizar la conexion link:https://www.youtube.com/watch?v=BGStNPa0qRk&t=7s
	
	//declaramos un arraylist que tendra en su interior objetos de tipo Momento, con el que hay una relacion de 1:N por lo cual un reportero
	//puede tener muchos momentos
	public ArrayList<Momento> momentos= new ArrayList<Momento>();
	
    //getters y setters del arraylist
	public ArrayList<Momento> getMomentos() {
		return momentos;
	}

	public void setMomentos(ArrayList<Momento> momentos) {
		this.momentos = momentos;
	}

	// Aqu� est� el construcor de los atributos
	public Reportero(String nombreyApellidos, String nif, int telefono) {
		this.nombreyApellidos = nombreyApellidos;
		this.nif = nif;
		this.telefono = telefono;
	}

	// Aqu� est� el construcor de los Reportero
	public Reportero() {
	}

	// en este metodo se introduce informacion en los difernetes metodos
	public static Reportero nuevoReportero() {
		Reportero ret = new Reportero(); // se hace el ret para poder hacer un return
		Scanner read = new Scanner(System.in);
		String nombreyApellidos = "";
		String nif = "";
		int telefono = -1;
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

	// Aqui est� los strings
	public String toString() {
		return "Reportero [NombreyApellidos=" + nombreyApellidos + ", NIF=" + nif + ", Telefono=" + telefono + "]";
	}

}
