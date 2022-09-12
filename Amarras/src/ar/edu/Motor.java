package ar.edu;

public class Motor extends Propulsor {

	private Integer desplazamiento;
	private String propulsion;
	private Integer velocidad;
	private Integer autonomia;

	public Motor(Integer desplazamiento, String propulsion, Integer velocidad, Integer autonomia) {
		
		this.desplazamiento=desplazamiento;
		this.propulsion=propulsion;
		this.velocidad=velocidad;
		this.autonomia=autonomia;
				
	}

	public Integer getDesplazamiento() {
		return desplazamiento;
	}

	public void setDesplazamiento(Integer desplazamiento) {
		this.desplazamiento = desplazamiento;
	}

	public String getPropulsion() {
		return propulsion;
	}

	public void setPropulsion(String propulsion) {
		this.propulsion = propulsion;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}

	public Integer getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(Integer autonomia) {
		this.autonomia = autonomia;
	}




	
}
