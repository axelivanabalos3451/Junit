package ar.edu.unlam.ae;

import java.time.LocalDateTime;

public class Vuelo implements Comparable<Vuelo> {

	private Integer idVuelo;
	private String aeropuertoOrigen;
	private String aeropuertoDestino;
	private LocalDateTime horaDespegue;
	private LocalDateTime horaAterrizaje;
	private Double precio;

	public Vuelo(Integer idVuelo, String aeropuertoOrigen, String aeropuertoDestino, LocalDateTime horaDespegue,
			LocalDateTime horaAteriizaje,Double precio) {
	this.idVuelo=idVuelo;
	this.aeropuertoOrigen=aeropuertoOrigen;
	this.aeropuertoDestino=aeropuertoDestino;
	this.horaDespegue=horaDespegue;
	this.horaAterrizaje=horaAteriizaje;
	this.precio=precio;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(Integer idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getAeropuertoOrigen() {
		return aeropuertoOrigen;
	}

	public void setAeropuertoOrigen(String aeropuertoOrigen) {
		this.aeropuertoOrigen = aeropuertoOrigen;
	}

	public String getAeropuertoDestino() {
		return aeropuertoDestino;
	}

	public void setAeropuertoDestino(String aeropuertoDestino) {
		this.aeropuertoDestino = aeropuertoDestino;
	}

	public LocalDateTime getHoraDespegue() {
		return horaDespegue;
	}

	public void setHoraDespegue(LocalDateTime horaDespegue) {
		this.horaDespegue = horaDespegue;
	}

	public LocalDateTime getHoraAterrizaje() {
		return horaAterrizaje;
	}

	public void setHoraAterrizaje(LocalDateTime horaAterrizaje) {
		this.horaAterrizaje = horaAterrizaje;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idVuelo == null) ? 0 : idVuelo.hashCode());
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
		Vuelo other = (Vuelo) obj;
		if (idVuelo == null) {
			if (other.idVuelo != null)
				return false;
		} else if (!idVuelo.equals(other.idVuelo))
			return false;
		return true;
	}

	@Override
	public int compareTo(Vuelo o) {
		
		if(this.aeropuertoOrigen.compareTo(o.aeropuertoOrigen) == 0){
			return this.getIdVuelo().compareTo(o.idVuelo);
		}
		return this.aeropuertoOrigen.compareTo(o.aeropuertoOrigen);

	}
	
	
	
	
	

}
