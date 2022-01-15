package d14_01_2022_zadatak2;

/*
 * sifru proizvoda
naziv proizvoda
cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
gettere i settere za sifru i naziv
setter za cenu po kilogramu
metodu getCenaKg koja vraca cenu za 1 kg proizvoda
metodu getCenaLb koja vraca cenu za 1lb prozvoda
 		konverzija: 1 kg = 2.2046 lb
metodu koja stampa proizvod u formatu:
(sifra) - (naziv)

 */

public class Proizvod {
	
	
	private String sifra;
	private String naziv;
	private double cena;
	
	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	Proizvod(String sifra, String naziv, double cena){
		this.sifra = sifra;
		this.naziv = naziv;
		this.cena = cena;		
	}
	
	public double getCenaKg() {
		return this.cena;
	}
	
	public double getCenaLb() {		
		return this.cena / 2.2046;
	}
	
	public void printProizvod() {
		System.out.println(this.sifra + " " + this.naziv);
	}

}
