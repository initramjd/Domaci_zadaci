package d24_01_2022;

import java.util.ArrayList;

public class Korpa extends Ambalaza{
	
	/* Kreirati klasu Korpa koja ima:
niz ambalaza
metodu dodaj ambalazu
metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.	 */

	public ArrayList<Ambalaza>nizAmb = new ArrayList<Ambalaza>();
	
	
	
	
	public Korpa(ArrayList<Ambalaza> nizAmb) {
		super();
		this.nizAmb = nizAmb;
	}

	public Korpa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Ambalaza> getNizAmb() {
		return nizAmb;
	}

	public void setNizAmb(ArrayList<Ambalaza> nizAmb) {
		this.nizAmb = nizAmb;
	}

	public void dodajAmb(Ambalaza amb) {
		this.nizAmb.add(amb);
	}

	public void izbaciAmb(String barcode) {
		
		for (int i = 0; i < nizAmb.size(); i++) {
			if (nizAmb.get(i).getBarkod().equals(barcode)) {
				this.nizAmb.remove(i);
			}
		}	
	}
	
	public double ceneSaPopustom(double popust) {
		//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
		double ceneSaPopustom = 0;
		
		for (int i = 0; i < nizAmb.size(); i++) {
			ceneSaPopustom = ceneSaPopustom + (this.nizAmb.get(i).getCena() / 100 * (100 - popust));
			}				
		return ceneSaPopustom;
	}
	
	//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust
	public double ukupnaCena(SuperKartica kartica) {
		double ukupnaCena = 0;
		
		for (int i = 0; i < nizAmb.size(); i++) {
			ukupnaCena = ukupnaCena - kartica.getPopust();
			}				
		return ukupnaCena;
	}

	@Override
	public double cena() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void stampaj() {
		// TODO Auto-generated method stub
		
	}
	
}
