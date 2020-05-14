package com.sanvalero.feedbackfutboldanieltabuyo.model;

public class Federacion extends Usuario {
	
	private String perfil;
	
	private String departamento;
	
	public Federacion(String nombreusuario, String contrasena, String fechanacimiento, String dni, String email,
			String perfil, String departamento) {
		super(nombreusuario, contrasena, fechanacimiento, dni, email);
		this.perfil = perfil;
		this.departamento = departamento;
		
		
	}
	
	

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
		//La siguiente línea añade una partido a un calendario. 
	
	public void anadir_partido (Partido Partido, Calendario Calendario) {
		
		
		
	}
	
	
	
	
	

}
