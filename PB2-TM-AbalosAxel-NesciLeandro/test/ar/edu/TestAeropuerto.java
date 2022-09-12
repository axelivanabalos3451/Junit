package ar.edu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.junit.Test;

public class TestAeropuerto {

	
	@Test
	public void testquePermitaAsignarUnAvionAunVuelo() 
	{
		
		Aeropuerto aeropuerto = new Aeropuerto();
		
		Integer id=1;
		String modelo="f-584";
		Integer cantAsientos = 500;
		Avion avion = new Avion(id,modelo,cantAsientos);
		aeropuerto.agregarAvion(avion);
		Ruta ruta = new Ruta();
		Vuelo vuelo = new  Vuelo(id,avion,ruta);
		assertTrue(vuelo.agregaravion(aeropuerto,avion));
		assertEquals(avion,vuelo.getAvion());
		
		
		
	}
	
	@Test
	public void testqueNoPermitaAsignarMasDe2Pilotos() {
Aeropuerto aeropuerto = new Aeropuerto();
		
		Integer id=1;
		String modelo="f-584";
		Integer cantAsientos = 500;
		Avion avion = new Avion(id,modelo,cantAsientos);
		aeropuerto.agregarAvion(avion);
		
		
		Integer idPiloto = 1;
		Piloto piloto = new Piloto(394581163,"Axel", idPiloto, modelo);
	
		Piloto piloto2 = new Piloto(394581163,"Axel1", idPiloto, modelo);
		Piloto piloto3 = new Piloto(394581163,"Axel2", idPiloto, modelo);
		aeropuerto.agregarPersonal(piloto);
		aeropuerto.agregarPersonal(piloto2);
		aeropuerto.agregarPersonal(piloto3);
		Ruta ruta = new Ruta();
		Vuelo vuelo = new  Vuelo(id,avion,ruta);
		
	
		vuelo.agregarPersonal(aeropuerto, piloto);
		vuelo.agregarPersonal(aeropuerto, piloto2);
		vuelo.agregarPersonal(aeropuerto, piloto3);
		Integer vo= vuelo.getListadopersonal().size();
		Integer p =2;
		assertEquals( vo,p);
	}
	@Test
	public void testquenopermitaagregarmasde4personaldevuelo() 
	{
Aeropuerto aeropuerto = new Aeropuerto();
		
		Integer id=1;
		String modelo="f-584";
		Integer cantAsientos = 500;
		Avion avion = new Avion(id,modelo,cantAsientos);
		aeropuerto.agregarAvion(avion);
		
		
		Integer idPiloto = 1;
		Piloto piloto = new Piloto(394581163,"Axel", idPiloto, modelo);
	
		Piloto piloto2 = new Piloto(394581163,"Axel1", idPiloto, modelo);
		Piloto piloto3 = new Piloto(394581163,"Axel2", idPiloto, modelo);
		PersonalVuelo p1= new PersonalVuelo(39458163, "axel11");
		PersonalVuelo p2= new PersonalVuelo(39458163, "axel12");
		PersonalVuelo p3= new PersonalVuelo(39458163, "axel13");
		PersonalVuelo p4= new PersonalVuelo(39458163, "axel14");
		aeropuerto.agregarPersonal(piloto);
		aeropuerto.agregarPersonal(piloto2);
		aeropuerto.agregarPersonal(piloto3);
		Ruta ruta = new Ruta();
		Vuelo vuelo = new  Vuelo(id,avion,ruta);
		aeropuerto.agregarPersonal(p1);
		aeropuerto.agregarPersonal(p2);
		aeropuerto.agregarPersonal(p3);
		aeropuerto.agregarPersonal(p4);
	
		vuelo.agregarPersonal(aeropuerto, piloto);
		vuelo.agregarPersonal(aeropuerto, piloto2);
		vuelo.agregarPersonal(aeropuerto, piloto3);
		vuelo.agregarPersonal(aeropuerto, p1);
		vuelo.agregarPersonal(aeropuerto, p2);
		vuelo.agregarPersonal(aeropuerto, p3);
		vuelo.agregarPersonal(aeropuerto, p4);
		Integer vo= vuelo.getListadopersonal().size();
		Integer p =6;
		assertEquals( vo,p);
		
		
	}
	
	@Test
	public void QueSePuedaNoSePuedaComprar2PasajesPorPasajero(){
		String nombre = "Andres";
		Integer numeroticket=1;
		Integer dni = 123456;
		ticket ticketvuelo = new ticket(numeroticket,"a1");
		Pasajero pasajero1 = new Pasajero(nombre,dni,ticketvuelo);
		Ruta ruta = new Ruta();
		Aeropuerto aeropuerto = new Aeropuerto();
		
		Integer id=1;
		String modelo="f-584";
		Integer cantAsientos = 3;
		Avion avion = new Avion(id,modelo,cantAsientos);
		aeropuerto.agregarAvion(avion);
		
		Vuelo vuelo = new  Vuelo(id,avion,ruta);
		vuelo.agregarasiento("a1");
		vuelo.agregarasiento("a2");
		vuelo.agregarasiento("a3");
		aeropuerto.agregarTicket(ticketvuelo);
		
		Boolean vendido= aeropuerto.venderPasaje(ticketvuelo,pasajero1);
		assertTrue(vendido);
		
	
		
	}
	@Test
	public void QueSePuedaComprarUnPAsajeParaUnPasajero(){
		String nombre = "Andres";
		Integer numeroticket=1;
		Integer dni = 123456;
		ticket ticketvuelo = new ticket(numeroticket,"a1");
		ticket ticketvuelo2 = new ticket(2,"a2");
		Pasajero pasajero1 = new Pasajero(nombre,dni,ticketvuelo);
		Ruta ruta = new Ruta();
		Aeropuerto aeropuerto = new Aeropuerto();
		
		Integer id=1;
		String modelo="f-584";
		Integer cantAsientos = 3;
		Avion avion = new Avion(id,modelo,cantAsientos);
		aeropuerto.agregarAvion(avion);
		
		Vuelo vuelo = new  Vuelo(id,avion,ruta);
		vuelo.agregarasiento("a1");
		vuelo.agregarasiento("a2");
		vuelo.agregarasiento("a3");
		aeropuerto.agregarTicket(ticketvuelo);
		aeropuerto.agregarTicket(ticketvuelo2);
		
		
		
		aeropuerto.venderPasaje(ticketvuelo,pasajero1);
		Boolean verificacion = aeropuerto.verificarPasajesVendidso(pasajero1);
		
		assertTrue(verificacion);
	
		
	}
	
	@Test
	public void queALosPasajerosVipSeLesRealiceUnDescuentoDelCiencoPorCiento() {
		Integer numeroticket=2; 
		Double precio = 2000.0;
		String nombre = "German";
		Integer dni = 23456;
		ticket ticketvueloVip = new ticket(numeroticket,"a2",precio);
		PasajeroVip pasajeroVip = new PasajeroVip(nombre,dni,ticketvueloVip);
		pasajeroVip.aplicarDescuento(ticketvueloVip);
		Double vo=ticketvueloVip.getPrecio();
		
		assertEquals(1900.0,vo,.0);
		
	}
	
	@Test
	public void queSePuedaAsignarUnAsientoParaUnPasajeroEnUnVuelo() 
	{
		Integer id=1;
		String modelo="f-584";
		Integer cantAsientos = 500;
		Integer numeroticket=3;
		Double precio=2000.0;
		ticket ticketvuelo = new ticket(numeroticket,"a2",precio);
		Ruta ruta = new Ruta();
		Pasajero pasajero = new Pasajero("juan", 1561541, ticketvuelo);

		Avion avion = new Avion(id,modelo,cantAsientos);
		Vuelo vuelo = new  Vuelo(id,avion,ruta);
		vuelo.agregarasiento("a1");
		vuelo.agregarasiento("a2");
		vuelo.agregarasiento("a3");
		
		Boolean SeAsignoCorrectamente=vuelo.asignarasiento(pasajero);
		assertTrue(SeAsignoCorrectamente);
		
	}
	
	
	
	
	@Test
	public void queNoSePuedaAsignarUnAsientoParaUnPasajeroEnUnVueloSiElAsientoEstaOcupado() 
	{
		Integer id=1;
		String modelo="f-584";
		Integer cantAsientos = 500;
		Integer numeroticket=3;
		Double precio=2000.0;
		ticket ticketvuelo = new ticket(numeroticket,"a2",precio);
		Ruta ruta = new Ruta();
		Pasajero pasajero = new Pasajero("juan", 1561541, ticketvuelo);

		Avion avion = new Avion(id,modelo,cantAsientos);
		Vuelo vuelo = new  Vuelo(id,avion,ruta);
		vuelo.agregarasiento("a1");
		vuelo.agregarasiento("a2");
		vuelo.agregarasiento("a3");
		
		Boolean verificarSiElAsientoEstaOcupado=vuelo.verificarSiAsientoEstaOcupado(pasajero);
		assertTrue(verificarSiElAsientoEstaOcupado);
		
	}
	@Test
	public void queNoSePuedaAsignarUnAsientoSiElAvionYaDespego() {
		Integer id = 4;
		Ruta ruta = new Ruta();
		String modelo = "Airbus";
		Integer cantAsientos = 3;
		Avion avion = new Avion(id,modelo,cantAsientos);
		
		Vuelo vuelo = new  Vuelo(id,avion,ruta);
	
	}
	@Test
	public void queSePuedaObtenerUnaListaDePasajeros() {
		
	}
	
	
	
	
	
	
	
	
	
}
