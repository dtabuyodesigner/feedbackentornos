package com.sanvalero.feedbackfutboldanieltabuyo.model;

public class DetalleEquipo {
	
	private int PartidosJugados;
	private int PartidosGanados;
	private int PartidosPerdidos;
	private int PartidosEmpatados;
	private int GolesFavor;
	private int GolesContra;
	private int Puntos;
	
	
	public DetalleEquipo(int partidosJugados, int partidosGanados, int partidosPerdidos, int partidosEmpatados,
			int golesFavor, int golesContra, int puntos) {
		
		super();
		PartidosJugados = partidosJugados;
		PartidosGanados = partidosGanados;
		PartidosPerdidos = partidosPerdidos;
		PartidosEmpatados = partidosEmpatados;
		GolesFavor = golesFavor;
		GolesContra = golesContra;
		Puntos = puntos;
	}


	public int getPartidosJugados() {
		return PartidosJugados;
	}


	public void setPartidosJugados(int partidosJugados) {
		PartidosJugados = partidosJugados;
	}


	public int getPartidosGanados() {
		return PartidosGanados;
	}


	public void setPartidosGanados(int partidosGanados) {
		PartidosGanados = partidosGanados;
	}


	public int getPartidosPerdidos() {
		return PartidosPerdidos;
	}


	public void setPartidosPerdidos(int partidosPerdidos) {
		PartidosPerdidos = partidosPerdidos;
	}


	public int getPartidosEmpatados() {
		return PartidosEmpatados;
	}


	public void setPartidosEmpatados(int partidosEmpatados) {
		PartidosEmpatados = partidosEmpatados;
	}


	public int getGolesFavor() {
		return GolesFavor;
	}


	public void setGolesFavor(int golesFavor) {
		GolesFavor = golesFavor;
	}


	public int getGolesContra() {
		return GolesContra;
	}


	public void setGolesContra(int golesContra) {
		GolesContra = golesContra;
	}


	public int getPuntos() {
		return Puntos;
	}


	public void setPuntos(int puntos) {
		Puntos = puntos;
	}
	
	
	
	
	
	
	

}
