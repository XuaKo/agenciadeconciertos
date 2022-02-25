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
	
	//duda resuelta y array rellenado
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
	
	//puse nombres aleatorios por que me aburro  y no es importante
	public static Informe[]informes= {
			new Informe(1,"hay que llevar mas maquinas de humo"),new Informe(2,"jerico"),
			new Informe(3,"hay que llevar mas rwtbv de humo"),new Informe(4,"hay que llevar mas maquinas de humo"),
			new Informe(5,"hay  de humo"),new Informe(6,"hay que llevar mas maquinas de humo"),
			new Informe(7,"compra jamon"),new Informe(8,"bueno buen bueno bueno vaya actuadon"),
			new Informe(9,"aprender a cantar"),new Informe(10,"hay que llevar mas maquinas de humo"),	
	};
	
	public static Momento[]momentos= {
			new Momento(1,"dfbebv",LocalDate.parse("20/08/2005", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Momento(2,"dfbebv",LocalDate.parse("18/02/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Momento(3,"dfqrefeqgvbebv",LocalDate.parse("08/08/2010", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Momento(4,"dfbebv",LocalDate.parse("06/08/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Momento(5,"dfbqrfqrvqebv",LocalDate.parse("04/08/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Momento(6,"dfbebv",LocalDate.parse("22/08/2012", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Momento(7,"rgbrw",LocalDate.parse("09/08/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Momento(8,"dfbebv",LocalDate.parse("03/08/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Momento(9,"qveqervqeqv",LocalDate.parse("31/12/2020", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),
			new Momento(10,"dfbvqrevqerghyj46jebv",LocalDate.parse("20/06/2006", DateTimeFormatter.ofPattern("dd/MM/yyyy"))),	
	};
	
	public static Reportero[]reporteros= {
			new Reportero("Antonio Domingez","51498665S",77664251),new Reportero("Bolson Vilvo","51498665Q",99885432),
			new Reportero("Miles Morales","51498665L",998674445),new Reportero("Maria Domingez","548446651U",648442569),
			new Reportero("Derek mark","587452165Q",259887654),new Reportero("Estefania Domingez","51498665X",698569246),
			new Reportero("Jessie Domingez","984657421P",336659471),new Reportero("Willian Mendez","51498665O",259887654),
			new Reportero("Pedro Domingez","51498665N",325686447),new Reportero("Antonio Rodrigez","365489754E",452165558),
	};
	
	public static Reserva[]reservas= {
			new Reserva(1,LocalDate.parse("01/02/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy")),true),
			new Reserva(2,LocalDate.parse("18/05/2006", DateTimeFormatter.ofPattern("dd/MM/yyyy")),false),
			new Reserva(3,LocalDate.parse("11/04/2006", DateTimeFormatter.ofPattern("dd/MM/yyyy")),true),
			new Reserva(4,LocalDate.parse("25/09/2006", DateTimeFormatter.ofPattern("dd/MM/yyyy")),false),
			new Reserva(5,LocalDate.parse("08/04/2006", DateTimeFormatter.ofPattern("dd/MM/yyyy")),true),
			new Reserva(6,LocalDate.parse("09/07/2006", DateTimeFormatter.ofPattern("dd/MM/yyyy")),false),
			new Reserva(7,LocalDate.parse("07/09/2006", DateTimeFormatter.ofPattern("dd/MM/yyyy")),true),
			new Reserva(8,LocalDate.parse("06/03/2006", DateTimeFormatter.ofPattern("dd/MM/yyyy")),true),
			new Reserva(9,LocalDate.parse("03/01/2006", DateTimeFormatter.ofPattern("dd/MM/yyyy")),false),
			new Reserva(10,LocalDate.parse("23/06/2006", DateTimeFormatter.ofPattern("dd/MM/yyyy")),false),		
	};
	
	public static Usuario[]usuarios= {
			new Usuario(1,"Antonio Hernandez","ejemplo@gmail.com","25447798E",false),
			new Usuario(2,"Antonio Hernandez","ejemplo2@gmail.com","99856244E",true),
			new Usuario(3,"Antonio Hernandez","ejemplo3@gmail.com","12547854Q",false),
			new Usuario(4,"Antonio Hernandez","ejemplo4@gmail.com","25444987S",true),
			new Usuario(5,"Antonio Hernandez","ejemplo5@gmail.com","25444468K",false),
			new Usuario(6,"Antonio Hernandez","ejemplo6@gmail.com","89878854D",false),
			new Usuario(7,"Antonio Hernandez","ejemplo7@gmail.com","9877741X",false),
			new Usuario(8,"Antonio Hernandez","ejemplo8@gmail.com","12547854Q",true),
			new Usuario(9,"Antonio Hernandez","ejemplo9@gmail.com","12547854Q",true),
			new Usuario(10,"Antonio Hernandez","ejemplo10@gmail.com","12547854Q",true),
			
	};
			
	

}
