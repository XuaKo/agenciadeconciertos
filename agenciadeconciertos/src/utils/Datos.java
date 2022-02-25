package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entidades.Actuacion;
import entidades.Artista;
import entidades.Colaboracion;
import entidades.Compra;
import entidades.Concierto;
import entidades.Descuento;
import entidades.Entrada;
import entidades.Gira;
import entidades.Individual;
import entidades.Informe;
import entidades.Momento;
import entidades.Reportero;
import entidades.Reserva;
import entidades.Usuario;



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
			   new Colaboracion(1,LocalDate.parse("20/03/1985", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			   new Colaboracion(2,LocalDate.parse("02/08/1999", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			   new Colaboracion(3,LocalDate.parse("10/08/1994", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			   new Colaboracion(4,LocalDate.parse("30/05/1993", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			   new Colaboracion(5,LocalDate.parse("17/10/1990", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			   new Colaboracion(6,LocalDate.parse("24/11/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			   new Colaboracion(7,LocalDate.parse("02/03/2010", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			   new Colaboracion(8,LocalDate.parse("14/09/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			   new Colaboracion(9,LocalDate.parse("01/06/1998", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			   new Colaboracion(10,LocalDate.parse("09/06/1989", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
	};
	
	public static Compra[]compras= {
			new Compra(1,"18.00€","debito"),new Compra(2,"20.00€","debito"),new Compra(3,"1.00€","credito"),
			new Compra(4,"58.00€","credito"),new Compra(5,"19.00€","credito"),new Compra(6,"15.00€","debito"),
			new Compra(7,"25.00€","debito"),new Compra(8,"80.00€","debito"),new Compra(9,"90.00€","credito"),
			new Compra(10,"8.00€","credito"),		
	};
	
	public static Descuento[]descuentos= {
			new Descuento(1,LocalDate.parse("09/06/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")),"UYBuGUyg",true),
			new Descuento(2,LocalDate.parse("10/06/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")),"UYBuGUyg",true),
			new Descuento(3,LocalDate.parse("12/06/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")),"UYBuGUyg",true),
			new Descuento(4,LocalDate.parse("09/06/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")),"UYBuGUyg",false),
			new Descuento(5,LocalDate.parse("06/06/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")),"UYBuGUyg",false),
			new Descuento(6,LocalDate.parse("05/06/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy")),"UYBuGUyg",false),
			new Descuento(7,LocalDate.parse("09/06/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy")),"UYBuGUyg",true),
			new Descuento(8,LocalDate.parse("15/06/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy")),"UYBuGUyg",false),
			new Descuento(9,LocalDate.parse("11/06/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy")),"UYBuGUyg",false),
			new Descuento(10,LocalDate.parse("10/06/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy")),"UYBuGUyg",true),	
	};
	
	public static Entrada[]entradas= {
			new Entrada(1,"18.00€",false),new Entrada(2,"54.00€",false),new Entrada(3,"76.00€",true),
			new Entrada(4,"9.00€",true),new Entrada(5,"9.00€",true),new Entrada(6,"65.00€",false),
			new Entrada(7,"18.00€",false),new Entrada(8,"12.00€",false),new Entrada(9,"35.00€",true),
			new Entrada(10,"64.00€",true),		
	};
	
	public static Gira[]giras= {
			new Gira(1,"ac/dc comeback",LocalDate.parse("10/06/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy")),LocalDate.parse("10/08/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Gira(2,"ac/dc return",LocalDate.parse("10/02/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy")),LocalDate.parse("10/04/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Gira(3,"ac/dc el regreso",LocalDate.parse("02/06/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy")),LocalDate.parse("10/09/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Gira(4,"ac/dc bagette",LocalDate.parse("04/01/2002", DateTimeFormatter.ofPattern("dd/MM/yyyy")),LocalDate.parse("10/06/2002", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Gira(5,"foyone en la casa",LocalDate.parse("10/04/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy")),LocalDate.parse("20/09/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Gira(6,"fernando costa v34",LocalDate.parse("10/06/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy")),LocalDate.parse("10/06/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Gira(7,"ayaxyprok",LocalDate.parse("05/06/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy")),LocalDate.parse("10/09/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Gira(8,"delaossa",LocalDate.parse("10/06/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy")),LocalDate.parse("10/06/2002", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Gira(9,"luisker",LocalDate.parse("10/08/2002", DateTimeFormatter.ofPattern("dd/MM/yyyy")),LocalDate.parse("10/06/2003", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Gira(10,"ac/dc comeback2",LocalDate.parse("18/06/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy")),LocalDate.parse("10/12/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),		
	};
	
	public static Individual[]individuales= {
			new Individual(1,LocalDate.parse("10/08/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Individual(2,LocalDate.parse("20/10/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Individual(3,LocalDate.parse("22/12/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Individual(4,LocalDate.parse("04/05/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Individual(5,LocalDate.parse("08/08/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Individual(6,LocalDate.parse("06/09/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Individual(7,LocalDate.parse("02/06/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Individual(8,LocalDate.parse("26/04/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Individual(9,LocalDate.parse("14/07/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Individual(10,LocalDate.parse("20/06/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
	};
	
	public static Informe[]informes= {
			new Informe(1,"hay que llevar mas maquinas de humo"),new Informe(2,"hay que llevar mas maquinas de humo"),
			new Informe(3,"hay que llevar mas maquinas de humo"),new Informe(4,"hay que llevar mas maquinas de humo"),
			new Informe(5,"hay que llevar mas maquinas de humo"),new Informe(6,"hay que llevar mas maquinas de humo"),
			new Informe(7,"hay que llevar mas maquinas de humo"),new Informe(8,"hay que llevar mas maquinas de humo"),
			new Informe(9,"hay que llevar mas maquinas de humo"),new Informe(10,"hay que llevar mas maquinas de humo"),
			
			
	};
	
	public static Momento[]momentos= {
			
	};
	
	public static Reportero[]reporteros= {
			
	};
	
	public static Reserva[]reservas= {
			
	};
	
	public static Usuario[]usuarios= {
			
	};
			
	

}
