package entidades;

public class Compra {

	private long Identificador;
	private String Precio_Total_Euro;
	private String Metodo_Pago;

	public Compra(long identificador, String precio_Total_Euro, String metodo_Pago) {
		Identificador = identificador;
		Precio_Total_Euro = precio_Total_Euro;
		Metodo_Pago = metodo_Pago;
	}

	public long getIfentificador() {
		return Identificador;
	}

	public void setIdentificador(long identificador) {
		Identificador = identificador;
	}

	public String getPrecio_Total_Euro() {
		return Precio_Total_Euro;
	}

	public void setPrecio_Total_Euro(String precio_total_euro) {
		Precio_Total_Euro = precio_total_euro;
	}

	public String getMetodo_Pago() {
		return Metodo_Pago;
	}

	public void setMetodo_Pago(String metodo_pago) {
		Metodo_Pago = metodo_pago;
	}

	public String toString() {
		return "Compra [Identificador=" + Identificador + ", Precio_Total_Euro=" + Precio_Total_Euro + ", Metodo_Pago="
				+ Metodo_Pago + "]";
	}

}
