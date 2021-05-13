package ro.ase.csie.cts.laborator11.command;

public class TaskAsincton implements InterfataTaskAsincron {

	private InterfataModulJoc modul = null;
	private String detalii;
	private int prioritate;

	public TaskAsincton(InterfataModulJoc modul, String detalii, int prioritate) {
		super();
		this.modul = modul;
		this.detalii = detalii;
		this.prioritate = prioritate;
	}

	@Override
	public void startTaskAsincron() {
		this.modul.executaTask(detalii);
	}

}
