package ro.ase.csie.cts.laborator7.facade;

public class FacadeAPIJoc {
	
	//interfata simplificata pt a obtine profilul unui jucator
	public static String getProfil(String username, String pass) {
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
		
		return dateProfil;
	}
	

}
