package entidades;

public class Entrada {
	private long Identificador;
	private String Precio_Euro;
	private boolean Vip = false;

	public Entrada(long identificador, String precio_Euro, boolean vip) {
		super();
		Identificador = identificador;
		Precio_Euro = precio_Euro;
		Vip = vip;
	}

	public long getIdentificador() {
		return Identificador;
	}

	public void setIdentificador(long identificador) {
		Identificador = identificador;
	}

	public String getPrecio_Euro() {
		return Precio_Euro;
	}

	public void setPrecio_Euro(String precio_euro) {
		Precio_Euro = precio_euro;
	}

	public boolean getVip() {
		return Vip;
	}

	public void setVip(boolean vip) {
		Vip = vip;
	}

	public String toString() {
		return "Entrada [Identificador=" + Identificador + ", Precio_Euro=" + Precio_Euro + ", Vip=" + Vip + "]";
	}

}
