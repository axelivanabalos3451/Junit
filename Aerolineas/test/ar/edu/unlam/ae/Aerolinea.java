package ar.edu.unlam.ae;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Aerolinea {

	private String nombre;
	private Set<Vuelo> vuelos;
	private List<Pasaje> pasajes;

	public Aerolinea(String nombre) {
		this.nombre = nombre;
		this.vuelos = new TreeSet<>();
		this.pasajes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(Set<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	public List<Pasaje> getPasajes() {
		return pasajes;
	}

	public void setPasajes(List<Pasaje> pasajes) {
		this.pasajes = pasajes;
	}

	public boolean agregar(Vuelo vuelo) {
		// if (this.buscarVuelo(vuelo.getIdVuelo())==null)
		return this.vuelos.add(vuelo);

		// return false;
	}

	public Vuelo buscarVuelo(Integer idVuelo) {

		for (Vuelo vuelo : vuelos) {
			if (vuelo.getIdVuelo().equals(idVuelo))
				return vuelo;
		}
		return null;
	}

	public Vuelo buscarVuelo(Vuelo vuelo) {

		for (Vuelo vuelo1 : vuelos) {
			if (vuelo1.equals(vuelo))
				return vuelo;
		}
		return null;
	}

	public void agregar(Pasaje pasaje) {

		this.pasajes.add(pasaje);

	}

	public Boolean asignarAsientoParaUnPasaje(Pasaje pasaje, String asciento) {

		boolean asignacion = false;
		// Pasaje pasaje = buscarPasaje (vuelo,pasajero);
		if (!estaOcupadoElAsciento(pasaje.getVuelo(), asciento)) {
			pasaje.setAsciento(asciento);
			asignacion = true;
		}

		return asignacion;
	}

	public boolean estaOcupadoElAsciento(Vuelo vuelo, String asciento) {

		for (Pasaje pasaje : pasajes) {
			if(pasaje.getVuelo().equals(vuelo)&&pasaje.getAsciento().equals(asciento))
				return true;
		}
		
		return false;
	}

	public void subirAlvuelo(Pasaje pasaje) {
		pasaje.subirAlvuelo();
		
	}

	public List<Pasajero> obternerPasajerosAusentes(Vuelo vuelo) {
	List <Pasajero> ausentes = new ArrayList <>();
		
	for (Pasaje pasaje : this.pasajes) {
		
		if(pasaje.getVuelo().equals(vuelo) && pasaje.isChequeado()==false)
			ausentes.add(pasaje.getPasajero());
		
	}
	
	return ausentes;
	}

	public TreeSet<Vuelo> obtenerListaDeVuelosOrdenadasPorPrecioYID(){
		TreeSet<Vuelo> vuelosOrdenados = new TreeSet<>(new OrdenPrecioId());
		//xxx x = new OrdenPrecioID();
		vuelosOrdenados.addAll(vuelos);
		
		return vuelosOrdenados;
	}
	
	public TreeSet<Pasaje> obtenerListaDePasajeOrdenadoPorVueloYAsiento(){
		
		TreeSet<Pasaje> pasajesOrdenadosporVuelosYAsientos = new TreeSet<>(new OrdenPasajeVueloYAsiento());
		pasajesOrdenadosporVuelosYAsientos.addAll(pasajes);
		return pasajesOrdenadosporVuelosYAsientos;
	}
	
	
	
	
	
	
	
	
	
	
	
}
