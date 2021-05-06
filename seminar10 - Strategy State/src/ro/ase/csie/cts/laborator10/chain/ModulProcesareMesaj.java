package ro.ase.csie.cts.laborator10.chain;

public abstract class ModulProcesareMesaj {
	
	ModulProcesareMesaj next = null;
	public abstract void procesareMesaj(MesajChat mesaj);

}
