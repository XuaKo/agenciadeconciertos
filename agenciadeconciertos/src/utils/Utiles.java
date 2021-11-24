package utils;

import java.time.LocalDate;
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
			System.out.println("Introduzca un valor para el año");
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
}
