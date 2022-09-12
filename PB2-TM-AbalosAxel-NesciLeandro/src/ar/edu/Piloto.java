package ar.edu;

public class Piloto extends Personal{

	private Integer idPiloto;
	private String modelo;
	private String tipo;

	public Piloto(Integer dni, String nombre,Integer idPiloto, String modelo) {
		// TODO Auto-generated constructor stub
		super(dni,nombre);
		this.idPiloto=idPiloto;
		this.modelo=modelo;
		this.tipo="piloto";
	}

	public Integer getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(Integer idPiloto) {
		this.idPiloto = idPiloto;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPiloto == null) ? 0 : idPiloto.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piloto other = (Piloto) obj;
		if (idPiloto == null) {
			if (other.idPiloto != null)
				return false;
		} else if (!idPiloto.equals(other.idPiloto))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		return true;
	}

}
