package d21_01_2022;

import java.util.ArrayList;

public class Menadzer extends Radnik {
	

	public Menadzer(String radnik, ArrayList<Sektor> sektori) {
		super(radnik, sektori);		
	}
	
	
	@Override
	double plataSektor() {
		double ukupnaPlata = 0;
		for (int i = 0; i < sektori.size(); i++) {
			ukupnaPlata = ukupnaPlata + this.sektori.get(i).getPlata();
		}		
		return ukupnaPlata;
	}
	
	/* Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima. */
	
	

}
