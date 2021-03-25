package ro.ase.csie.cts.laborator5.singleton.vStatica;

public class TestSingleton {

	public static void main(String[] args) {
		 
		ConexiuneBD conexiune1 = ConexiuneBD.conexiune;
		ConexiuneBD conexiune2 = ConexiuneBD.conexiune;
		
		if(conexiune1 == conexiune2) {
			System.out.println("Cele 2 conexiuni sunt identice");
		}

	}

}
