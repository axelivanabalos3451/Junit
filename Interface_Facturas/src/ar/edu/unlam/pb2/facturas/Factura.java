package ar.edu.unlam.pb2.facturas;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Factura {

	private List<Detalle> detalles = new LinkedList<Detalle>();
	
	public void addDetalle(Detalle detalle) {
		this.detalles.add(detalle);
	}
	
	public List<Detalle> getDetalles() {
		return Collections.unmodifiableList(this.detalles);
	}

	public Double getPrecioTotal() {
		
		Double total = 0.0;
		
		for (Detalle detalle : this.detalles) {
			
			total += detalle.getPrecioTotal();
			
		}
		
		return total;
		
	}
	
}
