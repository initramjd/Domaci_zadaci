package d24_01_2022;

public class StaklenaAmbalaza extends Ambalaza {
	
	/*
	 * Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
kaucija za flasu
atribut koji kaze da li se za flasu placa kaucija
osnovna cena
gettere i setter za atribute
konstuktori koji su vam potrebni
racuna cenu
ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
ako se ne placa, (osnovna cena) * 1.2
metoda stampaj stampa sve podatke iz klase staklena flasa.

	 */
	
	double kaucija;
	boolean placaKaucija;
	double osnovnaCena;
	
	
	
	public StaklenaAmbalaza() {
		super();		
	}
	
	
	
	public StaklenaAmbalaza(String barkod, String artikal, double neto, double bruto, double cena, double kaucija,	boolean placaKaucija, double osnovnaCena) {
		super(barkod, artikal, neto, bruto, cena);
		this.kaucija = kaucija;
		this.placaKaucija = placaKaucija;
		this.osnovnaCena = osnovnaCena;
	}



	public double getKaucija() {
		return kaucija;
	}
	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}
	public boolean isPlacaKaucija() {
		return placaKaucija;
	}
	public void setPlacaKaucija(boolean placaKaucija) {
		this.placaKaucija = placaKaucija;
	}
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	@Override
	
	public double cena() {
		double cena;
		cena = this.osnovnaCena * 1.2;
		if (placaKaucija) {
			cena = cena + kaucija;
		}
			
		return cena;
	}
	@Override
	public void stampaj() {
		System.out.println(this.placaKaucija + ", " + this.osnovnaCena + ", " + this.cena());		
	}
	

}
