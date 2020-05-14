package com.sanvalero.feedbackdanieltabuyo;

import com.sanvalero.feedbackfutboldanieltabuyo.model.Arbitro;
import com.sanvalero.feedbackfutboldanieltabuyo.model.Partido;

/**
 * 
 * @author Daniel Tabuyo de las Peñas
 *
 */


public class Main {

	public static void main(String[] args) {
		   System.out.println("Este es el Feedback de Daniel Tabuyo de las Peñassobre el Futbol");
		   
		   Arbitro arbitro1= new Arbitro("Manolito", "Pepito", "01021987", "44444L", "dan@gmail.com",
	    			"Joselito", 2222);
		   
		   Partido partido1= new Partido(4, "Tazanona", "Manolito", "Argés", "El Reino de Aragón");

	        System.out.println (arbitro1.getFechanacimiento() + arbitro1.getEmail());
	        System.out.println (arbitro1.getNombre_arbitro() +" "+ arbitro1.getNumero_colegiado());
	        
	        System.out.println(partido1.getArbitro()+ " "+ partido1.getCampo()+ " "+partido1.getEquipoLocal()+
	        		" "+ partido1.getEquipoVisitante());
    }
	

}