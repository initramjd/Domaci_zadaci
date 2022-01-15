package d14_01_2022_zadatak2;

/*
 * Kreirati klasu Vaga koja ima:
merna jedinica (kg ili lb)
proizvod (proizvod koji se meri)
default-ni konstuktor
getteri i setteri za sve atribute
metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
metodu stampaj koja stampa racun u formatu:
               (sifra) - (naziv)
   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
   Ukupno: (ukupna cena) 	      

 */

public class Vaga {

	private String mernaJedinica;
	private Proizvod proizvod;

	Vaga() {

	}

	public String getMernaJedinica() {
		return mernaJedinica;
	}

	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}

	public Proizvod getProizvod() {
		return proizvod;
	}

	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}

	public double sracunajCenu(double tezina) {
		// metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je
		// parametar funkcije).
		// Na racunanje cene utice i merna jedinica na koju je vaga podesena.
		double cena = 0;

		if (mernaJedinica.equals("kg")) {
			cena = this.proizvod.getCenaKg() * tezina;
		} else if (mernaJedinica.equals("lb")) {
			cena = this.proizvod.getCenaLb() * tezina;
		}
		return cena;

	}

	public void printVaga(double tezina) {
		/*
		 * metodu stampaj koja stampa racun u formatu: (sifra) - (naziv) (cena za
		 * odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) Ukupno: (ukupna
		 * cena)
		 * 
		 */
		double cenaPoMeri = 0;
		if (mernaJedinica.equals("kg")) {
			cenaPoMeri = this.proizvod.getCenaKg();
		} else if (mernaJedinica.equals("lb")) {
			cenaPoMeri = this.proizvod.getCenaLb();
		}

		System.out.println(this.proizvod.getSifra() + " - " + this.proizvod.getNaziv() + "\n" + cenaPoMeri + " " + " x "
				+ tezina + this.mernaJedinica + "\n" + "Ukupno: " + sracunajCenu(tezina) + "\n");
	}

}
