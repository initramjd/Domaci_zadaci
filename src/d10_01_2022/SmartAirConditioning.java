package d10_01_2022;

public class SmartAirConditioning {
	
	/*
	 * Kreirati klasu SmartAirConditioning koja ima:
atribut za marku klime (npr: Samsung, Galanz, Gree, …)
atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
atribut za izabranu temperaturu (minimum je 16, maksimum 35)
atribut za mod (hladi/greje)
metodu za stampu - stampa u formatu 
marka - mod - termperatura
metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
metodu koja racuna koliko klima novca potrosi za mesec dana
Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
Metoda vraca ukupnu cenu za taj mesec

U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.

	 */

	String marka;
	int temp;
	double potrosnjaDokHladi;
	double potrosnjaDokGreje;
	String mod;

	public void printAC() {
		System.out.println(this.marka + ", " + this.mod + ", " + this.temp);
	}
	
	public double potrosnjaPoSatu() {
		double potrosnjaPoSatu = 0;
		switch (this.mod) {
		case "GREJE":
			potrosnjaPoSatu = 30 * 15 * potrosnjaDokGreje / 1000;
			break;
		case "HLADI":
			potrosnjaPoSatu = 30 * 15 * potrosnjaDokHladi / 1000;
			break;		
		}
		return potrosnjaPoSatu;		
	}
	
	public double racun() {
		double ukupnaPotrosnja = 0;
		double racun = 0;
		
		ukupnaPotrosnja = this.potrosnjaPoSatu() * 24 * 30;
		
		if (ukupnaPotrosnja <= 350) {			
			racun = ukupnaPotrosnja * 6;			
		} else {			
			racun = (350 * 6) + ((ukupnaPotrosnja - 350) * 9);
		}		
		return racun;
	}

}
