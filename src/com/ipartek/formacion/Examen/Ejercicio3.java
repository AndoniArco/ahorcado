package com.ipartek.formacion.Examen;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * @author Curso
 *
 */

public class Ejercicio3 {

	public static void main(String[] args) {

		int[] datos = new int[10];
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int numeroDato;

		while (contador < datos.length) {
			System.out.println("Introduce los datos");
			numeroDato = sc.nextInt();
			datos[contador] = numeroDato;
			contador++;
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
				System.out.println("El numero" + pDatos[i]+" es multiplo de 7");
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
