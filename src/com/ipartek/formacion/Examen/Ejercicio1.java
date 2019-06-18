package com.ipartek.formacion.Examen;

import java.util.Scanner;

/**
 * Ejercicio visualizar categoria boxeadores segun su peso.
 * 
 * @author Curso
 *
 */

public class Ejercicio1 {

	final static int MAX_BOXEADORES = 30;
	final static int PESO_MOSCA = 52;
	final static int PESO_PLUMA = 57;
	final static int PESO_LIGERO = 64;
	final static int PESO_MEDIANO = 90;

	/**
	 * Pedimos al usuario el valor del peso de boxeador y lo ponemos en una
	 * categoria dependiendo el peso. Controlamos la excepcion de que el dato
	 * introducido sea un numero valido y no palabras.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int pesoBoxeador = 0;

		for (int i = 0; i <= MAX_BOXEADORES; i++) {

			{
				System.out.println("Introduce el peso del boxeador.");
				try {
					pesoBoxeador = sc.nextInt();
					if (pesoBoxeador < 0) {
						throw new Exception();
					} else if (pesoBoxeador < PESO_MOSCA) {

						System.out.println("El boxeador pertenece a la categoria Peso Mosca");

					} else if (pesoBoxeador <= PESO_PLUMA) {

						System.out.println("El boxeador pertenece a la categoria Peso Pluma");

					} else if (pesoBoxeador <= PESO_LIGERO) {

						System.out.println("El boxeador pertenece a la categoria Peso Ligero");

					} else if (pesoBoxeador <= PESO_MEDIANO) {

						System.out.println("El boxeador pertenece a la categoria Peso Mediano");

					} else {

						System.out.println("El boxeador pertenece a la categoria Peso Pesado");

					}

				} catch (Exception e) {
					System.out.println("El numero que has introducido no es válido");

				}

			}
		}
		sc.close();

	}

}
