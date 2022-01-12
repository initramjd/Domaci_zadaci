package d10_01_2022;

public class SmartAirConditioning {
	
	String marka;
	int temp;
	double potrosnjaDokHladi;
	double potrosnjaDokGreje;
	String mod;

	public void printAC() {
		System.out.println(this.marka + ", " + this.mod + ", " + this.temp);
	}
	
	public double mesecnaPotrosnja() {
		double mesecnaPotrosnja = 0;
		switch (this.mod) {
		case "GREJE":
			mesecnaPotrosnja = 30 * 15 * potrosnjaDokGreje;
			break;
		case "HLADI":
			mesecnaPotrosnja = 30 * 15 * potrosnjaDokHladi;
			break;		
		}
		return mesecnaPotrosnja;		
	}
	
	public double racun() {
		double ukupnaPotrosnja = 0;
		double racun = 0;
		
		ukupnaPotrosnja = this.mesecnaPotrosnja();
		
		if (ukupnaPotrosnja <= 350) {			
			racun = ukupnaPotrosnja * 6;			
		} else {			
			racun = (350 * 6) + ((ukupnaPotrosnja - 350) * 9);
		}		
		return racun;
	}

}
