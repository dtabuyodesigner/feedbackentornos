package feedback;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sanvalero.feedbackfutboldanieltabuyo.model.DetallePartido;

public class PruebasJUnit {
	
	
	public void testAddOperation() {
        assertEquals(11, DetallePartido.add(3,8)); 
        assertEquals(1, DetallePartido.add(4,1)); 
        assertEquals(4, DetallePartido.add(2,2)); 
        assertEquals(8, DetallePartido.add(3,5)); 
        assertEquals(4, DetallePartido.add(1,3)); 
    }
	
	

	@Test
	public void test() {
		
		
		fail("No implementado aun");
		
	}

}
