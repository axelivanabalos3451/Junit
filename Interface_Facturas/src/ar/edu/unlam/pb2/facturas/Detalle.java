package ar.edu.unlam.pb2.facturas;

public class Detalle {

	private Articulo articulo;
	private Integer cantidad;
	
	public Detalle(Articulo articulo, Integer cantidad) {
		this.articulo = articulo;
		this.cantidad = cantidad;
	}
	
	public Articulo getArticulo() {
		return this.articulo;
	}
	
	public Integer getCantidad() {
		return this.cantidad;
	}
	
	public Double getPrecioTotal() {
		return this.getArticulo().getPrecioFinal() * this.getCantidad();
	}
	
}
