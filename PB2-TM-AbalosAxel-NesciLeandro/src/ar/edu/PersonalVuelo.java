package ar.edu;

public class PersonalVuelo extends Personal{

	private String tipo;
	public PersonalVuelo(Integer dni, String nombre) {
		super(dni, nombre);
		this.tipo="personav";
		// TODO Auto-generated constructor stub
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
