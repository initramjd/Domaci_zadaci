package d21_01_2022;

import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		/* * U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog	 */

		ArrayList<Sektor>ss = new ArrayList<Sektor>();
		
		Sektor uprava = new Sektor("Uprava", 42500);
		Sektor komercijala = new Sektor("Komercijala", 49000);
		Sektor magacin = new Sektor("Magacin", 38900);
		Sektor pravna = new Sektor("Pravna sluzba", 55250);
		
			
		Magacioner gm = new Magacioner("Goran Maodus", ss);
		Menadzer mm = new Menadzer("Milan Milutinovic", ss);
		
		gm.zaposliSe(uprava);		
		gm.zaposliSe(magacin);
		
		mm.zaposliSe(komercijala);		
		mm.zaposliSe(pravna);		
		
		
		System.out.println("Prosecna plata radnika je: " + gm.plataSektor());
		System.out.println("Suma svih plata po sektorima: " + mm.plataSektor());
		
	}

}
