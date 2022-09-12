package ar.edu.unlam.pb2.facturas;

public class Articulo {

	
	private String descripcion;
	private Double precio;
	
	public Articulo(String descripcion, Double precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Double getPrecio() {
		return this.precio;
	}

	public Double getImpuesto() {
		return 0.21 * this.getPrecio();
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public Double getPrecioFinal() {
		return this.getImpuesto() + this.getPrecio();
	}
	
}
