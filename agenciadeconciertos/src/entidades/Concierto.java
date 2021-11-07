package entidades;

import java.time.LocalDate;

public class Concierto {

	public Concierto() {
		
	}

	protected long Identificador;
	protected LocalDate FechayHora;

	protected Concierto(long identificador, LocalDate fechayHora) {
		super();
		Identificador = identificador;
		FechayHora = fechayHora;
	}

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