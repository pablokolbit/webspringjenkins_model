package es.kolbit.w04_webspring.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestPersona {

	@DisplayName("Verifica el 'equals()' de 'Persona'")
	@Test
	public void test01() {
		Persona p = new Persona(15, "Pepe", "Lopez");
		Persona p1 = new Persona(15, "Pepe", "Lopez");

		Assertions.assertTrue(p.equals(p1));
	}
	
	@DisplayName("Verifica el 'getId()' de 'Persona'")
	@Test
	public void test02() {
		Persona p = new Persona(15, "Pepe", "Lopez");
		
		Assertions.assertEquals(15, p.getId());
	}
	
	
}
