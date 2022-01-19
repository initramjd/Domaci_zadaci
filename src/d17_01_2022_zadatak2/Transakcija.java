package d17_01_2022_zadatak2;

public class Transakcija {

	/*
	 * Kreirati klasu Transakcija koja ima: id transakcije racun sa kog se prenose
	 * sredstva racun na koji se prenose sredstva gettere i settere konstruktore
	 * privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja
	 * se racuna: ako je prenos sredstava manji od 4500, provizija je fiksna 45 ako
	 * je prenos sredstava veci od 4500, provizija je 1% S obzirom da se provizija
	 * racuna na osnovu visine transakcije, znaci da metoda prima parametar koji
	 * predstavlja visinu transakcije Ukoliko ne znate da resite ovu metodu, u
	 * metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
	 * metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na
	 * drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje.
	 * Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) +
	 * (provizija), a na drugi racun dodaje samo (trazena suma). (Za vezbanje)
	 * Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
	 * metodu koja stampa podatke o transakciji u formatu: id transkacije Racun sa:
	 * Ime i prezime - broj racuna Racun na: Ime i prezime - broj racuna
	 * 
	 */

	private static int id = 0;
	private double transakcija;	
	private Racun saKogSePrenosi = new Racun();
	private Racun naKojiSePrenosi = new Racun();

	Transakcija() {

	}

	Transakcija(Racun saKogSePrenosi, Racun naKojiSePrenosi, double transakcija) {
		this.saKogSePrenosi = saKogSePrenosi;
		this.naKojiSePrenosi = naKojiSePrenosi;
		this.transakcija = transakcija;

	}

	public int getId() {
		return id;
	}

	public Racun getSaKogSePrenosi() {
		return saKogSePrenosi;
	}

	public void setSaKogSePrenosi(Racun saKogSePrenosi) {
		this.saKogSePrenosi = saKogSePrenosi;
	}

	public Racun getNaKojiSePrenosi() {
		return naKojiSePrenosi;
	}
	
	public double getTransakcija() {
		return transakcija;
	}

	public void setTransakcija(double transakcija) {
		this.transakcija = transakcija;
	}

	public void setNaKojiSePrenosi(Racun naKojiSePrenosi) {
		this.naKojiSePrenosi = naKojiSePrenosi;
	}

	public double provizija() {
		/*
		 * privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja
		 * se racuna: ako je prenos sredstava manji od 4500, provizija je fiksna 45 ako
		 * je prenos sredstava veci od 4500, provizija je 1% S obzirom da se provizija
		 * racuna na osnovu visine transakcije, znaci da metoda prima parametar koji
		 * predstavlja visinu transakcije
		 */
		double provizija = 0;

		if (this.transakcija < 4500) {
			provizija = 45;
		} else {
			provizija = this.transakcija * 0.01;
		}

		return provizija;

	}

	public void izvrsiTransakciju() {
		/*
		 * metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na
		 * drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje.
		 * Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) +
		 * (provizija), a na drugi racun dodaje samo (trazena suma).
		 * 
		 */
		double iznosZaSkidanje = this.transakcija + provizija();

		if (this.saKogSePrenosi.getStanjeRacun() >= iznosZaSkidanje) {
			this.saKogSePrenosi.promenaRacun(-iznosZaSkidanje);
			this.naKojiSePrenosi.promenaRacun(this.transakcija);
			id++;
		} else {
			System.out.println("Greska, nema dovoljno sredstva na racunu");
		}

	}

	public void printTransakcija() {
		/*
		 * metodu koja stampa podatke o transakciji u formatu: id transkacije Racun sa:
		 * Ime i prezime - broj racuna Racun na: Ime i prezime - broj racuna
		 */
		System.out.print("ID Transakcije: " + id + "\n");
		System.out.print("Transakcija u iznosu od: " + this.transakcija + "\n" + "Racun sa: ");
		saKogSePrenosi.printRacun();
		System.out.print("Racun na: ");
		naKojiSePrenosi.printRacun();
		System.out.println();
	}
}
