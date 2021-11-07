package entidades;

import java.time.LocalDate;

public class Reserva {
	private long identificador;
	private LocalDate fecha;
	private boolean EntradaCanjeada = false;

	public Reserva(long identificador, LocalDate fecha, boolean entradaCanjeada) {
		super();
		this.identificador = identificador;
		this.fecha = fecha;
		EntradaCanjeada = entradaCanjeada;
	}

	public boolean isEntradaCanjeada() {
		return EntradaCanjeada;
	}

	public void setEntradaCanjeada(boolean entradaCanjeada) {
		EntradaCanjeada = entradaCanjeada;
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
