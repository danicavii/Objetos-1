package ejercicio14;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test; 

public class CilindroTest {
		private Cilindro CilindroUno;
		private Cilindro CilindroDos;
		
		@BeforeEach
		void setUp() {
			this.CilindroUno= new Cilindro(4,2,"Hierro","Verde");
			this.CilindroDos= new Cilindro(7,3,"Madera","Azul");
		}
		
		@Test
		void testConstructor() {
			assertEquals(4, this.CilindroUno.getRadio());
			assertEquals(3, this.CilindroDos.getAltura());
			
		}
		@Test
		void testGetSuperficie() {
			assertEquals(440,Math.round(this.CilindroDos.getSuperficie()));
		}
		@Test
		void testGetVolumen() {
			assertEquals(101,Math.round(this.CilindroUno.getVolumen()));
		}
}
