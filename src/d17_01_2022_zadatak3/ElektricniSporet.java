package d17_01_2022_zadatak3;

public class ElektricniSporet {

	/*
	 * marku storeta (npr: Beko, Bosh) garanciju kao broj godina maksimalan broj
	 * ukljucenih ringli u istom trenutku (1, 2, 3 ili 4) 4 ringle gore levo gore
	 * desno dole levo dole desno konstruktor koji postavlja sve atribute gettere za
	 * sve atribut ne postoje setteri metodu pojacaj kojoj se prosledjuje pozicija
	 * ringle pozicija 1 je ringla gore levo pozicija 2 je ringla gore desno
	 * pozicija 3 je ringla dole levo pozicija 4 je ringla dole desno Ako se prelazi
	 * maksimalan broj ukljucenih ringli u jednom trenutku, pogasite sve ringle sem
	 * one koja se pojacava u tom pozivu funkije Za gasenje ringli iskoristite
	 * metodu koja je definisana ispod 👇 metodu iskljuci ringlu kojoj se
	 * prosledjuje pozicija ringle pozicija 1 je ringla gore levo pozicija 2 je
	 * ringla gore desno pozicija 3 je ringla dole levo pozicija 4 je ringla dole
	 * desno metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet,
	 * tako sto sabira potrosnju za sve ringle (kao parametar se unosi vreme koliko
	 * vec ringle rade) metodu koja stampa podatke u formatu: marka - garancija u
	 * godinama Ringle: Gore levo: Ringla je ukljucena/iskljucena Tip ringle: tip
	 * ringle Jacina: jacina Grejac: jacina grejaca kW Gore desno: Ringla je
	 * ukljucena/iskljucena Tip ringle: tip ringle Jacina: jacina Grejac: jacina
	 * grejaca kW Dole levo: Ringla je ukljucena/iskljucena Tip ringle: tip ringle
	 * Jacina: jacina Grejac: jacina grejaca kW Dole desno: Ringla je
	 * ukljucena/iskljucena Tip ringle: tip ringle Jacina: jacina Grejac: jacina
	 * grejaca kW
	 * 
	 */

	String marka;
	int garancija;
	int maxUkljucenihRingli;
	Ringla ringlaGL;
	Ringla ringlaGD;
	Ringla ringlaDL;
	Ringla ringlaDD;

	ElektricniSporet(String marka, int garancija, int maxUkljucenihRingli, Ringla ringlaGL, Ringla ringlaGD,
			Ringla ringlaDL, Ringla ringlaDD) {
		this.marka = marka;
		this.garancija = garancija;
		this.maxUkljucenihRingli = maxUkljucenihRingli;
		this.ringlaGL = ringlaGL;
		this.ringlaGD = ringlaGD;
		this.ringlaDL = ringlaDL;
		this.ringlaDD = ringlaDD;
	}

	public String getMarka() {
		return marka;
	}

	public int getGarancija() {
		return garancija;
	}

	public int getMaxUkljucenihRingli() {
		return maxUkljucenihRingli;
	}

	public Ringla getRinglaGL() {
		return ringlaGL;
	}

	public Ringla getRinglaGD() {
		return ringlaGD;
	}

	public Ringla getRinglaDL() {
		return ringlaDL;
	}

	public Ringla getRinglaDD() {
		return ringlaDD;
	}

	public void pojacaj(int pozicija) {
		/*
		 * metodu pojacaj kojoj se prosledjuje pozicija ringle pozicija 1 je ringla gore
		 * levo pozicija 2 je ringla gore desno pozicija 3 je ringla dole levo pozicija
		 * 4 je ringla dole desno Ako se prelazi maksimalan broj ukljucenih ringli u
		 * jednom trenutku, pogasite sve ringle sem one koja se pojacava u tom pozivu
		 * funkije
		 * 
		 */

		switch (pozicija) {
		case 1:
			if (this.ringlaGL.daLiRadiRingla()) {
				this.ringlaGL.pojacajRinglu();
			} else if (brojUkljucenihRingli() + 1 > this.maxUkljucenihRingli) {
				ugasi(2);
				ugasi(3);
				ugasi(4);
				this.ringlaGL.pojacajRinglu();
			} else {
				this.ringlaGL.pojacajRinglu();
			}

			break;

		case 2:
			if (this.ringlaGD.daLiRadiRingla()) {
				this.ringlaGD.pojacajRinglu();
			} else if (brojUkljucenihRingli() + 1 > this.maxUkljucenihRingli) {
				ugasi(1);
				ugasi(3);
				ugasi(4);
				this.ringlaGD.pojacajRinglu();
			} else {
				this.ringlaGD.pojacajRinglu();
			}
			break;

		case 3:
			if (this.ringlaDL.daLiRadiRingla()) {
				this.ringlaDL.pojacajRinglu();
			} else if (brojUkljucenihRingli() + 1 > this.maxUkljucenihRingli) {
				ugasi(1);
				ugasi(2);
				ugasi(4);
				this.ringlaDL.pojacajRinglu();
			} else {
				this.ringlaDL.pojacajRinglu();
			}
			break;

		case 4:
			if (this.ringlaDD.daLiRadiRingla()) {
				this.ringlaDD.pojacajRinglu();
			} else if (brojUkljucenihRingli() + 1 > this.maxUkljucenihRingli) {
				ugasi(2);
				ugasi(3);
				ugasi(1);
				this.ringlaDD.pojacajRinglu();
			} else {
				this.ringlaDD.pojacajRinglu();
			}
			break;

		}

	}

	public void ugasi(int pozicija) {
		/*
		 * metodu iskljuci ringlu kojoj se prosledjuje pozicija ringle pozicija 1 je
		 * ringla gore levo pozicija 2 je ringla gore desno pozicija 3 je ringla dole
		 * levo pozicija 4 je ringla dole desno
		 * 
		 */
		// public void ugasiRinglu() {
		// this.jacinaRingle = 0;

		switch (pozicija) {
		case 1:
			this.ringlaGL.ugasiRinglu();
			break;

		case 2:
			this.ringlaGD.ugasiRinglu();
			break;

		case 3:
			this.ringlaDL.ugasiRinglu();
			break;

		case 4:
			this.ringlaDD.ugasiRinglu();
			break;

		}

	}

	public int brojUkljucenihRingli() {
		int brojac = 0;

		if (this.ringlaGL.daLiRadiRingla()) {
			brojac++;
		}
		if (this.ringlaGD.daLiRadiRingla()) {
			brojac++;
		}
		if (this.ringlaDL.daLiRadiRingla()) {
			brojac++;
		}
		if (this.ringlaDD.daLiRadiRingla()) {
			brojac++;
		}

		return brojac;
	}

	public double potrosnja(double vreme) {
		/*
		 * metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet, tako
		 * sto sabira potrosnju za sve ringle (kao parametar se unosi vreme koliko vec
		 * ringle rade)
		 */
		double potrosnja = 0;
		potrosnja = this.ringlaGL.potrosnjaElektricneEnergije(vreme) + this.ringlaGD.potrosnjaElektricneEnergije(vreme)
				+ this.ringlaDL.potrosnjaElektricneEnergije(vreme) + this.ringlaDD.potrosnjaElektricneEnergije(vreme);
		return potrosnja;
	}

	public void printSporet() {
		/*
		 * metodu koja stampa podatke u formatu: marka - garancija u godinama Ringle:
		 * Gore levo: Ringla je ukljucena/iskljucena Tip ringle: tip ringle Jacina:
		 * jacina Grejac: jacina grejaca kW Gore desno: Ringla je ukljucena/iskljucena
		 * Tip ringle: tip ringle Jacina: jacina Grejac: jacina grejaca kW Dole levo:
		 * Ringla je ukljucena/iskljucena Tip ringle: tip ringle Jacina: jacina Grejac:
		 * jacina grejaca kW Dole desno: Ringla je ukljucena/iskljucena Tip ringle: tip
		 * ringle Jacina: jacina Grejac: jacina grejaca kW
		 * 
		 */

		System.out.println(this.marka + " - " + this.garancija + "\n" + "Ringle: " + "\n" + "Ringla GL:");
		this.ringlaGL.printRingla();
		System.out.println("Ringla GD: ");
		this.ringlaGD.printRingla();
		System.out.println("Ringla DL: ");
		this.ringlaDL.printRingla();
		System.out.println("Ringla DD: ");
		this.ringlaDD.printRingla();
		System.out.println();
	}

}
