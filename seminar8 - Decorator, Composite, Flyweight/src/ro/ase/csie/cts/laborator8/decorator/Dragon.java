package ro.ase.csie.cts.laborator8.decorator;

public class Dragon extends Supererou{

	public Dragon(String nume, int puncteViata) {
		super(nume, puncteViata);
		
	}

	@Override
	public void alearga() {
		System.out.println("Zboara catre o alta destinatie");
		
	}

	@Override
	public void esteLovit(int puncte) {
		System.out.println(String.format("%s este lovit si pierde %d puncte",
				this.nume, puncte));
		this.puncteViata -= puncte;
		
	}

	@Override
	public void seVindeca(int puncte) {
		System.out.println(String.format("%s se vindeca si recupereaza %d puncte",
				this.nume, puncte));
		this.puncteViata += puncte;
		
	}


	

}
