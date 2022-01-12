package d10_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Proizvod kafaGrand = new Proizvod();
		kafaGrand.naziv = "Grand Kafa";
		kafaGrand.cena = 109.99;
		kafaGrand.tezina = 100;

		Proizvod milkaJagoda = new Proizvod();
		milkaJagoda.naziv = "Milka Jagoda";
		milkaJagoda.cena = 275.49;
		milkaJagoda.tezina = 250;

		Proizvod secer = new Proizvod();
		secer.naziv = "Secer kristal";
		secer.cena = 89.99;
		secer.tezina = 1000;

		kafaGrand.stampa();
		milkaJagoda.stampa();
		secer.stampa();

		
		kafaGrand.povecajCenu(9.99);
		milkaJagoda.povecajCenu(5.49);
		secer.povecajCenu(19.99);
		
		System.out.println(kafaGrand.naziv + " sa popustom je " + kafaGrand.vratiCenuSaPopustom(25));
		System.out.println(milkaJagoda.naziv + " sa popustom je " + milkaJagoda.vratiCenuSaPopustom(15));
		System.out.println(secer.naziv + " sa popustom je " + secer.vratiCenuSaPopustom(10));
		
		System.out.println("Postarina je: " + kafaGrand.postarina() + " din");
		System.out.println("Postarina je: " + milkaJagoda.postarina() + " din");
		System.out.println("Postarina je: " + secer.postarina() + " din");
		
		
	}

}
