package pricipal;

import java.util.Scanner;

import entidades.Concierto;
import entidades.Gira;
import utils.Utiles;

public class Principal {

	public static void main(String[] args) {
		
		//comienza nuestro programa
		System.out.println("inicio");
		
		// todas las variables para el uso del menu y sus submenus
		int elecc=-1;
		boolean val=false;
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			do {
				System.out.println("bienvenido al sistema informatico de la agencia de conciertos!");
				System.out.println("escoja alguna de las siguientes opciones: ");
				System.out.println("1: Gestion de conciertos");
				System.out.println("2: Gestion de entradas");
				System.out.println("3: Gestion de momentos");
				System.out.println("4: salir!");
				
				//ahora leemos por teclado la eleccion del usuario
				elecc=scan.nextInt();
				//podemos una condicion para que solo acepte valores enteros dentro del rango de las elecciones
				//del programa
				if(elecc<1||elecc>4) {
					System.out.println("introduzca un valor que sea valido!");
					val=false;
				}
				else {
					val=true;
				}
			}while(!val);
			
			switch(elecc) {
			case 1:
				mostrarsubmenuConciertos();
				do{
					elecc=scan.nextInt();
					if(elecc<1||elecc>4){
						System.out.println("escoja un valor valido!");
						val=false;
					}
					else {
						val=true;
					}		
				}while(!val);
				SwitchsubmenuUno(elecc);
			case 2: 
				mostrarsubmenuEntradas();
				do {
					elecc=scan.nextInt();
					if(elecc<1||elecc>4){
						System.out.println("escoja un valor valido!");
						val=false;
					}
					else {
						val=true;
					}
				}while(!val);
				SwitchsubmenuDos(elecc);
			case 3: 
				mostrarsubmenuMomentos();
				do {
					elecc=scan.nextInt();
					if(elecc<1||elecc>4){
						System.out.println("escoja un valor valido!");
						val=false;
					}
					else {
						val=true;
					}
				}while(!val);
				SwitchsubmenuMomentos(elecc);
				}
			}
			
		}
		
	
	//IMPORTANTE , para declarar metodos hay qye hacerlo fuera del metodo main
	//aqui declaro todos los sub menus para que este mas limpio el switch principal
	private static void mostrarsubmenuConciertos() {
		System.out.println("gestion de conciertos!");
		System.out.println("Seleccione una de las siguientes opciones:");
		System.out.println("1: ver giras y conciertos");
		System.out.println("2: nuevo Concierto o gira");
		System.out.println("3: buscar gira");
		System.out.println("4: salir!");	
	}
	private static void SwitchsubmenuUno(int elecc) {
		boolean val=false;
	do {	
		switch(elecc) {
		case 1: 
			//aqui tendra que ir un metodo que muestre un array de conciertos y giras(supogo)
			break;
		case 2: 
			//imprementado el caso 2 dos menu(Gabriel)
			System.out.println("quieres hacer un concierto?");
			boolean con=Utiles.leerBoolean();
			if(con=true) {
				Concierto.nuevoconcierto();
			}
			else {
				Gira.nuevaGira();
			}
			break;
		case 3:	
			//aqui habra que hacer un metodo que nos permita localizar una gora o concierto en el array
			//introduciendo algun tipo de dato
			break;
		case 4: 
			val=true;
			break;
		}
	}while(!val);
		
		
	}
	private static void mostrarsubmenuEntradas() {
		System.out.println("gestion de entradas!");
		System.out.println("Seleccione una de las siguientes opciones:");
		System.out.println("1: Gestión Usuarios/s ");
		System.out.println("2: Reservar Entrada/s ");
		System.out.println("3: Comprar Entrada /s");
		System.out.println("4: salir!");	
	}
	private static void SwitchsubmenuDos(int elecc) {
		boolean val=false;
		do {
			switch(elecc) {
			case 1:
				//aqui tendra que ir alguna fincion para gestionar los usuarios
				break;
			case 2:
				//reservar entradas
				System.out.println("reservando entradas!");
				break;
			case 3:
				//comprar entradas
				System.out.println();
				break;
			case 4: 
				val=true;
				break;
			}
			
		}while(!val);
	}
	private static void mostrarsubmenuMomentos() {
		System.out.println("gestion de Momentos!");
		System.out.println("Seleccione una de las siguientes opciones:");
		System.out.println("1: ver momento ");
		System.out.println("2: nuevo momento");
		System.out.println("3: buscar momento");
		System.out.println("4: salir!");
	}
	private static void SwitchsubmenuMomentos(int elecc) {
		boolean val=false;
		do {
			switch(elecc) {
			case 1:
				System.out.println("viendo un momento");
				break;
			case 2:
				//reservar entradas
				System.out.println("creando un nuevo momento");
				break;
			case 3:
				//comprar entradas
				System.out.println("buscando un momento");
				break;
			case 4: 
				val=true;
				break;
			}
			
		}while(!val);
	}
	
}
