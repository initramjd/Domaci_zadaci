package d17_01_2022_zadatak3;

public class Ringla {

	/*
	 * tip ringle (obicna ili ekspres) jacinu za obicnu ringu jacina je u opsegu od
	 * 0 do 3 za ekspres ringlu jacina je u opsegu od 0 do 12 jacinu grejaca u kW
	 * (npr: 0.8, 1, 1.5, …) konstruktor sa parametrima, postavljaju ce tip ringle i
	 * jacina grejaca (jacina atribut je po defaultu 0) getter za jacinu setteri ne
	 * postoje!! privatnu metodu koja vraca maksimalan broj pojacavanja za obicnu je
	 * 3, za ekspres je 12 metodu pojacaj ringlu - metoda povecava jacinu za 1
	 * (pazite na opseg) metodu iskljuci ringlu - metoda postavlja jacinu na 0
	 * metodu koja vraca informaciju da li je ringla ukljucena ili iskljucena metodu
	 * koja vraca potrosnju elektricne energije prema formuli 100 / maksimalan broj
	 * pojacavanja * jacina * jacina grejaca * vremenski period koliko vec ringla
	 * radi metoda prima broj sati kao parametar tj. vremenski period koliko ringla
	 * vec radi metodu koja stampa podatke u formatu: Ringla je ukljucena ili
	 * iskljucena (iskoristite metodu koja vraca tu informaciju da biste odstampali
	 * poruku) Tip ringle: tip ringle Jacina: jacina Grejac: jacina grejaca kW
	 */

	private String tipRingle;
	private int jacinaRingle;
	private double jacinaGrejaca;

	Ringla(String tipRingle, double jacinaGrejaca) {
		this.tipRingle = tipRingle;
		this.jacinaGrejaca = jacinaGrejaca;
		this.jacinaRingle = 0;
	}

	public int getJacinaRingle() {
		return jacinaRingle;
	}

	public double getJacinaGrejaca() {
		return jacinaGrejaca;
	}

	private int maxJacinaRingle() {
		/*
		 * privatnu metodu koja vraca maksimalan broj pojacavanja za obicnu je 3, za
		 * ekspres je 12
		 */
		int maxJacinaRingle = 0;

		if (this.tipRingle.equals("obicna")) {
			maxJacinaRingle = 3;

		} else if (this.tipRingle.equals("ekspres")) {
			maxJacinaRingle = 12;
		}
		return maxJacinaRingle;
	}

	public void pojacajRinglu() {

		if (this.jacinaRingle < maxJacinaRingle()) {

			this.jacinaRingle++;
		} else {
			System.out.println("Ringla je vec postavljena na najjace");
		}
	}

	public void ugasiRinglu() {
		this.jacinaRingle = 0;
	}

	public boolean daLiRadiRingla() {
		return (this.jacinaRingle > 0);
	}

	public double potrosnjaElektricneEnergije(double vremeRada) {
		/*
		 * metodu koja vraca potrosnju elektricne energije prema formuli 100 /
		 * maksimalan broj pojacavanja * jacina * jacina grejaca * vremenski period
		 * koliko vec ringla radi metoda prima broj sati kao parametar tj. vremenski
		 * period koliko ringla vec radi
		 * 
		 */
		double potrosnja = 0;
		potrosnja = 100 / maxJacinaRingle() * (double) this.jacinaRingle * this.jacinaGrejaca * vremeRada;

		return potrosnja;
	}

	public void printRingla() {
		/*
		 * metodu koja stampa podatke u formatu: Ringla je ukljucena ili iskljucena
		 * (iskoristite metodu koja vraca tu informaciju da biste odstampali poruku) Tip
		 * ringle: tip ringle Jacina: jacina Grejac: jacina grejaca kW
		 * 
		 */

		if (daLiRadiRingla()) {
			System.out.println("Ringla je ukljucena");
		} else {
			System.out.println("Ringla je iskljucena");
		}
		System.out.println("Tip ringle: " + tipRingle + "\n" + "Jacina: " + jacinaRingle + "\n" + "Grejac: "
				+ jacinaGrejaca + "kw");

	}

}
