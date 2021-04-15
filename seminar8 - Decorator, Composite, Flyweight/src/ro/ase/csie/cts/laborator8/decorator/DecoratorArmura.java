package ro.ase.csie.cts.laborator8.decorator;

public class DecoratorArmura extends DecoratorErouAbstract{

	int nivelArmura;
	
	public DecoratorArmura(Supererou erou, int nivelArmura) {
		super(erou);	
		this.nivelArmura = nivelArmura;
	}

	@Override
	public void esteLovit(int puncte) {
		int punctePierdute = puncte - nivelArmura;
		if(punctePierdute > 0) {
			this.erou.esteLovit(punctePierdute);
		}
	}


	
	

}
