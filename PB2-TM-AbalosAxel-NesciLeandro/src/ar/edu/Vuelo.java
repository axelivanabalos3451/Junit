package ar.edu;

import java.util.ArrayList;
import java.util.List;

public class Vuelo {

	private Integer id;
	private Avion avion;
	private Ruta ruta;
	private ArrayList <Personal> listadopersonal= new ArrayList<>();
	private Integer cantpilotos=0;
	private Integer cantcp;
	private Integer cantpv=0;
	private ArrayList<Pasajero> listadoDePasajeros = new ArrayList<>();
	private ArrayList<String> listadoDeAsientos= new ArrayList<>();

	public Vuelo(Integer id, Avion avion, Ruta ruta) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.avion=avion;
		this.ruta=ruta;
	}

	public Boolean agregaravion(Aeropuerto aeropuerto, Avion avion) {
		Boolean agregado=false;
		for (Avion avionbuscado: aeropuerto.getHangar()) {
			if(avionbuscado.equals(avion)) 
			{
				
				this.avion=avion;
				agregado=true;
			}
			
		}
		return agregado;
		
		
		// TODO Auto-generated method stub
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	public void agregarPersonal(Aeropuerto aeropuerto,Personal persona) {
		if(this.puedoagregarpersonal(aeropuerto, persona)) {
		listadopersonal.add(persona);
		
		
		}
		// TODO Auto-generated method stub
		
	}
	public Boolean puedoagregarpersonal(Aeropuerto aeropuerto, Personal persona) 
	{
			if(persona instanceof Piloto) {
			
				this.cantpilotos++;
			return cantpilotos<=2;
		}
			if(persona instanceof PersonalVuelo) {
				this.cantpv++;
				return cantpv<=4;
			}
		
	
		return false;
		
		
	}

	public void setListadopersonal(ArrayList<Personal> listadopersonal) {
		this.listadopersonal = listadopersonal;
	}

	public Integer getCantpilotos() {
		return cantpilotos;
	}

	public void setCantpilotos(Integer cantpilotos) {
		this.cantpilotos = cantpilotos;
	}

	public Integer getCantcp() {
		return cantcp;
	}

	public void setCantcp(Integer cantcp) {
		this.cantcp = cantcp;
	}

	public Integer getCantpv() {
		return cantpv;
	}

	public void setCantpv(Integer cantpv) {
		this.cantpv = cantpv;
	}

	public ArrayList<Personal> getListadopersonal() {
		return listadopersonal;
	}

	public void agregarasiento(String asiento) {
		listadoDeAsientos.add(asiento);

		
	}

	public Boolean asignarasiento(Pasajero pasajero) {
		
		if(listadoDeAsientos.contains(pasajero.getTicketvuelo().getNumeroasiento()))
		{
			listadoDePasajeros.add(pasajero);
			return true;
			
		}
		
		
		
		return false;
		// TODO Auto-generated method stub
		/*
		 * Boolean asigno=false; for (int i = 0; i < listadoDeAsientos.size(); i++) {
		 * 
		 * if(pasajero.getTicketvuelo().) { asigno=true;
		 * 
		 * 
		 * }else {
		 * 
		 * asigno=false; } } return asigno;
		 */
	}

	public Boolean verificarSiAsientoEstaOcupado(Pasajero pasajero) {
		// TODO Auto-generated method stub
		Boolean noSePuedeAsignar = true;
		for (Pasajero pasajero2 : listadoDePasajeros) {
			if(pasajero2.getTicketvuelo().getNumeroasiento() != null) {
				noSePuedeAsignar = true;
			}
		}
		return noSePuedeAsignar;
	}

	
	
	

}
