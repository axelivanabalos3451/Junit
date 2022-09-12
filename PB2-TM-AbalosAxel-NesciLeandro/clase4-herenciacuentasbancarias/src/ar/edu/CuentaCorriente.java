package ar.edu;

public class CuentaCorriente extends Cuenta {

	private Double montodescubierto;
	private Double montodescubiertofijo;

	public CuentaCorriente(Integer idCuenta, Cliente cliente, Double saldo, Double montodescubierto, Double montodescubiertofijo) {
		super(idCuenta, cliente, saldo);
		
		this.montodescubierto=montodescubierto;
		this.montodescubiertofijo=montodescubiertofijo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void extraer(Double monto) {
		// TODO Auto-generated method stub
		if(this.getSaldo()>=monto) {
		this.setSaldo(getSaldo()-monto);
		}
		else
			if(this.getMontodescubierto()>=(monto-this.getSaldo())) 
			{
				Double descubierto= (monto-this.getSaldo())*1.05;
				
			if(this.getMontodescubierto()>=descubierto) 
			{
				
				this.setMontodescubierto((monto-this.getSaldo())*0.95);
				this.setSaldo(0.0);
			}
				
			
				
			}
	}

	@Override
	public void depositar(Double monto) {
		// TODO Auto-generated method stub

	}

	public Double getMontodescubierto() {
		return montodescubierto;
	}

	public void setMontodescubierto(Double montodescubierto) {
		this.montodescubierto = montodescubierto;
	}

}
