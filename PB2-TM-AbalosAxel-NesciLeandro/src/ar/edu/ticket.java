package ar.edu;

public class ticket {
	
	private Integer numeroTicket;
	private String numeroasiento;
	private Double precio;

	public ticket(Integer numeroticket, String string) {
		// TODO Auto-generated constructor stub
		this.numeroTicket=numeroTicket;
		this.numeroasiento=numeroasiento;
		
	}

	public ticket(Integer numeroticket2, String numeroasiento2, Double precio2) {
		// TODO Auto-generated constructor stub
		this.numeroTicket = numeroticket2;
		this.numeroasiento = numeroasiento2;
		this.precio = precio2;
	}

	public Integer getNumeroTicket() {
		return numeroTicket;
	}

	public void setNumeroTicket(Integer numeroTicket) {
		this.numeroTicket = numeroTicket;
	}

	public String getNumeroasiento() {
		return numeroasiento;
	}

	public void setNumeroasiento(String numeroasiento) {
		this.numeroasiento = numeroasiento;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	

}
