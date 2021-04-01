package ro.ase.csie.cts.tema2.refactoring;

public class Cont implements RataLunaraInterfata {
	double valoareImprumut;
	double valoareRata;	
	int	zileActiv;
	Account tipCont;
	
	public Cont(double valoareImprumut, double valoareRata, Account tipCont) throws Exception {
		setValoareImprumut(valoareImprumut);
		this.valoareRata = valoareRata;
		this.tipCont = tipCont;
	}
	
	public double getValoareImprumut() {
		return this.valoareImprumut;
	}
	
	public double getValoareRata() {
		return this.valoareRata;
	}
	
	//metoda obligatorie - lead-ul a cerut aceasta metoda in toate clasele
	public double getRataLunara(double valoareImprumut, double valoareRata) {
		return this.valoareImprumut*this.valoareRata;
	}
	
	public void setValoareImprumut(double valoareImprumut) throws Exception {
		if(valoareImprumut<0) {
			throw new Exception();
		}
		
		this.valoareImprumut = valoareImprumut;
	}

	public static double calculeaza(Cont[]	conturi) {
		double comisionTotal=0.0;
		Cont cont;
		for	(int i=0;i<conturi.length;i++)	{
			cont=conturi[i];
			if(cont.tipCont==Account.PREMIUM||cont.tipCont==Account.SUPER_PREMIUM) {
				comisionTotal+=.0125	*	(	//	1.25%	broker's	fee
						cont.valoareImprumut*Math.pow(cont.valoareRata,(cont.zileActiv/365)) - cont.valoareImprumut);	//	dobanda-principala
			} 
		}
		
		return comisionTotal;
	}
	
	public String toString() {
		return "Imprumut: " + this.valoareImprumut + " lei;" + "/nRata: " + this.valoareRata +
				"/nTip cont: " + this.tipCont + "/nZile activ: " + this.zileActiv;
	}
}
