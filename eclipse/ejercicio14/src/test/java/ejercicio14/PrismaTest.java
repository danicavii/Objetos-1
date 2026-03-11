package ejercicio14;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test; 

public class PrismaTest {
	private Prisma PrismaUno;
	
	@BeforeEach
	void setUp() {
		this.PrismaUno= new Prisma(6,2,7,"Hierro","Verde");
	}
	
	@Test
	void ConstructorTest() {
		assertEquals(6,this.PrismaUno.getLadoMayor());
		assertEquals(2,this.PrismaUno.getLadoMenor());
		assertEquals(7,this.PrismaUno.getAltura());
		assertEquals("Hierro",this.PrismaUno.getMateria());
		assertEquals("Verde",this.PrismaUno.getColor());
	}
	
	@Test
	void getSuperficieTest() {
		assertEquals(136,this.PrismaUno.getSuperficie());
	}
	
	@Test
	void getVolumenTest() {
		assertEquals(84,this.PrismaUno.getVolumen());
	}
}
	