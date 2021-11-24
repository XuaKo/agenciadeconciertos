package entidades;

import java.time.LocalDate;
import java.util.Scanner;


//
public class Descuento {
	//atributos de la clase
	private LocalDate Fecha_Validez;
	private String Codigo_Unico;
	private boolean DescuentoAplicado = false;
	
	
	//constructor por defecto
	public Descuento() {
		
	}
	
    //constructor con todos los atributos
	public Descuento(LocalDate fecha_Validez, String codigo_Unico, boolean descuentoAplicado) {
		Fecha_Validez = fecha_Validez;
		Codigo_Unico = codigo_Unico;
		DescuentoAplicado = descuentoAplicado;
	}
    //getters y setters
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
	//metodo de cla clase descuento para hacer un nuevo descuento (francamente no me vi capaz de hacer los bucles por falta de comprension de como usarlo
	public Descuento nuevodescuento() {
		Descuento ret = new Descuento();
		Scanner scan =new Scanner(System.in);
		System.out.println("indique su fecha de validez");
		Fecha_Validez.adjustInto(Fecha_Validez);
		System.out.println("indique el codigo de su descuento");
		scan.next();
		scan.close();
		return ret;
		
		
	}

}
