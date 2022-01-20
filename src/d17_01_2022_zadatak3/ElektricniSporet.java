package d17_01_2022_zadatak3;

import java.util.ArrayList;

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

	ArrayList<Ringla> ringle = new ArrayList<Ringla>();

	ElektricniSporet(String marka, int garancija, int maxUkljucenihRingli, Ringla ringlaGL, Ringla ringlaGD,
			Ringla ringlaDL, Ringla ringlaDD) {
		this.marka = marka;
		this.garancija = garancija;
		this.maxUkljucenihRingli = maxUkljucenihRingli;
		ringle.add(ringlaGL);
		ringle.add(ringlaGD);
		ringle.add(ringlaDL);
		ringle.add(ringlaDD);
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
		return ringle.get(0);
	}

	public Ringla getRinglaGD() {
		return ringle.get(1);
	}

	public Ringla getRinglaDL() {
		return ringle.get(2);
	}

	public Ringla getRinglaDD() {
		return ringle.get(3);
	}

	public void pojacaj(int pozicija, ArrayList<Ringla> ringle) {
		/*
		 * metodu pojacaj kojoj se prosledjuje pozicija ringle pozicija 1 je ringla gore
		 * levo pozicija 2 je ringla gore desno pozicija 3 je ringla dole levo pozicija
		 * 4 je ringla dole desno Ako se prelazi maksimalan broj ukljucenih ringli u
		 * jednom trenutku, pogasite sve ringle sem one koja se pojacava u tom pozivu
		 * funkije
		 * 
		 */
		Ringla ringla = ringle.get(pozicija);

		if (ringla.daLiRadiRingla()) {
			ringla.pojacajRinglu();
		} else if (brojUkljucenihRingli(ringle) + 1 > this.maxUkljucenihRingli) {
			ugasiRingle(ringle, pozicija);
			ringla.pojacajRinglu();
		} else {
			ringla.pojacajRinglu();
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
		ringle.get(pozicija - 1).ugasiRinglu();

	}

	public int brojUkljucenihRingli(ArrayList<Ringla> ringle) {
		int brojac = 0;

		for (int i = 0; i < ringle.size(); i++) {
			Ringla ringla = ringle.get(i);

			if (ringla.daLiRadiRingla()) {
				brojac++;
			}			
		}
		return brojac;
	}

	public double potrosnja(ArrayList<Ringla> ringle, double vreme) {
		/*
		 * metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet, tako
		 * sto sabira potrosnju za sve ringle (kao parametar se unosi vreme koliko vec
		 * ringle rade)
		 */		
		double potrosnja = 0;
		for (int i = 0; i < ringle.size(); i++) {
			Ringla ringla = this.ringle.get(i);
			potrosnja = potrosnja + ringla.potrosnjaElektricneEnergije(vreme);	
		}		
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
		this.ringle.get(0).printRingla();
		System.out.println("Ringla GD: ");
		this.ringle.get(1).printRingla();
		System.out.println("Ringla DL: ");
		this.ringle.get(2).printRingla();
		System.out.println("Ringla DD: ");
		this.ringle.get(3).printRingla();
		System.out.println();
	}

	public void ugasiRingle(ArrayList<Ringla> ringle, int ringla) {
		for (int i = 0; i < ringle.size(); i++) {
			if (i != ringla) {
				this.ugasi(i);
			}
		}
	}

}
