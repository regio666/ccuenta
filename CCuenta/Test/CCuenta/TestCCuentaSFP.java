package CCuenta;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCCuentaSFP {

	@Test
	public void testCcuenta() {
		Ccuenta miCuenta=new Ccuenta("Sergio","Fernández",3200,1);
		assertNotNull(miCuenta);
		//fail("Not yet implemented");
	}

	@Test
	public void testGetSaldo() {
		Ccuenta miCuenta=new Ccuenta("Sergio","Fernández",3200,1);
		int miSaldo=(int)miCuenta.getSaldo();
		System.out.print(miSaldo);
		assertEquals(3200,miSaldo);
		//fail("Not yet implemented");
	}

	@Test
	public void testIngresar() throws Exception {
		Ccuenta miCuenta=new Ccuenta("Sergio","Fernández",3200,1);
		int miIngreso=5000;
		miCuenta.ingresar(miIngreso);
		int miSaldo=(int)miCuenta.getSaldo();
		assertEquals(8200, miSaldo);
		//fail("Not yet implemented");
	}

	@Test
	public void testRetirar() throws Exception {
		Ccuenta miCuenta=new Ccuenta("Sergio","Fernández",3200,1);
		miCuenta.retirar(200);
		int miSaldo=(int)miCuenta.getSaldo();
		assertEquals(3000, miSaldo);
		//fail("Not yet implemented");
	}

	@Test
	public void testRetirarSuperior() throws Exception {
		Ccuenta miCuenta=new Ccuenta("Sergio","Fernández",3200,1);
		miCuenta.retirar(3300);
		boolean saldoInferior=true;
		int miSaldo=(int)miCuenta.getSaldo();
		if (miSaldo<0) {
			saldoInferior=false;
		}
		assertFalse(saldoInferior);
		//fail("Not yet implemented");
	}
	
	@Test(expected=Exception.class)
	public void testIngresarNegativa() throws Exception{
	Ccuenta miCuenta=new Ccuenta("Sergio","Fernández",3200,1);
	miCuenta.ingresar(-600);
	int miSaldo=(int)miCuenta.getSaldo();
	assertEquals(2600, miSaldo);
	}

}
