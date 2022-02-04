package entidades;

import java.util.Scanner;

public class Usuario {
	private long identificador;
	private String NombreyApellidos;
	private String email;
	private String NIF;
	private boolean verificado = false;

	public Usuario() {

	}

	public Usuario(long identificador, String nombreyApellidos, String email, String nIF, boolean verificado) {
		this.identificador = identificador;
		NombreyApellidos = nombreyApellidos;
		this.email = email;
		NIF = nIF;
		this.verificado = verificado;
	}

	public static Usuario nuevoUsuario() {
		Usuario usuario1 = new Usuario();
		Scanner teclado = new Scanner(System.in);
		long identificador = -1;
		String NombreyApellidos = "";
		String email = "";
		String NIF = "";
		boolean idvalido = false;
		do {
			System.out.print("Introduzca su identificador:");
			identificador = teclado.nextLong();
			if (identificador < 1) {
				System.out.println("El identificador ha de ser mayor que 0");
				idvalido = false;
			} else {
				idvalido = true;
			}
		} while (!idvalido);
		System.out.println("Escriba su nombre y apellidos:");
		NombreyApellidos = teclado.next();
		System.out.println("Escriba su email:");
		email = teclado.next();
		System.out.println("Escriba el NIF:");
		NIF = teclado.next();
		System.out.println("Indique si el usuario esta verificado o no(true/false):");
		teclado.nextBoolean();
		teclado.close();
		return usuario1;
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

	public String toString() {
		return "Usuario [identificador=" + identificador + ", NombreyApellidos=" + NombreyApellidos + ", email=" + email
				+ ", NIF=" + NIF + ", verificado=" + verificado + "]";
	}

}
