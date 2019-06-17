package com.ipartek.formacion.Examen;

import java.util.Scanner;

/**
 * Generar un tren y mostrar todos los datos identificativos
 * 
 * @author Curso
 *
 */

public class Ejercicio4 {

	/**
	 * Pedimos al usuario que nos introduzca los datos del tren por teclado y creamos el tren
	 * A posteriori mostramos toda información acerca de el, si está lleno o no, si está en circulacion o no 
	 * @param args
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String tTipo;
		String tReferencia;
		int asientosOcupados;
		int anosActivos;

		System.out.println("Bienvenido a la creación del tren");
		System.out.println("A continuación introduzca los datos");

		System.out.println("Introduzca el tipo del tren");
		tTipo = sc.nextLine();
		System.out.println("Introduzca la referencia del tren");
		tReferencia = sc.nextLine();
		System.out.println("Introduzca la cantidad de asientos ocupados en el tren");
		asientosOcupados = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca la cantidad de años en activo del tren");
		anosActivos = Integer.parseInt(sc.nextLine());

		Tren tNuevo = new Tren(tTipo, tReferencia, asientosOcupados, anosActivos);

		System.out.println("Los datos del tren son los siguientes");
		System.out.println("El tren es de tipo: " + tNuevo.getTipo());
		System.out.println("La referencia del tren es: " + tNuevo.getReferencia());
		System.out.println("Los asientos ocupados del tren son " + tNuevo.getAsientosOcupados());
		System.out.println("Los años en activo del tren son " + tNuevo.getAnosActivo());
		tNuevo.demasiadoViejo();
		if (tNuevo.trenLleno()) {
			System.out.println("En estos momentos el tren se encuentra lleno");
		} else {
			System.out.println("En estos momentos el tren no se encuentra lleno por completo");
		}

		sc.close();
	}

}
