package ejercicio21;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class EnvioLocalTest {
	private EnvioLocal envioLocalSinEntrega;
	private EnvioLocal envioLocalConEntrega;
	private CuadroTarifario tarifa;
	
	@BeforeEach
	void setUp() {
		this.tarifa = new CuadroTarifario();
		this.envioLocalConEntrega= new EnvioLocal(true,132,"Calle21","Calle5", 1000);
		this.envioLocalSinEntrega= new EnvioLocal(false,213,"Calle60","Calle2",1200);
	}
	
	@Test
	void calcularMontoTest() {
		assertEquals(1500.0, this.envioLocalConEntrega.calcularMonto(tarifa));
		assertEquals(1000.0, this.envioLocalSinEntrega.calcularMonto(tarifa));
	}
}
