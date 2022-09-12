package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.TreeSet;

public class Atencion implements Comparable<Atencion> {

	private Integer dni;
	private Integer id;
	private Double precio;
	private ArrayList<Medicamento> medicamentosDisponibles= new ArrayList<>();
	private ArrayList<Medicamento> medicamentosAsignados= new ArrayList<>();

	public Atencion(int dni, int id, Double precio) {
		// TODO Auto-generated constructor stub
		this.dni=dni;
		this.id=id;
		this.precio=0.0;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	@Override
	public int compareTo(Atencion o) {
	
		return dni.compareTo(o.getDni());
	}
	

	public void asignarMedicamento(Integer dni, Integer idMedicamento) {
		for (Medicamento medicamento : medicamentosDisponibles) {
			if(idMedicamento.equals(medicamento.getId())) 
			{
				medicamentosAsignados.add(medicamento);
				this.precio=precio+medicamento.getPrecio();
				
				
			}
			
		}
		
	}

	public void reponerStock(Medicamento medi) {
		// TODO Auto-generated method stub
		medicamentosDisponibles.add(medi);
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public ArrayList<Medicamento> getMedicamentosDisponibles() {
		return medicamentosDisponibles;
	}

	public void setMedicamentosDisponibles(ArrayList<Medicamento> medicamentosDisponibles) {
		this.medicamentosDisponibles = medicamentosDisponibles;
	}

	public ArrayList<Medicamento> getMedicamentosAsignados() {
		return medicamentosAsignados;
	}

	public void setMedicamentosAsignados(ArrayList<Medicamento> medicamentosAsignados) {
		this.medicamentosAsignados = medicamentosAsignados;
	}

}
