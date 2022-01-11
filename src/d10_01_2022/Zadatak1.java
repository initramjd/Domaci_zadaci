package d10_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Proizvod kafaGrand = new Proizvod();
		kafaGrand.naziv = "Gran Kafa";
		kafaGrand.cena = 109.99;
		kafaGrand.tezina = 100;

		Proizvod milkaJagoda = new Proizvod();
		milkaJagoda.naziv = "Milka Jagoda";
		milkaJagoda.cena = 125.49;
		milkaJagoda.tezina = 90;

		Proizvod secer = new Proizvod();
		secer.naziv = "Secer kristal";
		secer.cena = 89.99;
		secer.tezina = 1000;

		kafaGrand.stampa();
		milkaJagoda.stampa();
		secer.stampa();

	}

}
