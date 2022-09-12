package ar.edu.unlam.ae;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.Test;

public class AerolineaTest {

	@Test
	public void queSePuedaAgregarUnvueloAUnaAerolinea() {
	Aerolinea aa=new Aerolinea("aerolineas");
	LocalDateTime horaDespegue=LocalDateTime.of(2022, 07, 30, 12, 15, 0);
	LocalDateTime horaAteriizaje=LocalDateTime.of(2022, 07, 30, 14, 35, 0);
	String aeropuertoOrigen ="AEP";
	String aeropuertoDestino ="BRC";
	Integer idVuelo =1;
	Vuelo vuelo=new Vuelo(idVuelo,aeropuertoOrigen,aeropuertoDestino,horaDespegue,horaAteriizaje,5000.0);
	assertTrue(aa.agregar(vuelo));
	
	}
	
	@Test
	public void queSePuedaVenderUnPasajeAUnVuelo(){
	Aerolinea aa=new Aerolinea("aerolineas");
	LocalDateTime horaDespegue=LocalDateTime.of(2022, 07, 30, 12, 15, 0);
	LocalDateTime horaAteriizaje=LocalDateTime.of(2022, 07, 30, 14, 35, 0);
	String aeropuertoOrigen ="AEP";
	String aeropuertoDestino ="BRC";
	Integer idVuelo =1;
	Vuelo vuelo=new Vuelo(idVuelo,aeropuertoOrigen,aeropuertoDestino,horaDespegue,horaAteriizaje,5000.0);
	
	Integer dni= 1;
	Pasajero pasajero =new PasajeroVip(dni);
	Pasaje pasaje= new Pasaje (vuelo,pasajero);
	aa.agregar(pasaje);
	
	
	
	assertTrue(aa.agregar(vuelo));
	
	assertNotNull (pasaje);
	assertEquals(4500, pasaje.getPrecio(),0.01);
	
		
	}
	
	
	@Test
	public void queSePuedaVenderUnPasajeAUnVuelo1(){
	Aerolinea aa=new Aerolinea("aerolineas");
	LocalDateTime horaDespegue=LocalDateTime.of(2022, 07, 30, 12, 15, 0);
	LocalDateTime horaAteriizaje=LocalDateTime.of(2022, 07, 30, 14, 35, 0);
	String aeropuertoOrigen ="AEP";
	String aeropuertoDestino ="BRC";
	Integer idVuelo =1;
	Vuelo vuelo=new Vuelo(idVuelo,aeropuertoOrigen,aeropuertoDestino,horaDespegue,horaAteriizaje,5000.0);
	
	Integer dni= 1;
	Pasajero pasajero =new PasajeroVip(dni);
	Pasaje pasaje= new Pasaje (vuelo,pasajero);
	
	
	
	assertTrue(aa.agregar(vuelo));
	
	assertNotNull (pasaje);
	assertEquals(4500, pasaje.getPrecio(),0.01);
	String asciento="3F";
	aa.asignarAsientoParaUnPasaje(pasaje,asciento);

	aa.subirAlvuelo(pasaje);
	
	List<Pasajero> pasajerosAusentes=aa.obternerPasajerosAusentes(vuelo);
		
	}
	
	@Test
	public void culquierda(){
		Aerolinea aa=new Aerolinea("aerolineas");
		LocalDateTime horaDespegue=LocalDateTime.of(2022, 07, 30, 12, 15, 0);
		LocalDateTime horaAteriizaje=LocalDateTime.of(2022, 07, 30, 14, 35, 0);
		String aeropuertoOrigen ="AEP";
		String aeropuertoDestino ="BRC";
		Integer idVuelo =1;
		
		Vuelo vuelo=new Vuelo(idVuelo,aeropuertoOrigen,aeropuertoDestino,horaDespegue,horaAteriizaje,4000.0);
		
		aeropuertoOrigen ="AEP";
		aeropuertoDestino ="IGR";
		idVuelo =2;
		
		Vuelo vuelo2=new Vuelo(idVuelo,aeropuertoOrigen,aeropuertoDestino,horaDespegue,horaAteriizaje,8000.0);

		aeropuertoOrigen ="MDZ";
		aeropuertoDestino ="BRC";
		idVuelo =3;
		
		Vuelo vuelo3=new Vuelo(idVuelo,aeropuertoOrigen,aeropuertoDestino,horaDespegue,horaAteriizaje,6000.0);

		aeropuertoOrigen ="AEP";
		aeropuertoDestino ="COR";
		idVuelo =50;
		
		Vuelo vuelo50=new Vuelo(idVuelo,aeropuertoOrigen,aeropuertoDestino,horaDespegue,horaAteriizaje,2000.0);

		aa.agregar(vuelo2);
		aa.agregar(vuelo3);
		aa.agregar(vuelo50);
		aa.agregar(vuelo);
		
		for (Vuelo vuelo1 : aa.getVuelos()) {
			System.out.println(vuelo1.getIdVuelo() + vuelo1.getAeropuertoOrigen() + vuelo1.getAeropuertoDestino()+ "Precio: " + vuelo1.getPrecio());
		}
		
		System.out.println("-.----------------------------");
		
		for (Vuelo vuelo1 : aa.obtenerListaDeVuelosOrdenadasPorPrecioYID()) {
			System.out.println(vuelo1.getIdVuelo() + vuelo1.getAeropuertoOrigen() + vuelo1.getAeropuertoDestino()+ "Precio: " + vuelo1.getPrecio());
		}
		
	}
	
	
	
	
	
	
	
	

}
