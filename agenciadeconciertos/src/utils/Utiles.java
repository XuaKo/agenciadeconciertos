package utils;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utiles {
	
	public static java.time.LocalDate leerFecha() {
		LocalDate ret = null;
		int dia;
		int mes;
		int año;
		boolean correcto = false;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Introduzca el dia:");

			dia = teclado.nextInt();
			System.out.println("Introduzca el mes:");
			mes = teclado.nextInt();
			System.out.println("Introduzca un valor para el a�o");
			año = teclado.nextInt();

			if (dia >= 1 | dia <= 31) {
				correcto = true;
			} else {
				System.out.println("El valor del dia es invalido");
				correcto = false;
			}
			if (mes >= 1 || mes <= 12) {
				correcto = true;
			} else {
				System.out.println("El valor del mes es invalido");
				correcto = false;
			}

		} while (!correcto);
		teclado.close();
		return ret;
	}
	public static boolean leerBoolean() {
		boolean ret;
		Scanner in = new Scanner(System.in);
		char respuesta;
		do {
			System.out.println("Pulse s para Si o n para No");
			respuesta = in.nextLine().charAt(0);
			if (respuesta != 's' && respuesta != 'S' && respuesta != 'n' && respuesta != 'N') {
				System.out.println("Valor introducido incorrecto.");
			}
		} while (respuesta != 's' && respuesta != 'S' && respuesta != 'n' && respuesta != 'N');
		if (respuesta == 's' || respuesta != 'S') {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	} 
	public static double leerDouble() {
		double ret = 0.0;
		boolean correcto = false;
		Scanner in = new Scanner (System.in);
		do {
			System.out.println("Introduzca un valor decimal (xx.xx)");
			try {
				ret = in.nextDouble();
				correcto = true;
			} catch (InputMismatchException ime) {
				System.out.println("Formato introducido incorrecto.");
				correcto = false;
			}
		} while (!correcto);
		return ret;
	}
}
