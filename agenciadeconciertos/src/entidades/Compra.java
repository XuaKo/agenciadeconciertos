package entidades;

public class Compra {
  
  private long Identificador;
	private int Precio_Total_Euro;
	private String Metodo_Pago;
	
	public long getIfentificador() 
	{
		return Identificador;
	}
	
	public void setIdentificador(long identificador)
	{
		Identificador = identificador;
	}
	
	public int getPrecio_Total_Euro()
	{
		return Precio_Total_Euro;
	}
	
	public void setPrecio_Total_Euro(int precio_total_euro)
	{
		Precio_Total_Euro = precio_total_euro;
	}
	
	public String getMetodo_Pago()
	{
		return Metodo_Pago;
	}
	
	public void setMetodo_Pago(String metodo_pago)
	{
		Metodo_Pago = metodo_pago;
	}


}
