package ro.ase.csie.cts.laborator10.chain;

public class TestChain {

	public static void main(String[] args) {
		
		ModulProcesareMesaj modulFiltru = new ModulFiltruRomana();
		ModulProcesareMesaj modulPrivat = new ModulMesajePrivate();
		ModulProcesareMesaj modulGrup = new ModulMesajeGrup();
		
		modulFiltru.setNext(modulPrivat);
		modulPrivat.setNext(modulGrup);
		
		ModulProcesareMesaj serverChat = modulFiltru;
		
		serverChat.procesareMesaj(new MesajChat("Salut!", 3, "@gigel"));
		serverChat.procesareMesaj(new MesajChat("Esti un jucator rau!", 3, "@gigel"));
		serverChat.procesareMesaj(new MesajChat("Buna tuturor!", 3, "@everyone"));
		

	}

}
