package ro.ase.csie.laborator7.adapter;

import ro.ase.csie.cts.laborator7.factoryMethod.CaracterJoc;

public class AdapterEA2CaracterJoc extends CaracterJoc{
	
	InterfataCaracterEA caracterEA;

	public AdapterEA2CaracterJoc(InterfataCaracterEA caracterEA) {
		super();
		this.caracterEA = caracterEA;
	}

	@Override
	public void seDeplaseaza() {
		caracterEA.move();
	}
	
	

}
