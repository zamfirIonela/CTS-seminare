package ro.ase.csie.cts.laborator9.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Model3DFactory {
	
	public static Map<String, InterfataFlyweightModel3D> modele = new HashMap<>();
	
	static {
		modele.put(TipModel3D.CLADIRE.toString(), new FlyweghtModel3D("Cladire"));
		modele.put(TipModel3D.SOLDAT.toString(), new FlyweghtModel3D("Soldat"));
	}
	
	public static InterfataFlyweightModel3D getModel(TipModel3D tip) {
		return modele.get(tip.toString());
	}

}
