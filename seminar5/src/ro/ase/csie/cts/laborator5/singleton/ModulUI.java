package ro.ase.csie.cts.laborator5.singleton;

public class ModulUI {
	
	//ConexiuneBD conexiune1 = new Conexiune("10.0.0.1", "cts");
	ConexiuneBd conexiune = ConexiuneBd.getConexiune();

}
