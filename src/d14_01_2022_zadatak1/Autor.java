package d14_01_2022_zadatak1;

public class Autor {

	/*
	 * Kreirati klasu Autor koja ima -ime i prezime -konstuktore koje mislite da su
	 * vam potrebni -gettere i settere za atribute -metodu print koja stampa u
	 * formatu: (ime autora) (prezime autora)
	 */

	private String ime;
	private String prezime;

	Autor() {

	}

	Autor(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public void printAutor() {
		System.out.println(this.ime + " " + this.prezime);
	}

}
