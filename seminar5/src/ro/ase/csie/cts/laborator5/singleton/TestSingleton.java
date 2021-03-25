package ro.ase.csie.cts.laborator5.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		ConexiuneBd conexiune1 = new ConexiuneBd.getConexiune();
		ConexiuneBd conexiune2 = new ConexiuneBd.getConexiune();
		
		if(conexiune1 == conexiune2) {
			System.out.println();
		}

	}

}
