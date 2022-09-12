package ar.edu.unlam.pb2.facturas;

public class ReportadorBasico implements Reportador {

	private String reporte = "";
	
	@Override
	public String reportar(Factura factura) {
		
		reportarEncabezado(factura);
		reportarLineas(factura);
		reportarTotal(factura);
		
		return this.reporte;
	}

	private void reportarEncabezado(Factura factura) {
		this.reporte += "Reporte de factura - Empresa 'La Perseverancia'";
		
	}

	private void reportarLineas(Factura factura) {
		for (Detalle det : factura.getDetalles()) {
			this.reporte += "\n" + det.getCantidad() + "u. " + det.getArticulo().getDescripcion() + " " + det.getPrecioTotal();
		}
		
	}
	
	private void reportarTotal(Factura factura) {
		this.reporte += "\nTotal: " + factura.getPrecioTotal();
	}
	
}
