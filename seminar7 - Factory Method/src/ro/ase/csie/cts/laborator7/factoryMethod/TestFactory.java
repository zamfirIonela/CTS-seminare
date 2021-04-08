package ro.ase.csie.cts.laborator7.factoryMethod;

public class TestFactory {

	public static void main(String[] args) {
		
		boolean esteJoc4Kids = true;
		
		if(esteJoc4Kids) {
			//dezv doar cu caractere 4kids
		}else {
			//devz doar cu caractrere normale
		}
		
		FactoryAbstractCaracter factoryCaracter = null;
		factoryCaracter = (esteJoc4Kids) ? new FactoryMod4Kids() : new FactoryModNormal();
		
		//dezv joc
		CaracterJoc superman = factoryCaracter.getCaracter(TipCaracter.MARVEL, "Superman");
		
	}

}
