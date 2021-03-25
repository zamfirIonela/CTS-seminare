package ro.ase.csie.cts.laborator5.singleton;

public class ConexiuneBd {
	
	String ip;
	String denumire;
	
	private static ConexiuneBd conexiuneBd = null;
	
	
	private ConexiuneBd() {
		
	}
	
	private ConexiuneBd(String ipString, String denumireString) {
		System.out.println("Apel constructor");
		this.ip = ipString;
		this.denumire = denumireString;
	}
	
	//versiune lazy
	public static ConexiuneBd getConexiune() {
		
		if(conexiuneBd == null) {
			//
			conexiuneBd = new ConexiuneBd("10.0.01.1", "cts");
		}
		
		return conexiuneBd;
	}
	

}
