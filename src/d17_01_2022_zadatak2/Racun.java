package d17_01_2022_zadatak2;

public class Racun {

	/*
	 * Kreirati klasu Racun koja ima: broj racuna (npr: 170-289328923-23) ime i
	 * prezime osobe trenutno stanje na racunu (npr: 100, 1220) gettere i setter za
	 * sve atribute, sem settera za stanje na racunu metodu koja menja stanje na
	 * racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od
	 * nule) metodu koja stampa podatke o racunu u formatu: Ime i prezime - broj
	 * racuna stanje na racunu je (trenutno stanje) rsd.
	 * 
	 */

	private String brRacuna;
	private String imeIprezime;
	private double stanjeRacun;

	Racun() {

	}

	Racun(String brRacuna, String imeIprezime, double stanjeRacun) {
		
		this.brRacuna = brRacuna;
		this.imeIprezime = imeIprezime;
		this.stanjeRacun = stanjeRacun;

	}
	
	public String getBrRacuna() {
		return brRacuna;
	}

	public void setBrRacuna(String brRacuna) {
		this.brRacuna = brRacuna;
	}

	public String getImeIprezime() {
		return imeIprezime;
	}

	public void setImeIprezime(String imeIprezime) {
		this.imeIprezime = imeIprezime;
	}

	public double getStanjeRacun() {
		return stanjeRacun;
	}

	public void promenaRacun(double promena) {
		// metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu
		// ne moze da bude manje od nule)

		if (this.stanjeRacun + promena >= 0) {
			this.stanjeRacun = this.stanjeRacun + promena;
			// System.out.println("Trenutno stanje posle promene od " + promena + "din je: "
			// + this.stanjeRacun);
		} else {
			System.out.println("GRESKA, NE MOZE U MINUS");
		}

	}

	public void printRacun() {
		/*
		 * metodu koja stampa podatke o racunu u formatu: Ime i prezime - broj racuna
		 * stanje na racunu je (trenutno stanje) rsd.
		 */
		System.out.println(imeIprezime + " - " + brRacuna + "\n" + "Stanje na racunu je " + this.stanjeRacun + "rsd");
	}
	
	

}
