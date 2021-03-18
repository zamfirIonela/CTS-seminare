package ro.ase.csie.cts.laborator4.faza3.servicii;

import ro.ase.csie.cts.laborator4.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.laborator4.exceptii.ExceptieVechimeClient;

public interface InterfataValidare {

	public void validarePret(float pretInitial) throws ExceptiePretInvalid;
	public void validareVechimeClient(int vechimeClientInAni) throws ExceptieVechimeClient;
}
