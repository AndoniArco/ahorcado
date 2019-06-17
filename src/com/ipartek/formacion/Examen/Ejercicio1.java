package com.ipartek.formacion.Examen;

import java.util.Scanner;

/**
 * Ejercicio visualizar categoria boxeadores segun su peso.
 * 
 * @author Curso
 *
 */

public class Ejercicio1 {

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
		boolean fallo = false;

		while (!fallo) {
			System.out.println("Introduce el peso del boxeador.");
			try {
				pesoBoxeador = sc.nextInt();
				if (pesoBoxeador < 0) {
					throw new Exception();
				} else if (pesoBoxeador < 52) {

					System.out.println("El boxeador pertenece a la categoria Peso Mosca");

				} else if (pesoBoxeador >= 52 && pesoBoxeador <= 57) {

					System.out.println("El boxeador pertenece a la categoria Peso Pluma");

				} else if (pesoBoxeador >= 58 && pesoBoxeador <= 64) {

					System.out.println("El boxeador pertenece a la categoria Peso Ligero");

				} else if (pesoBoxeador >= 65 && pesoBoxeador <= 90) {

					System.out.println("El boxeador pertenece a la categoria Peso Mediano");

				} else {

					System.out.println("El boxeador pertenece a la categoria Peso Pesado");

				}
				
			} catch (Exception e) {
				System.out.println("El numero que has introducido no es válido");
				fallo = true;
			}

		}

		sc.close();

	}

}
