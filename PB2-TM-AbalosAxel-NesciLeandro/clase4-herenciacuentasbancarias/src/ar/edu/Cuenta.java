package ar.edu;

public abstract class Cuenta {

	private Integer idCuenta;
	private Cliente cliente;
	private Double saldo;


	public Cuenta(Integer idCuenta, Cliente cliente, Double saldo) {
		// TODO Auto-generated constructor stub
		this.idCuenta=idCuenta;
		this.cliente=cliente;
		this.saldo=saldo;
	}

	
	
	public abstract void extraer(Double monto);
	public abstract void depositar(Double monto);


	public Integer getIdCuenta() {
		return idCuenta;
	}



	public void setIdCuenta(Integer idCuenta) {
		this.idCuenta = idCuenta;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Double getSaldo() {
		return saldo;
	}



	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
