package ro.ase.csie.acs.laborator12.observer;

import java.util.ArrayList;
import java.util.List;

public class ModulStareConexiuneServer {

	List<InterfataStatusConexiuneServer> module = new ArrayList<>();
	
	public void register(InterfataStatusConexiuneServer modul) {
		this.module.add(modul);
	}
	
	public void unregister(InterfataStatusConexiuneServer modul) {
		this.module.remove(modul);
	}
	
	public void detectieSchimbareStareConexiune(StareConxiune stare) {
		if(stare == StareConxiune.ACTIVA) {
			for(InterfataStatusConexiuneServer modulConexiuneServer : module) {
				modulConexiuneServer.conexiuneActiva();
			}
		}
		
		if(stare == StareConxiune.INCTIVA) {
			for(InterfataStatusConexiuneServer modulConexiuneServer : module) {
				modulConexiuneServer.conexiuneIntrerupta();
			}
		}

	}
	
}
