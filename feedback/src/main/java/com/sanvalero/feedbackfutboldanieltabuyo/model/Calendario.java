package com.sanvalero.feedbackfutboldanieltabuyo.model;

import java.time.LocalDate;

public class Calendario {
	
	private LocalDate Fecha;
	
	private LocalDate Horario;

	public Calendario(LocalDate fecha, LocalDate horario) {
		super();
		Fecha = fecha;
		Horario = horario;
	}

	public LocalDate getFecha() {
		return Fecha;
	}

	public void setFecha(LocalDate fecha) {
		Fecha = fecha;
	}

	public LocalDate getHorario() {
		return Horario;
	}

	public void setHorario(LocalDate horario) {
		Horario = horario;
	}

	


	

}
