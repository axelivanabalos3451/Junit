package ar.edu;

public class CajaAhorro extends Cuenta {
	private Integer numeroextracciones=0;

	public CajaAhorro(Integer idCuenta, Cliente cliente, Double saldo, Integer numeroextracciones) {
		super(idCuenta, cliente, saldo);
		this.numeroextracciones=numeroextracciones;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void extraer(Double monto) {
		// TODO Auto-generated method stub
	
		if(numeroextracciones>=5) {
		this.setSaldo(getSaldo()-monto-6);}
		else {
	this.setSaldo(getSaldo()-monto);
	numeroextracciones++;
		}
	}

	@Override
	public void depositar(Double monto) {
		// TODO Auto-generated method stub

	}

}
