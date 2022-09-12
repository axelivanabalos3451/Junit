package ar.edu.unlam.pb2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Veterinaria {

	private String nombre;
	private TreeSet<Dueño>clientes= new TreeSet<>();
	private TreeSet<Atencion> atenciones= new TreeSet<>();
	private Map<Integer,Integer>mapa = new HashMap<>();
	

	public Veterinaria(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregardueño(Dueño axel) {
		// TODO Auto-generated method stub
		clientes.add(axel);
		
	}

	public TreeSet<Dueño> getClientes() {
		return clientes;
	}

	public void setClientes(TreeSet<Dueño> clientes) {
		this.clientes = clientes;
	}

	public void atender(Atencion atencion) {
		// TODO Auto-generated method stub
		atenciones.add(atencion);
	
		
	}

	public TreeSet<Atencion> getAtenciones() {
		return atenciones;
	}

	public void setAtenciones(TreeSet<Atencion> atenciones) {
		this.atenciones = atenciones;
	}

	public Boolean buscarDueño(Dueño axel) throws DuenioInexistenteException {
		// TODO Auto-generated method stub
		Boolean encontrado=false;
		for (Dueño dueñobuscado : clientes) {
			if(dueñobuscado.equals(axel)) 
			{
				encontrado=true;
				
				
			}
		}
		
		if (encontrado==false) {
		throw new DuenioInexistenteException("no se encontro el dueño");}
		return encontrado;
		
	}

	public void llenarmapa(Integer dni, Integer id) {
		mapa.put(dni, id);
		
	}

	public Map<Integer, Integer> getMapa() {
		return mapa;
	}

	public void setMapa(Map<Integer, Integer> mapa) {
		this.mapa = mapa;
	}
	
	
	

}
