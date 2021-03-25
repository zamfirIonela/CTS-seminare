package ro.ase.csie.cts.laborator5.singleton.vStatica;

public class ConexiuneBD {
	
	String ip;
	String denumire;
	
	public static final ConexiuneBD conexiune;
	
	static {
		//preluare date conexiune din alte surse
		String ip = "127.0.0.1";
		String denumire = "bdtest" ;
		conexiune = new ConexiuneBD(ip, denumire);
	}

	private ConexiuneBD(String ip, String denumire) {
		super();
		this.ip = ip;
		this.denumire = denumire;
	}
	
	
	
	

}

