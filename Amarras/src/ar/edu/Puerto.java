package ar.edu;

import java.util.TreeSet;

public class Puerto {
	private TreeSet <Yate> amarras= new TreeSet<>();
	private String nombre;
	private int capacidad;

	public Puerto(String nombre, int capacidad) {
		this.nombre=nombre;
		this.capacidad=capacidad;

	}

	public void amarrar(Yate yate) throws CapacidadMaximaSuperadaException {
		// TODO Auto-generated method stub
		if(capacidad>amarras.size()) {
			
			amarras.add(yate);
		}else 
		{
			throw new CapacidadMaximaSuperadaException("se supero el limite de yates");
			
		}
		
	}

	public void desamarrar(Yate yate) {
		amarras.remove(yate);
		// TODO Auto-generated method stub
		
	}

	public TreeSet<Yate> getAmarras() {
		return amarras;
	}

	public void setAmarras(TreeSet<Yate> amarras) {
		this.amarras = amarras;
	}

	public Integer obtenerCantidadAmarras() {
		// TODO Auto-generated method stub
		return amarras.size();
	}

	public Double obtenerPrecioDeAmarre(Yate yate) {
		
		Double precio=0.0;
		for (Yate yatebuscado : amarras) {
			
			if(yatebuscado.getNombre().equals(yate.getNombre()))
				
			{
				if(yatebuscado.getEslora()>20) {
					precio=precio+3000.0;
					
				}
				else {
					precio=precio+2000.0;
					
				}
				
				
				if(yatebuscado.getMotor()instanceof Motor) {
	
				precio=precio+10000.0;
			
				return precio;
				}else {
					
					precio=precio+9000.0;			
					}
				
				
				
			}
			
		}
		// TODO Auto-generated method stub
		return precio;
	}

	public Double obtenerpreciototal() {
	Double total=0.0;
		
	Puerto puer = new Puerto(nombre, capacidad);;
		puer.setAmarras(amarras);
		
		for (Yate yateaux : puer.getAmarras()) {
			total=total+puer.obtenerPrecioDeAmarre(yateaux);
		}
		// TODO Auto-generated method stub
		return total;
	}

	public TreeSet<Yate> ordenarPorManga() {
		TreeSet<Yate>ordenmanga = new TreeSet<>(new OrdenManga());
		ordenmanga.addAll(amarras);
		return ordenmanga;
	}



	
}
