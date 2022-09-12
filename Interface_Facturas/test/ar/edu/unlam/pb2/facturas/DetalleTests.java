package ar.edu.unlam.pb2.facturas;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.pb2.facturas.Articulo;
import ar.edu.unlam.pb2.facturas.Detalle;

public class DetalleTests {

	@Test
	public void queSePuedeCalcularElTotalPorDetalle() {
		
		Articulo articulo = new Articulo("pescado", 10.0);
		
		Detalle d = new Detalle(articulo, 2);
		
		Assert.assertEquals("El precio total con impuesto", 24.2, d.getPrecioTotal(), 0.0);
		
	}
	
}
