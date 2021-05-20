package ro.ase.csie.acs.laborator12.observer;

public class TestObserver {

	public static void main(String[] args) {
		ModulStareConexiuneServer conexiuneServer =new ModulStareConexiuneServer();
		
		ModulNotificari notificari = new ModulNotificari();
		ModulSlavareAutomata backupAutomata  = new ModulSlavareAutomata();
		
		conexiuneServer.detectieSchimbareStareConexiune(StareConxiune.ACTIVA);
		conexiuneServer.register(backupAutomata);
		conexiuneServer.register(notificari);
		
		conexiuneServer.detectieSchimbareStareConexiune(StareConxiune.INCTIVA);
		conexiuneServer.unregister(backupAutomata);
		
		conexiuneServer.detectieSchimbareStareConexiune(StareConxiune.ACTIVA);

	}

}
