package ejercicio11;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaAhorroTest {
	private CuentaAhorro cuentaAhorro1;
	private CuentaAhorro cuentaAhorro2;
	
	@BeforeEach
	void setUp() {
		cuentaAhorro1= new CuentaAhorro();
		cuentaAhorro2= new CuentaAhorro();
	}
	
	@Test
	void testConstructor() {
		assertEquals(cuentaAhorro1.getSaldo(),0);
	}
	
	@Test
	void testDepositar() {
		cuentaAhorro1.depositar(500);
		assertEquals(490,cuentaAhorro1.getSaldo());
	}
	
	@Test 
	void testExtraer() {
		cuentaAhorro1.depositar(500);
		assertTrue(cuentaAhorro1.extraer(200));
		assertEquals(286, cuentaAhorro1.getSaldo());
		assertFalse(cuentaAhorro1.extraer(800));
	}
	
	@Test
	void testTransferirACuenta() {
		cuentaAhorro1.depositar(600);
		cuentaAhorro1.transferirACuenta(200, cuentaAhorro2);
		assertEquals(384, cuentaAhorro1.getSaldo());
		assertEquals(200, cuentaAhorro2.getSaldo());
	}

}
