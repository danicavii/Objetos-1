package ejercicio21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class ClienteFisicoTest {
	private ClienteFisico cli1;
	private CuadroTarifario tarifa;
	
	
	
	@BeforeEach
	void setUp() {
		this.cli1 = new ClienteFisico ("Daniela", "Calle3", 32323);
		Envio envio1= new EnvioLocal(true,132,"Calle21","Calle5", 1000);
		Envio envio2= new EnvioInternacional(false,333,"Peru","Argentina", 2000);
		
		
		
		this.cli1.agregarEnvio(envio1);
		this.cli1.agregarEnvio(envio2);
	}
	
	@Test
	void agregarEnvioTest() {
		assertEquals(2, cli1.getEnvios().size());
		
	}
	
	@Test 
	void montoTotalTest() {
		CuadroTarifario tarifa = new CuadroTarifario();
		assertEquals(30500.0, cli1.montoToltal(tarifa)); // falta
	}
	
	@Test 
	void getNombreClienteTest(){
		assertEquals("Daniela", this.cli1.getNombreCliente());
	}
	
}
