package com.ipartek.formacion.Examen;

import java.util.Scanner;

/**
 * Ejercicio visualizar ganar campeonato. Para ello llamamos a una funcion ganar
 * que nos respondera true o false dependiendo de su tenemos posibilidades o no,
 * segun la casuistica. Si los puntos son superiores o iguales a 70, true , en
 * caso contrario, false.
 * 
 * @author Curso
 * 
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int puntosParticipante = 0;
		System.out.println("Introduce los puntos del participante.");

		try {
			puntosParticipante = Integer.parseInt(sc.nextLine());

			if (ganar(puntosParticipante)) {
				System.out.println("Puedes ganar el campeonato");
			} else {
				System.out.println("Ponte las pilas si quieres ganar");
			}
		} catch (Exception e) {
			System.out.println("El numero que has introducido no es válido");
		}

		sc.close();
	}

	/**
	 * Nos devuelve true o false dependiendo de la casuistica
	 * 
	 * @param pPuntos int pasamos los puntos del campeonato del participante
	 * @return boolean true o false.
	 */

	private static boolean ganar(int pPuntos) {

		boolean ganarCampeonato = false;

		if (pPuntos >= 70) {
			ganarCampeonato = true;
		}

		return ganarCampeonato;
	}

}
