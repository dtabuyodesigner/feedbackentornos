package com.sanvalero.feedbackfutboldanieltabuyo.model;

public class Arbitro extends Usuario{
	
	private String nombre_arbitro;
	
	private int numero_colegiado;

	public Arbitro(String nombreusuario, String contrasena, String fechanacimiento, String dni, String email,
			String nombre_arbitro, int numero_colegiado) {
		super(nombreusuario, contrasena, fechanacimiento, dni, email);
		this.nombre_arbitro = nombre_arbitro;
		this.numero_colegiado = numero_colegiado;
	}

	public String getNombre_arbitro() {
		return nombre_arbitro;
	}

	public void setNombre_arbitro(String nombre_arbitro) {
		this.nombre_arbitro = nombre_arbitro;
	}

	public int getNumero_colegiado() {
		return numero_colegiado;
	}

	public void setNumero_colegiado(int numero_colegiado) {
		this.numero_colegiado = numero_colegiado;
	}
	
	
	
	
	

}
