package ar.edu;

public class PasajeroVip extends Pasajero{

	public PasajeroVip(String nombre, Integer dni, ticket ticketvuelo) {
		super(nombre, dni, ticketvuelo);
		// TODO Auto-generated constructor stub
	}

	public void aplicarDescuento(ticket ticketvueloVip) {
		
		ticketvueloVip.setPrecio(ticketvueloVip.getPrecio()*0.95);
	// TODO Auto-generated method stub
		
	}

}
