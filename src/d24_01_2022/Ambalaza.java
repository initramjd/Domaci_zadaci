package d24_01_2022;

public abstract class Ambalaza {
	
	/*
	 * Kreirati abstraktnu klasu Ambalaza koja ima:
barkod (primer: 328232-2823)
naziv artikla
neto tezinu
bruto tezinu
konstuktore (default-ni i sa parametrima)
gettere i settere
metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
abstraktnu metodu koja vraca cenu artikla
abstraktnu metodu stampaj

	 */
	
	String barkod;
	String artikal;
	double neto;
	double bruto;
	double cena;
	
	Ambalaza() {		
	}
	


	public Ambalaza(String barkod, String artikal, double neto, double bruto, double cena) {
		super();
		this.barkod = barkod;
		this.artikal = artikal;
		this.neto = neto;
		this.bruto = bruto;
		this.cena = cena;
	}



	public double getCena() {
		return cena;
	}



	public void setCena(double cena) {
		this.cena = cena;
	}



	public String getBarkod() {
		return barkod;
	}

	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}

	public String getArtikal() {
		return artikal;
	}

	public void setArtikal(String artikal) {
		this.artikal = artikal;
	}

	public double getNeto() {
		return neto;
	}

	public void setNeto(double neto) {
		this.neto = neto;
	}

	public double getBruto() {
		return bruto;
	}

	public void setBruto(double bruto) {
		this.bruto = bruto;
	}
	
	public double tezinePakovanja () {
		double tezinePakovanja;
		return tezinePakovanja = bruto - neto; 
	}
	
	//abstraktnu metodu koja vraca cenu artikla
//	abstraktnu metodu stampaj
	
	public abstract double cena();
	abstract void stampaj();

	
	
	
	

}
