package ejercicio14;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test; 

public class EsferaTest {
	private Esfera EsferaUno;
	
	
	@BeforeEach
	void setUp() {
		this.EsferaUno= new Esfera(5,"Hierro","Rojo");
	}
	
	@Test
	void testConstructor() {
		assertEquals(5,this.EsferaUno.getRadio());
	}
	
	@Test
	void testGetSuperficie() {
		assertEquals(314,Math.round(this.EsferaUno.getSuperficie()));
	}
	@Test
	void testGetVolumen() {
		assertEquals(511,Math.round(this.EsferaUno.getVolumen()));
	}
}
