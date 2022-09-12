package ar.edu;

public class Pasajero {

	private String nombre;
	private Integer dni;
	private ticket ticketvuelo;

	public Pasajero(String nombre, Integer dni, ticket ticketvuelo) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.dni=dni;
		this.ticketvuelo=ticketvuelo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public ticket getTicketvuelo() {
		return ticketvuelo;
	}

	public void setTicketvuelo(ticket ticketvuelo) {
		this.ticketvuelo = ticketvuelo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((ticketvuelo == null) ? 0 : ticketvuelo.hashCode());
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
		Pasajero other = (Pasajero) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (ticketvuelo == null) {
			if (other.ticketvuelo != null)
				return false;
		} else if (!ticketvuelo.equals(other.ticketvuelo))
			return false;
		return true;
	}

}
