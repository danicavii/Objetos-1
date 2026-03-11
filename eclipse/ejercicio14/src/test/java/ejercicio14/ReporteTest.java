package ejercicio14;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test; 


public class ReporteTest {
	private ReporteDeContruccion report;
	private ReporteDeContruccion reportSinPiezas;
	
	@BeforeEach
	void setUp() {
		this.reportSinPiezas= new ReporteDeContruccion();
		this.report= new ReporteDeContruccion();
		this.report.agregarPieza(new Cilindro(4,2,"Hierro","Verde"));
		this.report.agregarPieza(new Cilindro(7,3,"Madera","Azul"));
		this.report.agregarPieza(new Esfera(5,"Hierro","Rojo"));
		this.report.agregarPieza(new Prisma(6,2,7,"Hierro","Verde"));
	}
	
	@Test
	void ConstructorTest() {
		assertTrue(reportSinPiezas.getIsEmpty());
		assertFalse(report.getIsEmpty());
	}
	
	@Test
	void VolumenDeMaterialTest() {
		assertEquals(462,Math.round(report.VolumenDeMaterial("Madera")));
		assertEquals(0, reportSinPiezas.VolumenDeMaterial("Hierro"));
	}
	
	@Test
	void SuperficieColorTest() {
		assertEquals(440,Math.round(report.VolumenDeMaterial("Azul")));
		assertEquals(0,reportSinPiezas.SuperficieColor("Verde"));
		
	}
}
