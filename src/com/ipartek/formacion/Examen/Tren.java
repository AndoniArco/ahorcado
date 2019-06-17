package com.ipartek.formacion.Examen;

public class Tren {

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

	public boolean trenLleno() {

		boolean lleno = false;

		if (this.asientosOcupados >= 400) {
			lleno = true;
		}

		return lleno;
	}

	public void demasiadoViejo() {

		if (this.anosActivos >= 40) {
			System.out.println("EL TREN SE ENCUENTRA FUERA DE CIRCULACION");
		} else {
			System.out.println("EL TREN SE ENCUENTRA EN CIRCULACION");
		}

	}

}
