package ro.ase.csie.acs.laborator12.observer;

public class ModulSlavareAutomata implements InterfataStatusConexiuneServer{

	@Override
	public void conexiuneIntrerupta() {
		System.out.println("Salvare automata date joc");
	}

	@Override
	public void conexiuneActiva() {
		System.out.println("Afisare istoric salvari");
	}

}
