package ar.edu;

public class Avion {

	private Integer id;
	private String modelo;
	private Integer cantAsientos;

	public Avion(Integer id, String modelo, Integer cantAsientos) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.modelo=modelo;
		this.cantAsientos=cantAsientos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getCantAsientos() {
		return cantAsientos;
	}

	public void setCantAsientos(Integer cantAsientos) {
		this.cantAsientos = cantAsientos;
	}

}
