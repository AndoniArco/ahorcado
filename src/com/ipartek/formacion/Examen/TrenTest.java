package com.ipartek.formacion.Examen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class TrenTest {

	Tren tren;
	static final String TIPO = "Locomotora";
	static final String REFERENCIA = "LOC-123";
	static final int ASIENTOS_OCUPADOS = 5;
	static final int ANYOS = 3;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tren = new Tren(TIPO, REFERENCIA , ASIENTOS_OCUPADOS, ANYOS);
	}

	@After
	public void tearDown() throws Exception {
		tren = null;
	}

	@Test
	public void testTren() {
		assertEquals( TIPO , tren.getTipo() );
		assertEquals( REFERENCIA, tren.getReferencia() );
		assertEquals( ASIENTOS_OCUPADOS, tren.getAsientosOcupados() );
		assertEquals( ANYOS, tren.getAnosActivo() );
		
		Tren tNull = new Tren( null, null, -5, 0);
		assertEquals( null , tNull.getTipo() );
		assertEquals( null, tNull.getReferencia() );
		assertEquals( -5, tNull.getAsientosOcupados() );
		assertEquals( 0, tNull.getAnosActivo() );
	}

	@Test
	public void testGetTipo() {

		assertEquals(TIPO, tren.getTipo() );
		
	}

	@Ignore
	public void testSetTipo() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetReferencia() {
		assertEquals( REFERENCIA,tren.getReferencia());
	}

	@Ignore
	public void testSetReferencia() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAsientosOcupados() {
		assertEquals(ASIENTOS_OCUPADOS,tren.getAsientosOcupados());
	}

	@Test
	public void testSetAsientosOcupados() {
		
		tren.setAsientosOcupados(-1);
		assertEquals( -1,tren.getAsientosOcupados());
		
		tren.setAsientosOcupados(1);
		assertEquals( 1,tren.getAsientosOcupados());
		
		tren.setAsientosOcupados(Tren.CAPACIDAD_MAXIMA+1);
		assertEquals( Tren.CAPACIDAD_MAXIMA+1,tren.getAsientosOcupados());
	}

	@Test
	public void testGetAnosActivos() {
		assertEquals(ANYOS, tren.getAnosActivo());
	}

	@Test
	public void testSetAnyosActivo() {
		tren.setAnosActivos(-1);
		assertEquals( -1,tren.getAnosActivo());
		
		tren.setAnosActivos(1);
		assertEquals( 1,tren.getAnosActivo());
	}

	@Ignore
	public void testMostrarDatos() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstaLleno() {
		assertFalse(tren.trenLleno());
		
		tren.setAsientosOcupados( Tren.CAPACIDAD_MAXIMA );
		assertTrue( tren.trenLleno() );
		
		tren.setAsientosOcupados( Tren.CAPACIDAD_MAXIMA+1 );
		assertTrue( tren.trenLleno() );
		
		
	}

	@Test
	public void testEsViejo() {

		assertFalse( tren.demasiadoViejo() ); // 3 años
		
		tren.setAnosActivos( 40 );
		assertTrue( tren.demasiadoViejo() );
		
		tren.setAnosActivos( 41 );
		assertTrue( tren.demasiadoViejo() );
		
		
	}
}
