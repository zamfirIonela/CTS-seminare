package ro.ase.csie.cts.laborator8.decorator;

public abstract class DecoratorErouAbstract extends Supererou {
	
	Supererou erou = null;
	
	public DecoratorErouAbstract(Supererou erou) {
		super(erou.nume, erou.puncteViata);
		this.erou = erou;
	}

	@Override
	public void alearga() {
		this.erou.alearga();
		
	}

	@Override
	public void esteLovit(int puncte) {
		this.erou.esteLovit(puncte);
		
	}

	@Override
	public void seVindeca(int puncte) {
		this.erou.seVindeca(puncte);
		
	}

}
