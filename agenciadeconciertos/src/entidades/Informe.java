package entidades;

import java.util.Scanner;

public class Informe {
	private long id;
	private String revision;

	public Informe() {

	}

	public Informe(long id, String revision) {
		this.id = id;
		this.revision = revision;
	}

	public static Informe nuevoInforme() {
		Informe ret = new Informe();
		Scanner teclado = new Scanner(System.in);
		long id = -1;
		String revision = "";
		boolean idvalido = false;
		do {
			System.out.print("Introduzca su identificador:");
			id = teclado.nextLong();
			if (id < 1) {
				System.out.println("El identificador ha de ser mayor que 0");
				idvalido = false;
			} else {
				idvalido = true;
			}
		} while (!idvalido);
		System.out.print("Redacte su revision:");
		revision = teclado.next();
		teclado.close();
		return ret;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public String toString() {
		return "Informe [id=" + id + ", Revision=" + revision + "]";
	}

}
