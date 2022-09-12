package ar.edu;

public class Yate implements Comparable<Yate> {

	private String nombre;
	private String dueño;
	private Double manga;
	private Double calado;
	private Double eslora;
	private Integer tripulacion;
	private Integer peso;
	private Propulsor motor;

	public Yate(String nombre, String dueño, Double manga, Double calado, Double eslora, Integer tripulacion,
			Integer peso, Propulsor motor) {
		this.nombre=nombre;
		this.dueño=dueño;
		this.manga=manga;
		this.calado=calado;
		this.eslora=eslora;
		this.tripulacion=tripulacion;
		this.peso=peso;
		this.motor=motor;


		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDueño() {
		return dueño;
	}

	public void setDueño(String dueño) {
		this.dueño = dueño;
	}

	public Double getManga() {
		return manga;
	}

	public void setManga(Double manga) {
		this.manga = manga;
	}

	public Double getCalado() {
		return calado;
	}

	public void setCalado(Double calado) {
		this.calado = calado;
	}

	public Double getEslora() {
		return eslora;
	}

	public void setEslora(Double eslora) {
		this.eslora = eslora;
	}

	public Integer getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(Integer tripulacion) {
		this.tripulacion = tripulacion;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Propulsor getMotor() {
		return motor;
	}

	public void setMotor(Propulsor motor) {
		this.motor = motor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calado == null) ? 0 : calado.hashCode());
		result = prime * result + ((dueño == null) ? 0 : dueño.hashCode());
		result = prime * result + ((eslora == null) ? 0 : eslora.hashCode());
		result = prime * result + ((manga == null) ? 0 : manga.hashCode());
		result = prime * result + ((motor == null) ? 0 : motor.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((peso == null) ? 0 : peso.hashCode());
		result = prime * result + ((tripulacion == null) ? 0 : tripulacion.hashCode());
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
		Yate other = (Yate) obj;
		if (calado == null) {
			if (other.calado != null)
				return false;
		} else if (!calado.equals(other.calado))
			return false;
		if (dueño == null) {
			if (other.dueño != null)
				return false;
		} else if (!dueño.equals(other.dueño))
			return false;
		if (eslora == null) {
			if (other.eslora != null)
				return false;
		} else if (!eslora.equals(other.eslora))
			return false;
		if (manga == null) {
			if (other.manga != null)
				return false;
		} else if (!manga.equals(other.manga))
			return false;
		if (motor == null) {
			if (other.motor != null)
				return false;
		} else if (!motor.equals(other.motor))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (peso == null) {
			if (other.peso != null)
				return false;
		} else if (!peso.equals(other.peso))
			return false;
		if (tripulacion == null) {
			if (other.tripulacion != null)
				return false;
		} else if (!tripulacion.equals(other.tripulacion))
			return false;
		return true;
	}

	@Override
	public int compareTo(Yate o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.getNombre());
	}
	

}
