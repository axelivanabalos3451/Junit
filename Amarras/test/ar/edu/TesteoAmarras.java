package ar.edu;

import static org.junit.Assert.assertEquals;


import java.util.TreeSet;

import org.junit.Test;

public class TesteoAmarras {
	
	
	
	@Test 
	public void testquePermitaAmarrardosYates() throws CapacidadMaximaSuperadaException 
	{
		Puerto fondeadero = new Puerto("PuertoLindo",70);
		
		
		String nombre= "ax1";
		String nombre2= "ax2";
		
		String dueño="axel";
		Double manga= 4.5;
		Double calado= 5.5;
		Double eslora= 100.0;
		Integer tripulacion=100;
		Integer peso=5500;
		
		//motor
		Integer desplazamiento =3900;
		String propulsion= "descripcion";
		Integer potencia =9000;
		Integer velocidad=23;
		Integer autonomia=3000;
		//vela
		Double alturaMastil=21.5;
		Integer superficieVela=85;
		Integer supervicietotal=133;
		
		
		
		
		Motor motor= new Motor(desplazamiento,propulsion,velocidad,autonomia);
		Vela vela= new Vela(alturaMastil,superficieVela,supervicietotal);
		
		Yate yate= new Yate(nombre,dueño,manga,calado,eslora,tripulacion,peso,motor);
		
		Yate yate2= new Yate(nombre2,dueño,manga,calado,eslora,tripulacion,peso,vela);
		fondeadero.amarrar(yate);
		fondeadero.amarrar(yate2);
		Integer ve=2;
		Integer vo=fondeadero.obtenerCantidadAmarras();
		assertEquals(ve,vo);
		

	}
	@Test 
	public void testquePermitaDesAmarrarUnYate() throws CapacidadMaximaSuperadaException 
	{
		Puerto fondeadero = new Puerto("PuertoLindo",70);
		
		
		String nombre= "ax1";
		
		String dueño="axel";
		Double manga= 4.5;
		Double calado= 5.5;
		Double eslora= 100.0;
		Integer tripulacion=100;
		Integer peso=5500;
		
		//motor
		Integer desplazamiento =3900;
		String propulsion= "descripcion";
		Integer potencia =9000;
		Integer velocidad=23;
		Integer autonomia=3000;
		
		Motor motor= new Motor(desplazamiento,propulsion,velocidad,autonomia);
		
		Yate yate= new Yate(nombre,dueño,manga,calado,eslora,tripulacion,peso,motor);
		
		
		fondeadero.amarrar(yate);
		fondeadero.desamarrar(yate);
		Integer ve=0;
		assertEquals(ve,fondeadero.obtenerCantidadAmarras());

	}
	@Test
	public void testqueDevuelvaElMontoAPagarPorAmarre() throws CapacidadMaximaSuperadaException 
	{
		

		Puerto fondeadero = new Puerto("PuertoLindo",70);
		
		
		String nombre= "ax1";
		
		String dueño="axel";
		Double manga= 4.5;
		Double calado= 5.5;
		Double eslora= 100.0;
		Integer tripulacion=100;
		Integer peso=5500;
		
		//motor
		Integer desplazamiento =3900;
		String propulsion= "descripcion";
		Integer potencia =9000;
		Integer velocidad=23;
		Integer autonomia=3000;
		
		Motor motor= new Motor(desplazamiento,propulsion,velocidad,autonomia);
		
		Yate yate= new Yate(nombre,dueño,manga,calado,eslora,tripulacion,peso,motor);
		
		
		fondeadero.amarrar(yate);
		
		Double precio= fondeadero.obtenerPrecioDeAmarre(yate);
		Double ve= 13000.0;
		assertEquals(ve,precio);
		
	}
	@Test
	public void testqueDevuelvaLaGananciatotalDeLasAmarras() throws CapacidadMaximaSuperadaException 
	{
Puerto fondeadero = new Puerto("PuertoLindo",70);
		
		
		String nombre= "ax1";
		String nombre2= "ax2";
		
		String dueño="axel";
		Double manga= 4.5;
		Double calado= 5.5;
		Double eslora= 100.0;
		Integer tripulacion=100;
		Integer peso=5500;
		
		//motor
		Integer desplazamiento =3900;
		String propulsion= "descripcion";
		Integer potencia =9000;
		Integer velocidad=23;
		Integer autonomia=3000;
		//vela
		Double alturaMastil=21.5;
		Integer superficieVela=85;
		Integer supervicietotal=133;
		
		
		
		
		Motor motor= new Motor(desplazamiento,propulsion,velocidad,autonomia);
		Vela vela= new Vela(alturaMastil,superficieVela,supervicietotal);
		
		Yate yate= new Yate(nombre,dueño,manga,calado,eslora,tripulacion,peso,motor);
		
		Yate yate2= new Yate(nombre2,dueño,manga,calado,eslora,tripulacion,peso,vela);
		fondeadero.amarrar(yate);
		fondeadero.amarrar(yate2);
		
		fondeadero.obtenerpreciototal();
	//	Sistema sis = new Sistema(fondeadero);
		
		//Double total=sis.obtenerpreciototal();
		
		Double total2= fondeadero.obtenerpreciototal();
		assertEquals(25000.0,total2,.0);
		
		}
		
		
		
	
	@Test
	public void testquePermitaOrdenarYatesPorTAmañoManga() throws CapacidadMaximaSuperadaException 
	{
		
		Puerto fondeadero = new Puerto("PuertoLindo",70);
		
		String nombre= "ax1";
		String nombre2= "ax2";
		
		String dueño="axel";
		Double manga= 4.5;
		Double calado= 5.5;
		Double eslora= 100.0;
		Integer tripulacion=100;
		Integer peso=5500;
		
		//motor
		Integer desplazamiento =3900;
		String propulsion= "descripcion";
		Integer potencia =9000;
		Integer velocidad=23;
		Integer autonomia=3000;
		//vela
		Double alturaMastil=21.5;
		Integer superficieVela=85;
		Integer supervicietotal=133;
		
		
		
		
		Motor motor= new Motor(desplazamiento,propulsion,velocidad,autonomia);
		Vela vela= new Vela(alturaMastil,superficieVela,supervicietotal);
		
		Yate yate= new Yate(nombre,dueño,manga,calado,eslora,tripulacion,peso,motor);
		
		Yate yate2= new Yate(nombre2,dueño,5.0,calado,eslora,tripulacion,peso,vela);
		Yate yate3= new Yate("ax3",dueño,3.0,calado,eslora,tripulacion,peso,vela);
		Yate yate4= new Yate("ax4",dueño,8.0,calado,eslora,tripulacion,peso,vela);
		fondeadero.amarrar(yate);
		fondeadero.amarrar(yate2);	
		fondeadero.amarrar(yate3);	
		fondeadero.amarrar(yate4);	
		
		TreeSet <Yate> yatesordenadospormanga= fondeadero.ordenarPorManga();
		
		
		Double vector[]= new Double[4];
	
	Integer i =0;
		  for (Yate yate5 : yatesordenadospormanga) {
		
		 vector[i]=yate5.getManga();
		  i++; 
		  
		  }
		  
		  
		 
	
			assertEquals(3.0,vector[0],0.0);
			assertEquals(4.5,vector[1],0.0);
			assertEquals(5.0,vector[2],0.0);
			assertEquals(8.0,vector[3],0.0);
		
			
			
		}
		
		
	
	
	
	
	
	
	
		
		
	

	
	@Test(expected=CapacidadMaximaSuperadaException.class)
	public void testQueTireAmarraNoDisponibleException() throws CapacidadMaximaSuperadaException 
	{
		
	Puerto fondeadero = new Puerto("PuertoLindo",1);
	
	
	String nombre= "ax1";
	String nombre2= "ax2";
	
	String dueño="axel";
	Double manga= 4.5;
	Double calado= 5.5;
	Double eslora= 100.0;
	Integer tripulacion=100;
	Integer peso=5500;
	
	//motor
	Integer desplazamiento =3900;
	String propulsion= "descripcion";
	Integer potencia =9000;
	Integer velocidad=23;
	Integer autonomia=3000;
	//vela
	Double alturaMastil=21.5;
	Integer superficieVela=85;
	Integer supervicietotal=133;
	
	Motor motor= new Motor(desplazamiento,propulsion,velocidad,autonomia);
	Vela vela= new Vela(alturaMastil,superficieVela,supervicietotal);
	
	Yate yate= new Yate(nombre,dueño,manga,calado,eslora,tripulacion,peso,motor);
	
	Yate yate2= new Yate(nombre2,dueño,manga,calado,eslora,tripulacion,peso,vela);
	fondeadero.amarrar(yate);
	fondeadero.amarrar(yate2);
		
		
	}
}
