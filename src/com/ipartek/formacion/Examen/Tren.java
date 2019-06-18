package com.ipartek.formacion.Examen;

public class Tren {

	public static final int CAPACIDAD_MAXIMA = 400;
	public static final int EDAD_MAXIMA = 40;

	private String tipo;
	private String referencia;
	private int asientosOcupados;
	private int anosActivos;

	// constructor

	public Tren(String tipo, String referencia, int asientosOcupados, int anosActivo) {
		super();
		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.anosActivos = anosActivo;
	}

	// getters

	public String getTipo() {
		return tipo;
	}

	public String getReferencia() {
		return referencia;
	}

	public int getAsientosOcupados() {
		return asientosOcupados;
	}

	public int getAnosActivo() {
		return anosActivos;
	}


	public void setAnosActivos(int anosActivos) {
		this.anosActivos = anosActivos;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}
	// metodos personalizados

	/**
	 * Segun la casuistica vemos si el tren esta totalmente ocupado o no
	 * 
	 * @return boolean true o false
	 * @see CAPACIDAD_MAXIMA
	 */

	public boolean trenLleno() {

		boolean lleno = false;

		if (this.asientosOcupados >= CAPACIDAD_MAXIMA) {
			lleno = true;
		}

		return lleno;
	}

	/**
	 * Segun la casuistica vemos si el tren sigue en circulacion o por el contrario
	 * ya no.
	 */

	public boolean demasiadoViejo() {
		
		boolean viejo =false;
		
		if (this.anosActivos >= EDAD_MAXIMA) {
			System.out.println("EL TREN SE ENCUENTRA FUERA DE CIRCULACION");
			viejo = true;
		} else {
			System.out.println("EL TREN SE ENCUENTRA EN CIRCULACION");
			
		}
		return viejo;
	}

}
