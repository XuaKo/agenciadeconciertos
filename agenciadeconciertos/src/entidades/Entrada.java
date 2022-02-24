package entidades;

public class Entrada {
	private long idEntrada;
	private String Precio_Euro;
	private boolean Vip = false;

	public Entrada(long idEntrada, String precio_Euro, boolean vip) {
		this.idEntrada = idEntrada;
		this.Precio_Euro = precio_Euro;
		this.Vip = vip;
	}

	public long getIdEntrada() {
		return idEntrada;
	}

	public void setIdEntrada(long idEntrada) {
		this.idEntrada = idEntrada;
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
		return "Entrada [Identificador=" + idEntrada + ", Precio_Euro=" + Precio_Euro + ", Vip=" + Vip + "]";
	}

}
