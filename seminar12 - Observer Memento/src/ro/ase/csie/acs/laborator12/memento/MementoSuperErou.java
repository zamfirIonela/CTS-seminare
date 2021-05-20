package ro.ase.csie.acs.laborator12.memento;

import java.util.Date;

public class MementoSuperErou {

	String nume;
	int puncteViata;
	String magie;
	
	Date dataSalvare;

	public MementoSuperErou(String nume, int puncteViata, String magie) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.magie = magie;
		this.dataSalvare = new Date();
	}
	
	
	
}
