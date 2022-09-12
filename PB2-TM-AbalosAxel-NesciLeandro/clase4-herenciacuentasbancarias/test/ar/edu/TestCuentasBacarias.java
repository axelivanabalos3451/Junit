package ar.edu;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCuentasBacarias {
	
	
	
	
	@Test
	public void testquepermitaExtraerCuentaSueldo() 
	{
		Double saldo = 2000.0;
		Integer idCliente = 1;
		String nombre="juan";
		Integer idCuenta=1;
		Double monto=500.0;
		Banco ban = new Banco("rio");
		Cliente clien = new Cliente(idCliente,nombre);
		
		Cuenta cuen = new CuentaSueldo(idCuenta,clien,saldo);
		cuen.extraer(monto);
		assertEquals(1500.0,cuen.getSaldo(),.0);
		
	}
	
	@Test
	public void testquepermitadepositarCuentaSueldo() 
	{
		Double saldo = 2000.0;
		Integer idCliente = 1;
		String nombre="juan";
		Integer idCuenta=1;
		Double monto=500.0;
		Banco ban = new Banco("rio");
		Cliente clien = new Cliente(idCliente,nombre);
		
		Cuenta cuen = new CuentaSueldo(idCuenta,clien,saldo);
		cuen.depositar(monto);
		assertEquals(2500.0,cuen.getSaldo(),.0);
		
	}
	
	
	@Test
	public void testquequeAlextraerpor6tavexcobre6pesosdemas() 
	{
		Double saldo = 4000.0;
		Integer idCliente = 1;
		String nombre="juan";
		Integer idCuenta=1;
		Double monto=500.0;
		Banco ban = new Banco("rio");
		Cliente clien = new Cliente(idCliente,nombre);
		
		Cuenta cuen = new CajaAhorro(idCuenta,clien,saldo, 0);
		cuen.extraer(monto);
		cuen.extraer(monto);
		cuen.extraer(monto);
		cuen.extraer(monto);
		cuen.extraer(monto);
		cuen.extraer(monto);
		
		Double ve=994.0;
		assertEquals(ve,cuen.getSaldo(),.0);
		
	}
	@Test
	public void testquepermitaExtraerCuentaCorriente() 
	{
		Double saldo = 2000.0;
		Integer idCliente = 1;
		String nombre="juan";
		Integer idCuenta=1;
		Double monto=2500.0;	
		Double montodescubierto=1000.0;
		Banco ban = new Banco("rio");
		Cliente clien = new Cliente(idCliente,nombre);
		
	
		Double montodescubiertofijo = 1000.0;
		CuentaCorriente cuen = new CuentaCorriente(idCuenta,clien,saldo,montodescubierto,montodescubiertofijo);
		cuen.extraer(monto);
		Double costoadicionalcalculado=25.0;
		assertEquals(0.0,cuen.getSaldo(),.0);
	
		assertEquals(475.0,cuen.getMontodescubierto(),.0);
		
	}
	
	
	
	@Test
	public void testquepermitaExtraerPorSegundaVezCuentaCorriente() 
	{
		Double saldo = 2000.0;
		Integer idCliente = 1;
		String nombre="juan";
		Integer idCuenta=1;
		Double monto=2500.0;	
		Double montodescubierto=1000.0;
		Banco ban = new Banco("rio");
		Cliente clien = new Cliente(idCliente,nombre);
		
	
		Double montodescubiertofijo = 1000.0;
		CuentaCorriente cuen = new CuentaCorriente(idCuenta,clien,saldo,montodescubierto,montodescubiertofijo);
		cuen.extraer(monto);
		Double costoadicionalcalculado=25.0;
		assertEquals(0.0,cuen.getSaldo(),.0);
	
		assertEquals(475.0,cuen.getMontodescubierto(),.0);
		
	}
	
	
	
	

	

}
