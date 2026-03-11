package ejercicio21;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EnvioInternacionalTest {
	private EnvioInternacional envioPesoMenor;//con entrega rapida
	private EnvioInternacional envioPesoMayor;//sin entrega rapida
	private  CuadroTarifario tarifa;
	
	@BeforeEach
	void setUp() {
		this.tarifa=  new CuadroTarifario();
		this.envioPesoMenor=new EnvioInternacional(true,555,"Colombia","Chile",400);
		this.envioPesoMayor= new EnvioInternacional(false,333,"Peru","Argentina", 2000);
	}
	
	@Test
	void CalcularMontoTest() {
		CuadroTarifario tarifa = new CuadroTarifario();
		assertEquals(9800, this.envioPesoMenor.calcularMonto(this.tarifa));
		assertEquals(29000, this.envioPesoMayor.calcularMonto(this.tarifa));
	}
	
}
