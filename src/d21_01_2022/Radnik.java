package d21_01_2022;

import java.util.ArrayList;

public abstract class Radnik {
	/*Kreirati abstraktnu klasu Radnik koja ima:
 ime i prezime
 niz sektora u kojima radi
 abstraktnu metodu koja vraca platu radnika
 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom */
	
	String radnik;	
	ArrayList<Sektor>sektori = new ArrayList<Sektor>();
	
	
	
	
	
	
	public Radnik(String radnik) {
		super();
		this.radnik = radnik;
	}

	public Radnik(String radnik, ArrayList<Sektor> sektori) {
		super();
		this.radnik = radnik;
		this.sektori = sektori;
	}

	public String getRadnik() {
		return radnik;
	}

	public void setRadnik(String radnik) {
		this.radnik = radnik;
	}

	public ArrayList<Sektor> getSektori() {
		return sektori;
	}

	public void setSektori(ArrayList<Sektor> sektori) {
		this.sektori = sektori;
	}

	abstract double plataSektor();
	
	public void zaposliSe(Sektor sektor) {		
		this.sektori.add(sektor);		
	}
	

}
