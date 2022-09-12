package ar.edu.unlam.pb2.facturas;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.pb2.facturas.Articulo;
import ar.edu.unlam.pb2.facturas.ArticuloDeLujo;

public class ArticuloTests {

	@Test
	public void queSePuedePedirImpuestoSobreArticulo() {
		Articulo a = new Articulo("Pescado", 10.0);
		Assert.assertEquals("El impuesto es normal",  2.1, a.getImpuesto(), 0.0);
	}
	
	@Test
	public void queSePuedePedirImpuestoSobreArticuloDeLujo() {
		Articulo a = new ArticuloDeLujo("Perfume", 10.0);
		Assert.assertEquals("El impuesto es extraordinario",  3.6, a.getImpuesto(), 0.0);
	}
	
}
