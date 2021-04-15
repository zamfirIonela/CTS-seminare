package ro.ase.csie.cts.laborator8.decorator;

public abstract class Supererou {
	
	String nume;
	int puncteViata;
	
	public Supererou(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
	}
		
	public abstract void alearga();
	public abstract void esteLovit(int puncte);
	public abstract void seVindeca(int puncte);
	
	

}
