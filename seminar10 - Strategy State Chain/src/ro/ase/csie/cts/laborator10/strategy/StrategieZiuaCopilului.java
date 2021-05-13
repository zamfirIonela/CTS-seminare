package ro.ase.csie.cts.laborator10.strategy;

public class StrategieZiuaCopilului implements InterfataStrategieMarketing {

	@Override
	public void aplicaStrategieBonus(Jucator jucator) {
		if(jucator.getClasaJucator() > 5) {
			jucator.clasaJucator *= 2;
			System.out.println("aplica strategie ziua copilului");
		}
	}
}
