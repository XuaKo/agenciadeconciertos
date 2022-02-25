package entidades;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

import utils.Datos;
import utils.Utiles;

public class Concierto {
	
	protected long idConcierto;
	protected LocalDate fechayhor;
	
	
	//conexion con Reportero
	public Reportero reporteroConcierto;
	//conexion con Gira
	public Gira Giraconciertos;
	
    //constructor por defecto
	public Concierto() {
	}

    //constructor con todos los atributos de la clase

	public Concierto(long idConcierto, LocalDate fechayHora) {

		super();
		this.idConcierto = idConcierto;
		this.fechayhor = fechayHora;
	}
    //getters y setters
	public long getIdConcierto() {
		return idConcierto;
	}

	public void setIdConcierto(long idConcierto) {
		this.idConcierto = idConcierto;
	}

	public LocalDate getFechayHora() {
		return fechayhor;
	}

	public void setFechayHora(LocalDate fechayhora) {
		fechayhor = fechayhora;
	}
    //metodo to String
	public String toString() {
		return "Concierto [Identificador=" + idConcierto + ", FechayHora=" + fechayhor + "]";
	}
		
	//parece estar perfectamente declarado pero no funciona	
		public static Concierto nuevoconcierto() {
			Concierto ret = new Concierto();
			Scanner scan =new Scanner(System.in);
			long idConcierto = -1;
			LocalDate fechayhor; 
			System.out.println("indique cual es su identificador");
			idConcierto = scan.nextLong();
			System.out.println("indique el codigo de su descuento");
			fechayhor = Utiles.leerFecha();
			scan.close();
			return ret;
		
	}
		
		
		//metodo data para exportar los datos de un Concierto de forma ordenanda en un string 
		//y los presenta como : <Concierto.idconcierto> "|" <Concierto.fechahora>
		//es un metodo corto pero son los atributos con los que cuenta esta clase
		public String Data(){
			return ""+this.idConcierto+"|"+this.fechayhor;
		}
		
		private static void exportarConcierto(Concierto[]concierto) {
			//fichero imaginado
			String path ="Concierto.txt";
			File f=new File(path);
		 	FileWriter e=null;
		 	PrintWriter escritor=null;
		 	
		 	try {
		 		try {
				e=new FileWriter(f,false);
				escritor=new PrintWriter(e);
				for(Concierto c:Datos.conciertos) {
					//uso del metodo data que es lo que sera escrito en el fichero 
					escritor.println(c.Data());
				}
			}finally {
				if (e!=null){
					e.close();
				}
				if(escritor != null) {
					escritor.close();
				}
			}
		 	
		 	}catch (IOException e1) {
				e1.printStackTrace();
			}
			
					
		}
	
   
	
	
	
}
