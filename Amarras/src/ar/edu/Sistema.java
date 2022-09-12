package ar.edu;

import java.util.TreeSet;

public class Sistema {

	private Puerto fondeadero;

	public Sistema(Puerto fondeadero) {
		this.fondeadero=fondeadero;

	}

	public Double obtenerpreciototal() {
		Double total=0.0;
		
		TreeSet<Yate> Amarras = fondeadero.getAmarras();
		
		for (Yate yateaux : Amarras) {
			total=total+fondeadero.obtenerPrecioDeAmarre(yateaux);
		}
		// TODO Auto-generated method stub
		return total;
		
	}

}
