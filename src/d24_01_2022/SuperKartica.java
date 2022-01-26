package d24_01_2022;

public class SuperKartica {
	
	/* Kreirati klasu SuperKartica koja ima:
broj kartice
ime i prezime vlasnika
popust (200, 500, … )
konstuktore (default-ni i sa parametrima)
gettere i settere 
metodu stampaj koja stampa karticu u formatu:
(broj kartice), (ime i prezime)	 */
	
	String kartica;
	String vlasnik;
	double popust;
	
	public SuperKartica() {	
	}
	
	public SuperKartica(String kartica, String vlasnik, double popust) {
		super();
		this.kartica = kartica;
		this.vlasnik = vlasnik;
		this.popust = popust;
	}

	public String getKartica() {
		return kartica;
	}

	public void setKartica(String kartica) {
		this.kartica = kartica;
	}

	public String getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}

	public double getPopust() {
		return popust;
	}

	public void setPopust(double popust) {
		this.popust = popust;
	}
	
	
	public void stampajKarticu() {
		System.out.println(kartica + ", " + vlasnik);		 
	}
	

}
