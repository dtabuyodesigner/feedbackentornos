package com.sanvalero.feedbackfutboldanieltabuyo.model;

public class Partido {
	
	private int Jornada;
	
	private String EquipoLocal;
	
	private String Arbitro;

	private String EquipoVisitante;

	private String Campo;

	public Partido(int jornada, String equipoLocal, String arbitro, String equipoVisitante, String campo) {
		super();
		Jornada = jornada;
		EquipoLocal = equipoLocal;
		Arbitro = arbitro;
		EquipoVisitante = equipoVisitante;
		Campo = campo;
	}

	public int getJornada() {
		return Jornada;
	}

	public void setJornada(int jornada) {
		Jornada = jornada;
	}

	public String getEquipoLocal() {
		return EquipoLocal;
	}

	public void setEquipoLocal(String equipoLocal) {
		EquipoLocal = equipoLocal;
	}

	public String getArbitro() {
		return Arbitro;
	}

	public void setArbitro(String arbitro) {
		Arbitro = arbitro;
	}

	public String getEquipoVisitante() {
		return EquipoVisitante;
	}

	public void setEquipoVisitante(String equipoVisitante) {
		EquipoVisitante = equipoVisitante;
	}

	public String getCampo() {
		return Campo;
	}

	public void setCampo(String campo) {
		Campo = campo;
	}

	
	
	
		

}
