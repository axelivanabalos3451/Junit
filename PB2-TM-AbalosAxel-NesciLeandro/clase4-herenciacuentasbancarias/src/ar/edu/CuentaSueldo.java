package ar.edu;

public class CuentaSueldo extends Cuenta {

	public CuentaSueldo(Integer idCuenta, Cliente clien, Double saldo) {
		
		super(idCuenta, clien, saldo);
	
	}

	@Override
	public void extraer(Double monto) {

		this.setSaldo(getSaldo()-monto);
		
		
		
		
	}

	@Override
	public void depositar(Double monto) {
		// TODO Auto-generated method stub
		this.setSaldo(getSaldo()+monto);
		
	}

}
