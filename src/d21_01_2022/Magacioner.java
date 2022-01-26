package d21_01_2022;

import java.util.ArrayList;

public class Magacioner extends Radnik{
	
	/*
	 * Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
 suma plata svih sektor / broj sektora * 0.5
 override uje metodu za platu, tako da se plata racuna po formuli:
(prosecna plata za sve sektore u kojima radi) * (broj sektora).

	 */

	public Magacioner(String radnik, ArrayList<Sektor> sektori) {
		super(radnik, sektori);
		// TODO Auto-generated constructor stub
	}

	@Override
	double plataSektor() {
		// (prosecna plata za sve sektore u kojima radi) * (broj sektora).
		double plataSektor = 0;
			
		plataSektor = this.prosecnaPlata() * this.sektori.size();
		
		return plataSektor;
	}
	
	private double prosecnaPlata() {
		double prosecnaPlata = 0;
		int i;
				
		for (i = 0; i < sektori.size(); i++) {
			prosecnaPlata = prosecnaPlata + this.sektori.get(i).getPlata();	
			}		
		
		prosecnaPlata = (prosecnaPlata / i) * 0.5;		
		
		return prosecnaPlata;
	}
	 

}
