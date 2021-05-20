package ro.ase.csie.acs.laborator12.memento;

public class TestMemento {

	public static void main(String[] args) {
		
		Manageristoric istoric = new Manageristoric(); 
		
		SuperErou supermanErou = new SuperErou("superman", 100, "Zboara");
		
		istoric.adaugaSalvare(supermanErou.salvare());
		
		supermanErou.esteLovit(10);
		supermanErou.esteLovit(50);
		
		System.out.println("Puncte viata:" + supermanErou.puncteViata);
		
		supermanErou.incarcaSlavare(istoric.getUltimaSalvare());

		System.out.println("Puncte viata: "+supermanErou.puncteViata);
	}

}
