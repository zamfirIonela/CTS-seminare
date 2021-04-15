package ro.ase.csie.cts.laborator8.decorator;

public class DecoratorEsteRanit extends DecoratorErouAbstract{

	public static final int NIVEL_CRITIC = 200;
	
	public DecoratorEsteRanit(Supererou erou) {
		super(erou);	
	}

	@Override
	public void alearga() {
		if(this.erou.puncteViata  < NIVEL_CRITIC) {
			System.out.println("Eroul nu mai poate alerga. Este ranit grav");
		}else {
			this.erou.alearga();
		}
	}
	
	

}
