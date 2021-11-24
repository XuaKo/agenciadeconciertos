package entidades;

import java.time.LocalDate;

public class Concierto {
	
	protected long identificado;
	protected LocalDate fechayhor;
	
    //constructor por defecto
	public Concierto() {
	}

    //constructor con todos los atributos de la clase
	protected Concierto(long identificador, LocalDate fechayHora) {
		super();
		identificado = identificador;
		fechayhor = fechayHora;
	}
    //getters y setters
	public long getIdentificado() {
		return identificado;
	}

	public void setIdentificador(long identificador) {
		identificado = identificador;
	}

	public LocalDate getFechayHora() {
		return fechayhor;
	}

	public void setFechayHora(LocalDate fechayhora) {
		fechayhor = fechayhora;
	}
    //metodo to String
	public String toString() {
		return "Concierto [Identificador=" + identificador + ", FechayHora=" + fechayhora + "]";
		
		
		
	}
	
   
	
	
	
}
