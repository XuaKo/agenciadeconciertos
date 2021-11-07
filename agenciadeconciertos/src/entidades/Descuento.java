package entidades;

import java.time.LocalDate;

public class Descuento {
	private LocalDate Fecha_Validez;
	private long Codigo_Unico;

	private Descuento(LocalDate fecha_Validez, long codigo_Unico) {
		super();
		Fecha_Validez = fecha_Validez;
		Codigo_Unico = codigo_Unico;
	}

	public LocalDate getFecha_Validez() {
		return Fecha_Validez;
	}

	public void setFecha_Validez(LocalDate fecha_validez) {
		Fecha_Validez = fecha_validez;
	}

	public long getCodigo_Unico() {
		return Codigo_Unico;
	}

	public void setCodigo_Unico(long codigo_unico) {
		Codigo_Unico = codigo_unico;
	}

}
