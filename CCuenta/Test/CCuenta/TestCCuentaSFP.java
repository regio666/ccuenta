package CCuenta;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCCuentaSFP {

	@Test
	public void testCcuentaSFP() {
		Ccuenta miCuenta=new Ccuenta("Sergio","Fernández",3200,1);
		assertNotNull(miCuenta);
		
	}

	@Test
	public void testGetSaldoSFP() {
		Ccuenta miCuenta=new Ccuenta("Sergio","Fernández",3200,1);
		int miSaldo=(int)miCuenta.getSaldo();
		assertEquals(3200,miSaldo);
		
	}

	@Test
	public void testIngresarSFP() throws Exception {
		Ccuenta miCuenta=new Ccuenta("Sergio","Fernández",3200,1);
		int miIngreso=5000;
		miCuenta.ingresar(miIngreso);
		int miSaldo=(int)miCuenta.getSaldo();
		assertEquals(8200, miSaldo);
		
	}

	@Test
	public void testRetirarSFP() throws Exception {
		Ccuenta miCuenta=new Ccuenta("Sergio","Fernández",3200,1);
		miCuenta.retirar(200);
		int miSaldo=(int)miCuenta.getSaldo();
		assertEquals(3000, miSaldo);
		
	}

	@Test (expected=Exception.class)
	public void testRetirarSuperiorSFP() throws Exception {
		Ccuenta miCuenta=new Ccuenta("Sergio","Fernández",3200,1);
		miCuenta.retirar(3300);
		int miSaldo=(int)miCuenta.getSaldo();
		if (miSaldo<0) {
			boolean negativo=true;
			assertTrue(negativo);
		}
		
	}
	
	@Test(expected=Exception.class)
	public void testIngresarNegativaSFP() throws Exception{
	Ccuenta miCuenta=new Ccuenta("Sergio","Fernández",3200,1);
	miCuenta.ingresar(-600);
	int miSaldo=(int)miCuenta.getSaldo();
	assertEquals(2600, miSaldo);
	}

}
