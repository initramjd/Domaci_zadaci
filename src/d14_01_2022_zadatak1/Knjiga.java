package d14_01_2022_zadatak1;

public class Knjiga {

	/*
	 * Kreirati klasu Knjiga koji ima: -ISBN -naziv -godina izdanja -autor
	 * -konstuktore koje mislite da su vam potrebni -gettere i settere za atribute
	 * -metodu print koja stampa u formatu (izbegavati dupliranje koda): (ISBN)
	 * (naziv) - (godina izdanja) autor: (ime autora) (prezime autora)
	 * 
	 */

	private String isbn;
	private String naziv;
	int godinaIzdanja;
	private Autor autor;

	Knjiga() {

	}

	Knjiga(String isbn, String naziv, int godina) {
		this.isbn = isbn;
		this.naziv = naziv;
		this.godinaIzdanja = godina;

	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void printKnjiga() {
		/*
		 * -metodu print koja stampa u formatu (izbegavati dupliranje koda): (ISBN)
		 * (naziv) - (godina izdanja) autor: (ime autora) (prezime autora)
		 */

		System.out.println(this.isbn + "\n" + this.naziv + " - " + this.godinaIzdanja + "\n" + "Autor: "
				+ this.autor.getIme() + " " + this.autor.getPrezime() + "\n");

	}

}
