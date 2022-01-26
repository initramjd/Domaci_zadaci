package d20_01_2022;

public class Osoba {

	/*
	 * Kreirati klasu Osoba koja ima:
ime i prezime
jmbg
godinu rodjenja
default-ni konstuktor
konstuktor sa parametrima
gettere i settere 
metodu stampaj koja stampa u formatu:
(ime i prezime), (jmbg), (godina rodjenja)

	 */
	
	protected String ime;
	protected String jmbg;
	protected int godRodjenja;
	
	 Osoba() {
		 
	 }
	 
 Osoba(String ime, String jmbg,	int godRodjenja) {		 
	 this.ime = ime;
	 this.jmbg = jmbg;
	 this.godRodjenja = godRodjenja;	 
	 }

public String getIme() {
	return ime;
}

public void setIme(String ime) {
	this.ime = ime;
}

public String getJmbg() {
	return jmbg;
}

public void setJmbg(String jmbg) {
	this.jmbg = jmbg;
}

public int getGodRodjenja() {
	return godRodjenja;
}

public void setGodRodjenja(int godRodjenja) {
	this.godRodjenja = godRodjenja;
}
 
 public void stampajOsoba() {
	 /*metodu stampaj koja stampa u formatu:
(ime i prezime), (jmbg), (godina rodjenja)  */	 
	 System.out.println(this.ime + ", " + this.jmbg + ", " + this.godRodjenja);	 
 }
	
}
