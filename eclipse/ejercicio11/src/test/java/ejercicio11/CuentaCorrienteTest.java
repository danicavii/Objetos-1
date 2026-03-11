package ejercicio11;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CuentaCorrienteTest {
	private CuentaCorriente CuentaCorriente1;
	private CuentaCorriente CuentaCorriente2;
	
	
	void setUp() {
		this.CuentaCorriente1= new CuentaCorriente();
		this.CuentaCorriente2= new CuentaCorriente();
	}
	
	void testConstructor() {
		assertEquals(0,CuentaCorriente1.getSaldo());
		assertEquals(0,CuentaCorriente1.getLimite());
	}
	
	
	void depositar() {
		CuentaCorriente1.depositar(200);
		assertEquals(200,CuentaCorriente1.getSaldo());
	}
	
	void testExtraer() {
		CuentaCorriente1.depositar(500);
		assertFalse(CuentaCorriente1.extraer(600));
		assertTrue(CuentaCorriente1.extraer(20));
		assertEquals(470, CuentaCorriente1.extraer(20));
	}
	
	void testTrasferirACuenta() {
		CuentaCorriente1.depositar(300);
		assertTrue(CuentaCorriente1.transferirACuenta(200, CuentaCorriente2));
		assertEquals(100,CuentaCorriente1.getSaldo());
	}
	
	
}
