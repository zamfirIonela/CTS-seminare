package ro.ase.csie.cts.laborator10.chain;

public class ModulMesajeGrup extends ModulProcesareMesaj {

	@Override
	public void procesareMesaj(MesajChat mesaj) {
		if (mesaj.destinatie.toLowerCase().equals("@everyone")) {
			System.out.println("Mesajul este trimis tuturor");
		}

		if (this.next != null) {
			this.next.procesareMesaj(mesaj);
		}

	}

}
