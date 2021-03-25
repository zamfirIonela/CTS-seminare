package ro.ase.csie.cts.laborator5.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		Caracter3D car1 = new Caracter3D("model1.3d");
		//Caracter3D car2 = new Caracter3D("model2.3d");
		//Caracter3D car3 = new Caracter3D("model3.3d");
		
		Caracter3D car2 = (Caracter3D) car1.clone();
		Caracter3D car3 = (Caracter3D) car1.clone();
		
		System.out.println("Sfarsit");

	}

}
