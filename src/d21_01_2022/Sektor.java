package d21_01_2022;

public class Sektor {
	
	/* Kreirati klasu Sektor koja ima:
 naziv sektora
 platu koja je za taj sektor	 */
	
	String sektor;
	double plata;
	public String getSektor() {
		return sektor;
	}
	public void setSektor(String sektor) {
		this.sektor = sektor;
	}
	public double getPlata() {
		return plata;
	}
	public void setPlata(double plata) {
		this.plata = plata;
	}
	public Sektor(String sektor, double plata) {
		this.sektor = sektor;
		this.plata = plata;
	}
	
	

}
