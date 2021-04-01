package ro.ase.csie.cts.laborator6.factory;

public class CaracterDisney extends CaracterAbstract{
	String culoare;
	boolean okPentruCopiiMici;
	
	public CaracterDisney(String culoare, String nume) {
		super();
		this.culoare = culoare;
		this.nume = nume;
	}

	@Override
	public void alearga() {
		System.out.println("Alearga...");
		
	}

	@Override
	public void sare() {
		System.out.println("Sare...");
		
	}

}
