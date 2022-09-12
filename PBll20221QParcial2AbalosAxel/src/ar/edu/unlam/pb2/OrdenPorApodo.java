package ar.edu.unlam.pb2;

import java.util.Comparator;

public class OrdenPorApodo implements Comparator<Mascota>{

	@Override
	public int compare(Mascota mascota1, Mascota mascota2) {
		// TODO Auto-generated method stub
		return mascota1.getApodo().compareTo(mascota2.getApodo());
	}



}
