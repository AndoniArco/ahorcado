package com.ipartek.formacion.ahorcado;

import java.util.Random;
import java.util.Scanner;

/**
 * Juego del ahorcado. Pediremos por consola que nos introduzca una letra y
 * comprobaremos que esta pertenece a la palabra a resolver.
 * 
 * @author Curso
 *
 */

public class AhorcadoPalabraRandom {

	public static void main(String[] args) {
		
		final int INTENTOS_TOTALES = 6;
		Scanner sc = new Scanner(System.in);
		int aciertos = 0;
		int fallos = 0;
		char letraActual;
		char[] palabra = elegirPalabra();
		char[] palabraSolucion = new char[palabra.length];
		boolean cambios;

		for (int i = 0; i < palabraSolucion.length; i++) {
			palabraSolucion[i] = '_';
		}
		System.out.println("Bienvenido al juego del ahorcado. \n");
		System.out.println("Comenzamos con el juego del ahorcado. \n");
		while (aciertos < palabraSolucion.length && fallos != INTENTOS_TOTALES) {
			cambios = false;
			System.out.print("La palabra a solucionar es: ");
			for (int i = 0; i < palabraSolucion.length; i++) {
				System.out.print(palabraSolucion[i] + " ");
			}
			System.out.println("");
			System.out.println("Introduce una letra");

			letraActual = sc.nextLine().trim().toLowerCase().charAt(0);
			for (int i = 0; i < palabraSolucion.length; i++) {
				if (palabra[i] == letraActual && palabraSolucion[i] != letraActual) {
					palabraSolucion[i] = letraActual;
					cambios = true;
					aciertos++;
				}
			}

			if (!cambios) {
				fallos++;
				
			}
			pintarAhorcado(fallos);
			if (aciertos == palabraSolucion.length) {
				System.out.println("Has dado con la palabra correcta!!");
				for (int i = 0; i < palabraSolucion.length; i++) {
					System.out.print(palabraSolucion[i] + " ");
				}
			} else if (fallos == INTENTOS_TOTALES) {
				System.out.println("Oohhh has gastado todos tus fallos!! La palabra correcta era: ");
				for (int i = 0; i < palabraSolucion.length; i++) {
					System.out.print(palabra[i] + " ");
				}
			} else {

				System.out.printf("Te quedan un total de fallos %d / %d \n", INTENTOS_TOTALES - fallos,
						INTENTOS_TOTALES);

			}
		}

		sc.close();

	}

	private static void pintarAhorcado(int fallos) {

		switch (fallos) {
		case 1:
			System.out.println("\n\n");
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println("\n\n");
			break;
		case 2:
			System.out.println("\n\n");
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                     |   ");
			System.out.println(" |                     |   ");
			System.out.println(" |                     |   ");
			System.out.println(" |                     |   ");
			System.out.println("\n\n");
			break;
		case 3:
			System.out.println("\n\n");
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                   / |   ");
			System.out.println(" |                 /   |   ");
			System.out.println(" |                /    |   ");
			System.out.println(" |                     |   ");
			System.out.println("\n\n");
			break;
		case 4:
			System.out.println("\n\n");
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                   / | \\ ");
			System.out.println(" |                  /  |   \\ ");
			System.out.println(" |                 /   |     \\ ");
			System.out.println(" |                     |   ");
			System.out.println("\n\n");
			break;
		case 5:
			System.out.println("\n\n");
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | -  -  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                   / | \\ ");
			System.out.println(" |                  /  |   \\ ");
			System.out.println(" |                 /   |     \\ ");
			System.out.println(" |                     |   ");
			System.out.println(" |                    /  ");
			System.out.println(" |                   /      ");
			System.out.println(" |                  /       ");
			System.out.println("\n\n");
			break;
		case 6:
			System.out.println("\n\n");
			System.out.println(" ---------------------");
			System.out.println(" |                     |");
			System.out.println(" |                     |");
			System.out.println(" |                  -------");
			System.out.println(" |                 | X  X  |");
			System.out.println(" |                 |   o   |");
			System.out.println(" |                  -------");
			System.out.println(" |                     |   ");
			System.out.println(" |                   / | \\ ");
			System.out.println(" |                  /  |   \\ ");
			System.out.println(" |                 /   |     \\ ");
			System.out.println(" |                     |   ");
			System.out.println(" |                    / \\");
			System.out.println(" |                   /   \\  ");
			System.out.println(" |                  /     \\ ");

			System.out.println("\n\n");
			break;

		default:
			break;
		}

	}
	
	private static char[] elegirPalabra() {
		

		char[] arraypalabras[] = new char[3][1];
		arraypalabras[0] = new char[]{ 'v', 'i', 'e', 'r', 'n', 'e', 's' };
		arraypalabras[1] = new char[]{ 'p', 'a', 'i', 's' };
		arraypalabras[2] = new char[]{ 'e', 'x', 't', 'r', 'a', 'n', 'j', 'e', 'r','o' };
		Random rn = new Random();
		int numPalabra = rn.nextInt(3);
		char[] palabra = arraypalabras[numPalabra];
		
		return palabra;
	}

}
