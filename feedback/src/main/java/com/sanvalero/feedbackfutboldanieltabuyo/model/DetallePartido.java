package com.sanvalero.feedbackfutboldanieltabuyo.model;

public class DetallePartido {
	
	private int TarjetasAmarillas;
	
	private int TarjetasRojas;

	private int Resultado;

	private int Cambios;
	
	public static int add (int equipo1, int equipo2) {
		
		return equipo1+equipo2;
		
	}
	
	 

	public DetallePartido(int tarjetasAmarillas, int tarjetasRojas, int resultado, int cambios) {
		super();
		TarjetasAmarillas = tarjetasAmarillas;
		TarjetasRojas = tarjetasRojas;
		Resultado = resultado;
		Cambios = cambios;
	}

	public int getTarjetasAmarillas() {
		return TarjetasAmarillas;
	}

	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		TarjetasAmarillas = tarjetasAmarillas;
	}

	public int getTarjetasRojas() {
		return TarjetasRojas;
	}

	public void setTarjetasRojas(int tarjetasRojas) {
		TarjetasRojas = tarjetasRojas;
	}

	public int getResultado() {
		return Resultado;
	}

	public void setResultado(int resultado) {
		Resultado = resultado;
	}

	public int getCambios() {
		return Cambios;
	}

	public void setCambios(int cambios) {
		Cambios = cambios;
	}
	
	
	

	
	
	

}
