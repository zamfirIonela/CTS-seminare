package ro.ase.csie.cts.laborator6.factory;

import java.util.ArrayList;

public class TestFactory {

	public static void main(String[] args) {
		

//	CaracterAbstract mickeyMouse = new CaracterDisney("rosu", "Mickey Mouse");
//	CaracterAbstract spiderMan = new CaracterMarvel("Spiderman", 100);
	
	CaracterAbstract mickeyMouseAbstract = FactoryCaracter.getCaracter(TipCaracter.DISNEY, "Mickey Mouse");
		
	ArrayList<CaracterAbstract> caractereAbstracts = new ArrayList<>();

	}

}
