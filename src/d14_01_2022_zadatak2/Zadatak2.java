package d14_01_2022_zadatak2;

/*
 * (Za vezbanje) Kreirati klasu Proizvod koja ima:
sifru proizvoda
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

	Kreirati klasu Vaga koja ima:
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

public class Zadatak2 {

	public static void main(String[] args) {

		Proizvod banane = new Proizvod("10215451", "Banane", 114.99); // novi proizvoda
		Proizvod jagode = new Proizvod("20556540", "Jagode", 585.99); // novi proizvoda
		Proizvod jabuke = new Proizvod("20554652", "Jabuke", 88.49); // novi proizvoda
		
		Vaga vaga1 = new Vaga(); // nova vaga
		Vaga vaga2 = new Vaga(); // nova vaga
		Vaga vaga3 = new Vaga(); // nova vaga

		vaga1.setProizvod(jagode); // stavljanje proizvoda na vagu radi merenja
		vaga2.setProizvod(banane); // stavljanje proizvoda na vagu radi merenja
		vaga3.setProizvod(jabuke); // stavljanje proizvoda na vagu radi merenja

		vaga1.setMernaJedinica("kg"); // biranje da vaga meri u kg
		vaga2.setMernaJedinica("lb"); // biranje da vaga meri u lb
		vaga3.setMernaJedinica("kg"); // biranje da vaga meri u kg
	

		vaga1.printVaga(2.35); // stampanje nalepnice sa cenom
		vaga2.printVaga(3.14); // stampanje nalepnice sa cenom
		vaga3.printVaga(1.29); // stampanje nalepnice sa cenom

	}

}
