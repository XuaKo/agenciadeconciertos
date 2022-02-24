package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entidades.Actuacion;
import entidades.Artista;
import entidades.Colaboracion;
import entidades.Concierto;



//autor de la clase Datos: Gabriel
public class Datos {
	/*incluyo un total de 10 objetos distintos por clase,los considero suficientes
	 *para el los ejercicios que haremos, en caso de ser necesario hare una ampliacion
	 *en la clase que sea necesaria  
	 */
	
	
	public static Actuacion[] actuaciones= {
			new Actuacion(1,3,180),new Actuacion(2,8,10),new Actuacion(3,2,20),
			new Actuacion(4,3,160),new Actuacion(5,5,140),new Actuacion(6,6,60),
			new Actuacion(7,3,110),new Actuacion(8,3,90),new Actuacion(9,3,120),
			new Actuacion(10,3,140)
	};
	
	public static Artista[]artistas= {
			new Artista(1,"dudu",'H'),new Artista(2,"don patricio",'H'),new Artista(3,"el peppe",'H'),
			new Artista(4,"alexa",'M'),new Artista(5,"marco",'H'),new Artista(6,"camela",'M'),
			new Artista(7,"EL MAN",'H'),new Artista(8,"boldad",'M'),new Artista(9,"perco",'M'),
			new Artista(10,"el pana",'M')
	};
	
	public static Concierto[]conciertos= {
		   new Concierto(1,LocalDate.parse("10/02/1995", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
		   new Concierto(2,LocalDate.parse("22/03/1999", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
		   new Concierto(3,LocalDate.parse("20/08/1992", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
		   new Concierto(4,LocalDate.parse("30/05/1993", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
		   new Concierto(5,LocalDate.parse("17/10/1985", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
		   new Concierto(6,LocalDate.parse("24/11/1993", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
		   new Concierto(7,LocalDate.parse("12/02/1993", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
		   new Concierto(8,LocalDate.parse("14/07/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
		   new Concierto(9,LocalDate.parse("01/06/1991", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
		   new Concierto(10,LocalDate.parse("09/06/1985", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
	};
	
	
	//no tengo muy claro si con la clase que extiende crear un objeto nuevo con los datos de la super clase
	//o meter los conciertos como colaboraciones asi que de momento queda vacio
	public static Colaboracion[]colaboraciones={
		
	};
			
	

}
