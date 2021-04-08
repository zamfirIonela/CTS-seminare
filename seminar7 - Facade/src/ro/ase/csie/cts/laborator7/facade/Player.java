package ro.ase.csie.cts.laborator7.facade;

public class Player {
	
	public void login(ConexiuneServerJoc conexiune) {
		System.out.println("Login player");
	}

	public ProfilPlayer getProfil() {
		return new ProfilPlayer();
	}
}
