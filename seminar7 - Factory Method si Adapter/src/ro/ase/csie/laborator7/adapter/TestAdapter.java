package ro.ase.csie.laborator7.adapter;

import java.util.ArrayList;

import ro.ase.csie.cts.laborator7.factoryMethod.CaracterDisney;
import ro.ase.csie.cts.laborator7.factoryMethod.CaracterJoc;

public class TestAdapter {

	public static void main(String[] args) {
	
		//1.colectie caractere existente
		
		ArrayList<CaracterJoc> caractereJoc = new ArrayList<>(); 
		caractereJoc.add(new CaracterDisney("Donald"));
		
		//2.colectie caractere EA
		ArrayList<InterfataCaracterEA> caractereEA = new ArrayList<>();
		caractereEA.add(new CaracterGenericEA());
		
		//folosind adapter
		InterfataCaracterEA caracterEA = new CaracterGenericEA();
		AdapterEA2CaracterJoc adapt = new AdapterEA2CaracterJoc(caracterEA);
		caractereJoc.add(adapt);

	}

}
