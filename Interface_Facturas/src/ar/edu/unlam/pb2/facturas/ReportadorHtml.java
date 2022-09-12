package ar.edu.unlam.pb2.facturas;

public class ReportadorHtml implements Reportador {

	private String reporte = "";
	
	@Override
	public String reportar(Factura factura) {
		
		reportarEncabezado(factura);
		reportarLineas(factura);
		reportarTotal(factura);
		
		return this.reporte;
	}

	private void reportarEncabezado(Factura factura) {
		this.reporte += "<h1>Reporte de factura - Empresa 'La Perseverancia'</h1>";
		
	}

	private void reportarLineas(Factura factura) {
		
		this.reporte += "\n<ul>";
		
		for (Detalle det : factura.getDetalles()) {
			this.reporte += "\n<li>" + det.getCantidad() + "u. " + det.getArticulo().getDescripcion() + " " + det.getPrecioTotal() + "</li>";
		}
		
		this.reporte += "\n</ul>";
		
	}
	
	private void reportarTotal(Factura factura) {
		this.reporte += "\n<b>Total: " + factura.getPrecioTotal() + "</b>";
	}
	
}
