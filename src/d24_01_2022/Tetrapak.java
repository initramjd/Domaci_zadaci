package d24_01_2022;

public class Tetrapak extends Ambalaza {
	
	/*
	 * Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
atribut koji kaze da li se moze reciklirati
osnovna cena
gettere i setter za atribute
konstuktori koji su vam potrebni
racuna cenu tako da ispunjava uslova:
ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
ako nije u cenu ulazi samo osnovna cena
metoda stampaj stampa sve podatke iz klase tetrapak.

	 */
	
	boolean reciklaza;
	double osnovnaCena;
	
	
	

	
	
	public Tetrapak() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tetrapak(String barkod, String artikal, double neto, double bruto, double cena, 	boolean reciklaza, double osnovnaCena) {
		super(barkod, artikal, neto, bruto, cena);
		this.reciklaza = reciklaza;
		this.osnovnaCena = osnovnaCena;
		// TODO Auto-generated constructor stub
	}
	public boolean isReciklaza() {
		return reciklaza;
	}
	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	@Override
	public double cena() {
		/* ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
ako nije u cenu ulazi samo osnovna cena */
		double cena = this.osnovnaCena;
		if (reciklaza) {
			cena = this.osnovnaCena * 1.5;
		}
		return cena;
	}
	@Override
	public void stampaj() {
		// Metoda stampaj stampa sve podatke iz klase tetrapak.
System.out.println(reciklaza + ", " + osnovnaCena + ", " + cena());	
	}
	
	
	

}
