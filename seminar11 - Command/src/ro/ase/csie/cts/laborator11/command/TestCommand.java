package ro.ase.csie.cts.laborator11.command;

public class TestCommand {

	public static void main(String[] args) {
		
		ManagerTaskuri manager = new ManagerTaskuri();
		manager.adaugaTask(new TaskAsincton(new ModulUpdate(), "versiunea 10.1", 5));
		manager.adaugaTask(new TaskAsincton(new ModulAutosave(), "Final nivel 5", 1));
		
		System.out.println("Jocul continua...");
		
		manager.executaUrmatorulTask();
		
		System.out.println("Jocul continua...");
		
		manager.executaUrmatorulTask();
		
		System.out.println("Jocul continua...");
	}

}
