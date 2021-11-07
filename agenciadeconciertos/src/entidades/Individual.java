package entidades;

import java.time.LocalDate;

public class Individual extends Concierto {

	protected Individual() {
	}

	protected Individual(long identificador, LocalDate fechayHora) {
		super(identificador, fechayHora);
	}

	public String toString() {
		return "Individual []";
	}

}
