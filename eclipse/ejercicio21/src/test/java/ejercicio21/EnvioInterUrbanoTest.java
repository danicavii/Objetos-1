package ejercicio21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class EnvioInterUrbanoTest {
	private EnvioInterUrbano envioMenor100;
	private EnvioInterUrbano envioEntre;
	private EnvioInterUrbano envioMayor500;
	private  CuadroTarifario tarifa;
	
	
	@BeforeEach
	void setUp() {
		this.tarifa=  new CuadroTarifario();
		this.envioMenor100= new EnvioInterUrbano(222,"Mendoza","Bariloche", 400, 50);
		this.envioEntre= new EnvioInterUrbano(333,"Buenos aires","Jujuy",600,310);
		this.envioMayor500= new EnvioInterUrbano(444,"Chascomus","BahiaBlanca",200,600);
	}
	
	@Test
	void CalcularMontoTest() {
		assertEquals(8000.0, this.envioMenor100.calcularMonto(tarifa));
		assertEquals(15000.0, this.envioEntre.calcularMonto(tarifa));
		assertEquals(6000.0, this.envioMayor500.calcularMonto(tarifa));
	}
	
}
