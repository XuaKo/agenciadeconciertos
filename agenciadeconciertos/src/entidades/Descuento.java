package entidades;
import java.time.LocalDate;

public class Descuento {
  private LocalDate Fecha_Validez;
	private long Codigo_Unico; 
	
	public LocalDate getFecha_Validez() 
	{
		return Fecha_Validez;
	}
	
	public void setFecha_Validez(LocalDate fecha_validez)
	{
		Fecha_Validez = fecha_validez;
	}
	
	public long getCodigo_Unico()
	{
		return Codigo_Unico;
	}
	
	public void setCodigo_Unico(long codigo_unico)
	{
		Codigo_Unico = codigo_unico; 
	}
	

}
