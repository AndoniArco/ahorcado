package com.ipartek.formacion.Examen;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Se va a solicitar 10 numeros enteros por teclado y se guardan en un array. Se
 * muestran cuantos son multiplos de 7 su media aritmetica
 * 
 * @author Curso
 *
 */

public class Ejercicio3 {

	final static int MAX_NUMEROS = 10;
	static int[] datos = new int[MAX_NUMEROS];
	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int numeroDato;

		while (contador < datos.length) {
			System.out.println("Introduce los datos");
			try {
				numeroDato = Integer.parseInt(sc.nextLine());
				datos[contador] = numeroDato;
				contador++;	
			} catch (Exception e) {
				System.out.println("Cuidado! El dato que has introducido no es valido.");
			}
			
		}

		obtenerMultiplos7(datos);
		obtenerMedia(datos);
		sc.close();
	}

	/**
	 * Calcula cuantos de los numeros del array son multiplos de 7
	 * 
	 * @param datos int[] es el array de datos con el que trabajaremos
	 */
	private static void obtenerMultiplos7(int[] pDatos) {

		int contador = 0;

		for (int i = 0; i < pDatos.length; i++) {
			if (pDatos[i] % 7 == 0 && pDatos[i] != 0) {
				System.out.println("El numero" + pDatos[i] + " es multiplo de 7");
				contador++;
			}
		}

		System.out.println("El numero de multiplos de 7 en el array es: " + contador);

	}

	private static void obtenerMedia(int[] pDatos) {

		double media = 0.0;

		for (int i = 0; i < pDatos.length; i++) {
			media = media + pDatos[i];
		}

		DecimalFormat df = new DecimalFormat("#.00");
		media = media / pDatos.length;

		System.out.println("La media del array es: " + df.format(media));

	}

}
