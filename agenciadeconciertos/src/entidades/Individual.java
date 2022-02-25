package entidades;

import java.time.LocalDate;

public class Individual extends Concierto {

	public Individual() {
	}

	public Individual(long idConcierto, LocalDate fechayHora) {
		super(idConcierto, fechayHora);
	}

	public String toString() {
		return "Individual []";
	}

}
