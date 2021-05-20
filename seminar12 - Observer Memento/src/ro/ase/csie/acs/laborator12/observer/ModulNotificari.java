package ro.ase.csie.acs.laborator12.observer;

public class ModulNotificari implements InterfataStatusConexiuneServer{

	@Override
	public void conexiuneIntrerupta() {
		System.out.println("PopUP: conexiune pierduta");
		
	}

	@Override
	public void conexiuneActiva() {
		System.out.println("PopUp: Conexiune activa");
		
	}

}
