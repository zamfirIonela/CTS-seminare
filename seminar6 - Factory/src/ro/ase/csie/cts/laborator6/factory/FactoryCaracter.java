package ro.ase.csie.cts.laborator6.factory;

public class FactoryCaracter {
	
	public static CaracterAbstract getCaracter(TipCaracter tip, String nume) {
		CaracterAbstract caracterAbstract = null;
		
		switch(tip) {
		case DISNEY:
			caracterAbstract = new CaracterDisney("alb", nume);
			break;
		case MARVEL:
			caracterAbstract = new CaracterMarvel(nume, 50);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return caracterAbstract;
		
	}

}
