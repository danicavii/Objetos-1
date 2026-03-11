package ejercicio21;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpresaTest {
	private Empresa UnaEmpresa;
	
	@BeforeEach
	void setup() {
		this.UnaEmpresa= new Empresa();
	}
	
	@Test
	void constructorTest() {
		assertNull(UnaEmpresa.getClientes()); 
	}
	
	@Test
	void registrarClienteTest() {
		Cliente cli1 = new ClienteFisico("Daniela", "Calle3", 32323);
		this.UnaEmpresa.registrarCliente(cli1);
		assertEquals(1, this.UnaEmpresa.getClientes().size());
	}
	

}
