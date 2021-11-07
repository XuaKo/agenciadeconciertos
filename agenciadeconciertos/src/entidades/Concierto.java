package entidades;

import java.time.LocalDate;

public class Concierto {

	protected long Identificador;
	protected LocalDate FechayHora;

	public long getIdentificador() {
		return Identificador;
	}

	public void setIdentificador(long identificador) {
		Identificador = identificador;
	}

	public LocalDate getFechayHora() {
		return FechayHora;
	}

	public void setFechayHora(LocalDate fechayhora) {
		FechayHora = fechayhora;
	}

}
