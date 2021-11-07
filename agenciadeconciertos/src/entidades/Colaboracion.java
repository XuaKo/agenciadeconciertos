package entidades;

import java.time.LocalDate;

public class Colaboracion extends Concierto {

	protected Colaboracion() {
		super();

	}

	protected Colaboracion(long identificador, LocalDate fechayHora) {
		super(identificador, fechayHora);

	}
	public String toString() {
		return "Colaboracion []";
	}

}
