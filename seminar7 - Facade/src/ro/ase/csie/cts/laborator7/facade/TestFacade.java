package ro.ase.csie.cts.laborator7.facade;

public class TestFacade {

	public static void main(String[] args) {
		
		//1.creare conexiune
		ConexiuneServerJoc conexiuneServerJoc = new ConexiuneServerJoc();
		conexiuneServerJoc.conectare();
		
		//2.login player
		Player player = new Player();
		player.login(conexiuneServerJoc);
		
		//3.obtine profil
		ProfilPlayer profilPlayer = player.getProfil();
		
		//4.obtinem datele
		String dateProfil = profilPlayer.getProfil();

		//prin Facade
		String dateProfil2 = FacadeAPIJoc.getProfil("player1", "1234");
	}

}
