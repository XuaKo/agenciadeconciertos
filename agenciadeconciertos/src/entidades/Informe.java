package entidades;

import java.util.Scanner;

public class Informe {
	private long idInforme;
	private String revision;

	public Informe() {

	}

	public Informe(long idInforme, String revision) {
		this.idInforme = idInforme;
		this.revision = revision;
	}

	public static Informe nuevoInforme() {
		Informe ret = new Informe();
		Scanner teclado = new Scanner(System.in);
		long idInforme = -1;
		String revision = "";
		boolean idvalido = false;
		do {
			System.out.print("Introduzca su identificador:");
			idInforme = teclado.nextLong();
			if (idInforme < 1) {
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

	public long getIdInforme() {
		return idInforme;
	}

	public void setIdInforme(long idInforme) {
		this.idInforme = idInforme;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public String toString() {
		return "Informe [id=" + idInforme + ", Revision=" + revision + "]";
	}

}
