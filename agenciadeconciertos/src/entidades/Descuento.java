package entidades;

import java.time.LocalDate;
import java.util.Scanner;

import utils.Utiles;


//
public class Descuento {
	//atributos de la clase
	private long idDescuento;
	private LocalDate fecha_validez;
	private String codigo_unico;
	private boolean descuentoAplicado = false;
	
	
	//constructor por defecto
	public Descuento() {
		
	}
	
    //constructor con todos los atributos
	public Descuento(long idDescuento, LocalDate fecha_Validez, String codigo_unico, boolean descuentoAplicado) {
		this.idDescuento = idDescuento;
		fecha_Validez = this.fecha_validez;
		codigo_unico = this.codigo_unico;
		descuentoAplicado = this.descuentoAplicado;
	}
    //getters y setters
	public boolean isDescuentoAplicado() {
		return descuentoAplicado;
	}

	public long getIdDescuento() {
		return idDescuento;
	}

	public void setIdDescuento(long idDescuento) {
		this.idDescuento = idDescuento;
	}

	public void setDescuentoAplicado(boolean descuentoAplicado) {
		descuentoAplicado = this.descuentoAplicado;
	}

	public LocalDate getFecha_validez() {
		return fecha_validez;
	}

	public void setFecha_validez(LocalDate fecha_validez) {
		fecha_validez = this.fecha_validez;
	}

	public String getCodigo_unico() {
		return codigo_unico;
	}

	public void setCodigo_unico(String codigo_unico) {
		codigo_unico = this.codigo_unico;
	}

	public String toString() {
		return "Descuento [Fecha_Validez=" + fecha_validez + ", Codigo_Unico=" + codigo_unico + ", DescuentoAplicado="
				+ descuentoAplicado + "]";
	}
	//metodo de cla clase descuento para hacer un nuevo descuento (francamente no me vi capaz de hacer los bucles por falta de comprension de como usarlo
	public static Descuento nuevodescuento() {
		Descuento ret = new Descuento();
		Scanner scan =new Scanner(System.in);
		long idDescuento = -1;
		LocalDate fecha_validez;
		String codigo_unico = "";
		boolean idvalido = false;
		do {
			System.out.print("Introduzca su identificador:");
			idDescuento = scan.nextLong();
			if (idDescuento < 1) {
				System.out.println("El identificador ha de ser mayor que 0");
				idvalido = false;
			} else {
				idvalido = true;
			}
		} while (!idvalido);
		System.out.println("indique su fecha de validez");
		fecha_validez = Utiles.leerFecha();
		System.out.println("indique el codigo de su descuento");
		codigo_unico = scan.nextLine();
		scan.close();
		return ret;
		
		
	}

}
