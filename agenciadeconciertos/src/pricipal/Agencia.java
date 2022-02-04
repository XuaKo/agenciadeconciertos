package pricipal;

import java.util.Scanner;

public class Agencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner teclado = new Scanner(System.in);
			boolean validarMP=false;
			int select = teclado.nextInt();
		
			do {
				System.out.println("MENU PRINCIPAL");
				System.out.println("1: Gestion de Giras");
				System.out.println("2: Gestion de Conciertos");
				System.out.println("3: Gestion de Reporteros");
				System.out.println("4: Gestion de Artistas");
				System.out.println("5: Salir");
				switch (select) {
				
				case 1: 
					boolean validarGG=false;
					int selectG = teclado.nextInt();
				do {
					System.out.println("Gestion de Giras");
					System.out.println("1: Añadir una Gira");
					System.out.println("2: Eliminar una Gira");
					System.out.println("3: Modificar una Gira");
					System.out.println("4: Volver al menu principal");
					switch (selectG) {
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						validarGG=true;
						break;
					}
				
					}while (!validarGG);
					break;
				case 2:
					boolean validarGC=false;
					int selectC = teclado.nextInt();
				do {
					System.out.println("Gestion de Conciertos");
					System.out.println("1: Añadir un Concierto");
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
						validarGC=true;
						break;
					}
				
					}while (!validarGC);
					break;
				case 3:
					boolean validarGR=false;
					int selectR = teclado.nextInt();
				do {
					System.out.println("Gestion de Reporteros");
					System.out.println("1: Añadir un Reportero");
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
						validarGR=true;
						break;
					}
				
					}while (!validarGR);
					break;
				case 4:
					boolean validarGA=false;
					int selectA = teclado.nextInt();
				do {
					System.out.println("Gestion de Artistas");
					System.out.println("1: Añadir un Artista");
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
						validarGA=true;
						break;
					}
				
					}while (!validarGA);
					break;
				case 5:
					validarMP=true;
					break;
				default:
					break;
			}
			}while(!validarMP);
		
			teclado.close();
			}
			}

