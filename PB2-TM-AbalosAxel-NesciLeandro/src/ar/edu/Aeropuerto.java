package ar.edu;

import java.util.ArrayList;

public class Aeropuerto {

	
	
	private String nombre;
	private Ruta ruta;
	private Integer cantidadDeTicketsDisponibles = 3;
	private ArrayList<Avion> hangar = new ArrayList <>();
	private ArrayList<Personal>listadoDePersonal= new ArrayList<>();
	private ArrayList<ticket>listadoTickets = new ArrayList<>();
	private ArrayList<Pasajero>ListadoPasajeros= new ArrayList<>();
	public void agregarAvion(Avion avion) {
		
		hangar.add(avion);
		// TODO Auto-generated method stub
		
	}
	//agregaravionaunvuelo(avion,vuelo)
	//vuelo.setavion(avion)
	//Vuelo//vueloencontrado=buscarvuelo(id);
	//Avion//vueloEncontrado=avion id
	//vueloencontrado.setavion(avi.enco):
	//vueloencontrado distinto de n
	//agregar avion a un vuelo
	public void agregarPersonal(Personal personal) {
		listadoDePersonal.add(personal);
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Ruta getRuta() {
		return ruta;
	}
	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}
	public ArrayList<Avion> getHangar() {
		return hangar;
	}
	public void setHangar(ArrayList<Avion> hangar) {
		this.hangar = hangar;
	}
	public ArrayList<Personal> getListadoDePersonal() {
		return listadoDePersonal;
	}
	public void setListadoDePersonal(ArrayList<Personal> listadoDePersonal) {
		this.listadoDePersonal = listadoDePersonal;
		
	}
	
	public void agregarTicket(ticket ticketvuelo) {
		// TODO Auto-generated method stub
		listadoTickets.add(ticketvuelo);
		
	}
	
		
	
	public Boolean venderPasaje(ticket ticketvuelo, Pasajero pasajero1) {
		// TODO Auto-generated method stub
		
		
			for (ticket ticketBuscado : listadoTickets) {
			
			if(ticketBuscado.equals(ticketvuelo))
					{
				
				ListadoPasajeros.add(pasajero1);
					return true;
					}
					
		
	}
			return false;
	
	
	
	
	
	
	
	
	
}
	public Boolean verificarPasajesVendidso(Pasajero pasajero1) {
		// TODO Auto-generated method stub
		for (Pasajero pasajero : ListadoPasajeros) {
			
			if(pasajero1.equals(pasajero)) {
				
				return true;
				
			}
			
		}return false;
		
	}
	


}
