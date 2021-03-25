package ro.ase.csie.cts.laborator5.singleton.registru;

public class TestRegistruSingleton {

	public static void main(String[] args) {
		ConexiuneBD conexiune1 = ConexiuneBD.getConexiune("10.0.0.1", "cts"); 
		ConexiuneBD conexiune2 = ConexiuneBD.getConexiune("10.0.0.1", "cts"); 
		ConexiuneBD conexiune3 = ConexiuneBD.getConexiune("10.0.0.5", "cts"); 
		
		if(conexiune1 == conexiune2) {
			System.out.println("Conexiunile 1 si 2 sunt identice");
		}else {
			System.out.println("Conexiunile 1 si 2 sunt diferite");
		}
		
		if(conexiune1 == conexiune3) {
			System.out.println("Conexiunile 1 si 3 sunt identice");
		}else {
			System.out.println("Conexiunile 1 si 3 sunt diferite");
		}

	}

}
