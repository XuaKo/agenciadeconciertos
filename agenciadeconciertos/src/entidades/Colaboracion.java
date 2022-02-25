package entidades;

import java.time.LocalDate;

public class Colaboracion extends Concierto {

	public Colaboracion() {
		

	}
  // quien tenia esta clase como protected
	public Colaboracion(long identificador, LocalDate fechayHora) {
		super(identificador, fechayHora);

	}
	public String toString() {
		return "Colaboracion []";
	}

}
