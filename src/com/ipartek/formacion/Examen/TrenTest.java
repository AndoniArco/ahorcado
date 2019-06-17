package com.ipartek.formacion.Examen;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class TrenTest {

	@Test
	public void test() {
		
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
		
		sc.close();
		
		assertEquals(tTipo, tNuevo.getTipo());
		assertEquals(tReferencia, tNuevo.getReferencia());
		assertEquals(asientosOcupados, tNuevo.getAsientosOcupados());
		assertEquals(anosActivos, tNuevo.getAnosActivo());
		
		
		
		
	}

}
