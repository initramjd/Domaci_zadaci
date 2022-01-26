package d20_01_2022;

public class Trener extends Osoba{
	
	/* Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
godine iskustva
tip trenera (kondicioni, za igru, pomocni, personalni)
metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.	 */
	
	int iskustvo;
	String tipTrenera;
	
	
	
	public Trener() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Trener(String ime, String jmbg, int godRodjenja, int iskustvo, String tipTrenera) {
		super(ime, jmbg, godRodjenja);
		this.iskustvo = iskustvo;
		this.tipTrenera = tipTrenera;
	}



	@Override public void stampajOsoba() {
		
		 System.out.println(this.ime + ", " + this.jmbg + ", " + this.godRodjenja + ", " + this.iskustvo + ", " + tipTrenera);
		 	}
	
	
	

}
