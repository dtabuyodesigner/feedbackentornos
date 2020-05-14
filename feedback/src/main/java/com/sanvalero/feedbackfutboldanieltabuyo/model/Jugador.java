package com.sanvalero.feedbackfutboldanieltabuyo.model;

public class Jugador extends Usuario{
	
	private String Nombre;

	private int Dorsal;
	
	private String Equipo;
	
	private int PartidosJugados;

	private int TarjetasAmarillas;

	private int TarjetasRojas;
	
	private int Goles;

	public Jugador(String nombreusuario, String contrasena, String fechanacimiento, String dni, String email,
			String nombre, int dorsal, String equipo, int partidosJugados, int tarjetasAmarillas, int tarjetasRojas,
			int goles) {
		super(nombreusuario, contrasena, fechanacimiento, dni, email);
		Nombre = nombre;
		Dorsal = dorsal;
		Equipo = equipo;
		PartidosJugados = partidosJugados;
		TarjetasAmarillas = tarjetasAmarillas;
		TarjetasRojas = tarjetasRojas;
		Goles = goles;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getDorsal() {
		return Dorsal;
	}

	public void setDorsal(int dorsal) {
		Dorsal = dorsal;
	}

	public String getEquipo() {
		return Equipo;
	}

	public void setEquipo(String equipo) {
		Equipo = equipo;
	}

	public int getPartidosJugados() {
		return PartidosJugados;
	}

	public void setPartidosJugados(int partidosJugados) {
		PartidosJugados = partidosJugados;
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

	public int getGoles() {
		return Goles;
	}

	public void setGoles(int goles) {
		Goles = goles;
	}


	
	
	


	
	
}
