package ro.ase.csie.cts.laborator5.singleton;

public class ModulProfil {

	public ModulProfil() {
		//ConexiuneBd conexiuneBd = new ConexiuneBd("100.0.0.1", "cts");
		ConexiuneBd conexiune = ConexiuneBd.getConexiune();
	}
}
