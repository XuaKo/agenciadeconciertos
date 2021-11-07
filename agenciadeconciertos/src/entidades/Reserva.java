package entidades;

import java.time.LocalDate;

public class Reserva {
	private long identificador;
	private LocalDate fecha;

	public Reserva(long identificador, LocalDate fecha) {
		super();
		this.identificador = identificador;
		this.fecha = fecha;
	}

	public long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(long identificador) {
		this.identificador = identificador;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

}
