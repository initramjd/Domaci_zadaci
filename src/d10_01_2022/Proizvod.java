package d10_01_2022;

public class Proizvod {

	String naziv;
	double cena;
	double tezina;

	public void stampa() {
		System.out.println(this.naziv + ", " + this.cena + ", " + this.tezina);
	}

	public void povecajCenu(double povecanje) {
		this.cena = this.cena + povecanje;
	}

	public double vratiCenuSaPopustom(int popust) {
		double vratiCenuSaPopustom = this.cena * (100 - popust) / 100;
		return vratiCenuSaPopustom;
	}

	public int postarina() {
		int postarina;
		if (this.tezina <= 100) {
			postarina = 200;
		} else if (this.tezina < 500) {
			postarina = 400;
		} else {
			postarina = 1000;
		}
		return postarina;
	}
}
