package ro.ase.csie.cts.laborator9.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweghtModel3D implements InterfataFlyweightModel3D {

	public String numeModel;
	List<Integer> puncteModel = new ArrayList<>();
	
	public FlyweghtModel3D(String numeModel) {
		super();
		this.numeModel = numeModel;
	}

	@Override
	public void afisareEcran(DateEcran date) {
		System.out.println(String.format("Afisare %s la coordonatele %d,%d,%d cu %s", 
				numeModel, date.x, date.y, date.z, date.textura));
	}
	
	
	

}
