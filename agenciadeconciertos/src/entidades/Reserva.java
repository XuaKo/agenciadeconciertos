package entidades;
import java.time.LocalDate;
public class Reserva {
	
	//atributos de la clase
    private long identificador;
    private LocalDate fecha;
    private boolean EntradaCanjeada = false;
    //constructor por defecto
    public Reserva() {
    	
    }
    //constructor con todos los atributos
    public Reserva(long identificador, LocalDate fecha, boolean entradaCanjeada) {
        super();
        this.identificador = identificador;
        this.fecha = fecha;
        EntradaCanjeada = entradaCanjeada;
    }
    //getters y setters
    public boolean isEntradaCanjeada() {
        return EntradaCanjeada;
    }
    public void setEntradaCanjeada(boolean entradaCanjeada) {
        EntradaCanjeada = entradaCanjeada;
    }
    public long getIdentificador() {
        return identificador;
    }
    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    //metodo to string
    public String toString() {
        return "Reserva [identificador=" + identificador + ", fecha=" + fecha + ", EntradaCanjeada=" + EntradaCanjeada
                + "]";
    }
    
    public Reserva nuevareserva() {
    	Reserva ret= new Reserva();
    	
    	
    	
    	
    	return ret;
    	
    }
}
