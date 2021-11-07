package entidades;

import java.time.LocalDate;

public class Descuento {
	private LocalDate Fecha_Validez;
	private String Codigo_Unico;
	private boolean DescuentoAplicado = false;

	public Descuento(LocalDate fecha_Validez, String codigo_Unico, boolean descuentoAplicado) {
		Fecha_Validez = fecha_Validez;
		Codigo_Unico = codigo_Unico;
		DescuentoAplicado = descuentoAplicado;
	}

	public boolean isDescuentoAplicado() {
		return DescuentoAplicado;
	}

	public void setDescuentoAplicado(boolean descuentoAplicado) {
		DescuentoAplicado = descuentoAplicado;
	}

	public LocalDate getFecha_Validez() {
		return Fecha_Validez;
	}

	public void setFecha_Validez(LocalDate fecha_validez) {
		Fecha_Validez = fecha_validez;
	}

	public String getCodigo_Unico() {
		return Codigo_Unico;
	}

	public void setCodigo_Unico(String codigo_unico) {
		Codigo_Unico = codigo_unico;
	}

	public String toString() {
		return "Descuento [Fecha_Validez=" + Fecha_Validez + ", Codigo_Unico=" + Codigo_Unico + ", DescuentoAplicado="
				+ DescuentoAplicado + "]";
	}

}
