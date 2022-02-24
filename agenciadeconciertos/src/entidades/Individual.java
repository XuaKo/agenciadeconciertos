package entidades;

import java.time.LocalDate;

public class Individual extends Concierto {

	protected Individual() {
	}

	protected Individual(long idConcierto, LocalDate fechayHora) {
		super(idConcierto, fechayHora);
	}

	public String toString() {
		return "Individual []";
	}

}
