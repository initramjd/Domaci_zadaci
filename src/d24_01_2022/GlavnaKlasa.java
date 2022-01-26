package d24_01_2022;

import java.util.ArrayList;

public class GlavnaKlasa {

	public static void main(String[] args) {

		/*
		 * U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode
		 *  i ispisati ukupnu cenu sa popustom.

		 */
		ArrayList<Ambalaza>nizAmb = new ArrayList<Ambalaza>();
		Korpa korpa1 = new Korpa(nizAmb);
	
				
		StaklenaAmbalaza zajecarsko = new StaklenaAmbalaza("13-35853-556", "Zajecarsko Pivo", 500, 870, 67, 25, true, 67);
		StaklenaAmbalaza colaStaklo = new StaklenaAmbalaza("65464554-545", "Coca Cola staklo 0,25", 250, 380, 89, 0, false, 89);
		Tetrapak jogurt = new  Tetrapak("8854558", "Jogirt kravica 1l", 1090, 1230, 112, true, 115);

		SuperKartica sp = new SuperKartica("13-05-666", "Goran Maodus", 450);
		System.out.println(zajecarsko.cena());
		System.out.println(colaStaklo.cena());
		System.out.println(jogurt.cena());
	
		zajecarsko.stampaj();
		colaStaklo.stampaj();
		jogurt.stampaj();
		
	//	colaStaklo.dodajAmb();
		
	
		
	
	
	
	}
	
	
}
