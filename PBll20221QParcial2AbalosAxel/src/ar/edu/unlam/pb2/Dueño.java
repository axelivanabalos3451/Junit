package ar.edu.unlam.pb2;

import java.util.TreeSet;

public class Dueño implements Comparable<Dueño> {

	private Integer dni;
	private String nombre;
	private TreeSet <Mascota>mascotas= new TreeSet<>();

	public Dueño(Integer dni, String nombre) {
		// TODO Auto-generated constructor stub
		this.dni=dni;
		this.nombre=nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void adoptarMascota(Mascota mascota) throws MascotaDuplicadaException {
		// TODO Auto-generated method stub
		//mascota.getId() el get estaba en int,(en primitivo), por eso no me dejaba tirar el .equals
		
		
		for (Mascota mascota2 : mascotas) {
		
			if(mascota2.getId().equals(mascota.getId())) 
			{
				throw new MascotaDuplicadaException("duplicada");
			
			}
			
		}
		mascotas.add(mascota);
	
		
		
		
				
				
				
			
			
		
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
		Dueño other = (Dueño) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	public TreeSet<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(TreeSet<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	@Override
	public int compareTo(Dueño o) {
		// TODO Auto-generated method stub
		return dni.compareTo(o.getDni());
	}

	public TreeSet<Mascota> obtenerListaDeMascotasOrdeNadasPorApodo() {
		TreeSet<Mascota>mascotasdos= new TreeSet<>(new OrdenPorApodo());
		mascotasdos.addAll(mascotas);

		return mascotasdos;
	}

	public Boolean buscarMascota(Mascota simba) throws MascotaNoEncontradaException {
		Boolean encontrado=false;
		for (Mascota mascotabuscado : mascotas) {
			if(mascotabuscado.getId()==simba.getId()) 
			{
				encontrado=true;
				
				
			}
		// TODO Auto-generated method stub
		
	}
		if(encontrado==false)
		{
			throw new MascotaNoEncontradaException("no esta");
		}
return encontrado;



	
	}}

