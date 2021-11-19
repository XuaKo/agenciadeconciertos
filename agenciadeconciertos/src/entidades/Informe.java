package entidades;

import java.util.Scanner;

public class Informe {
	private long id;
	private String revision;

	Scanner teclado = new Scanner(System.in);

	public Informe(long id, String revision) {
		this.id = id;
		this.revision = revision;

		System.out.print("Introduzca su identificador:");
		id = teclado.nextLong();
		System.out.print("Redacte su revision:");
		revision = teclado.next();
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
