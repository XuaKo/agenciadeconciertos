package pricipal;

import java.util.Scanner;

public class Agencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean val = false;
		Scanner scan = new Scanner(System.in);
        int elecc=-1;
		//el bucle do while esta aqui para que nunca se salga en su todalidad de un bucle
		//por lo cual cuando pongamos la palabra return en el caso cero este hara que volvamos al bucle 
		//que esta englobando todo el programa
	while(true) {
		System.out.println("bienvenidos a el sistema de la agencia de conciertos!");
		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1: Gestion de Conciertos");
			System.out.println("2: Gestion de entradas");
			System.out.println("3: Gestion de momentos");
			System.out.println("4: Salir");

			
			// declaramos las variables para inicar las primeras elecciones del menu
			elecc = scan.nextInt();
			
			if(elecc<0 ||elecc>4) {
				System.out.println("su eleccion no esta en el rango correcto");
				val=false;
			}
			else {
				val=true;
			}
		} while (!val);
			
            // el switch recibe como argumento el numero entero de arriba "elecc"
			switch (elecc) {

			case 1:
				boolean validarGG = false;
				do {
					System.out.println("Gestion de Giras");
					System.out.println("1:ver giras y sus conciertos");
					System.out.println("2: nuevo concierto-gira");
					System.out.println("3: buscar gira concierto");
					System.out.println("4: Volver al menu principal");
					elecc = scan.nextInt();
					switch (elecc) {
					case 1:
						//aqui  habra un  bucle for para recorrer distintos conciertos
						break;
					case 2:
						
						break;
					case 3:
						break;
					case 4:
						//importante! esta es la sentencia correcta para salir del switch actual al 
						//bucle superior
						validarGG = true;
						break;
					}

				} while (!validarGG);
				break;
			case 2:
				boolean validarGC = false;
				int selectC = scan.nextInt();
				do {
					System.out.println("Gestion de Conciertos");
					System.out.println("1: A�adir un Concierto");
					System.out.println("2: Eliminar un Concierto");
					System.out.println("3: Modificar un Concierto");
					switch (selectC) {
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						validarGC = true;
						break;
					}

				} while (!validarGC);
				break;
			case 3:
				boolean validarGR = false;
				int selectR = scan.nextInt();
				do {
					System.out.println("Gestion de Reporteros");
					System.out.println("1: A�adir un Reportero");
					System.out.println("2: Eliminar un Reportero");
					System.out.println("3: Modificar un Reportero");
					switch (selectR) {
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						validarGR = true;
						break;
					}

				} while (!validarGR);
				break;
			case 4:
				boolean validarGA = false;
				int selectA = scan.nextInt();
				do {
					System.out.println("Gestion de Artistas");
					System.out.println("1: A�adir un Artista");
					System.out.println("2: Eliminar un Artista");
					System.out.println("3: Modificar un Artista");
					switch (selectA) {
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						validarGA = true;
						break;
					}

				} while (!validarGA);
				break;
			case 5:
				val = true;
				break;
			default:
				break;
			}
		


	}
	
	}
}
