package d20_01_2022;

public class Glavna {

	public static void main(String[] args) {
		// U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
		
		Igrac nv = new  Igrac("Novica Velickovic", "0510986123123", 1986,  21, "Centar", true);
		Igrac bb = new  Igrac("Bogdan Bogdanovic", "1808992123123", 1992,  13, "Bek", false);
		
		Trener zo  = new Trener("Zeljko Obradovic", "0903960123123", 1960, 31, "glavni trener");
		
		
		nv.stampajOsoba();
		bb.stampajOsoba();
		zo.stampajOsoba();
		


	}

}
