package ar.edu;

import java.util.Comparator;

public class OrdenManga implements Comparator<Yate>{

	@Override
	public int compare(Yate yate1, Yate yate2) {
		if(yate1.getManga().compareTo(yate2.getManga())==0)
				{
			return yate1.getNombre().compareTo(yate2.getNombre());
			
			
				}
		

		return yate1.getManga().compareTo(yate2.getManga());
	}

}
