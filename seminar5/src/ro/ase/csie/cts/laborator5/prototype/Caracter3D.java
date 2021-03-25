package ro.ase.csie.cts.laborator5.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Caracter3D implements Cloneable {
	
	String fisierModel3D;
	String culoare;
	int inaltime;
	
	ArrayList<Integer> puncteGrafic = null;

	public Caracter3D(String fisierModel3D) {
		System.out.println("Se incarca model 3D din "+ fisierModel3D);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.fisierModel3D = fisierModel3D;
		
		Random random = new Random();
		puncteGrafic = new ArrayList<>();
		for(int i=0; i<10; i++) {
			puncteGrafic.add(random.nextInt(1000));
		}
	}
	
	private Caracter3D() {
		
	}

	@Override
	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("Puncte caracter 3D: ");
		for(int punct : this.puncteGrafic) {
			sBuilder.append(punct + " | ");
		}
		return sBuilder.toString();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//nu prin acest constructor
		//Caracter3D copieCaracter3d = new Caracter3D(this.fisierModel3D);
		
		Caracter3D copieCaracter3d = new Caracter3D();
		copieCaracter3d.culoare = this.culoare;
		copieCaracter3d.fisierModel3D = this.fisierModel3D;
		copieCaracter3d.inaltime = this.inaltime;
		copieCaracter3d.puncteGrafic = (ArrayList<Integer>) this.puncteGrafic.clone();
		
		return copieCaracter3d;
	}
	
	
}
