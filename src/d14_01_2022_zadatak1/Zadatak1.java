package d14_01_2022_zadatak1;

public class Zadatak1 {
	
	/*
	 * Kreirati klasu Autor koja ima
-ime i prezime
-konstuktore koje mislite da su vam potrebni
-gettere i settere za atribute
-metodu print koja stampa u formatu:
(ime autora) (prezime autora)

Kreirati klasu Knjiga koji ima:
-ISBN
-naziv
-godina izdanja
-autor
-konstuktore koje mislite da su vam potrebni
-gettere i settere za atribute
-metodu print koja stampa u formatu (izbegavati dupliranje koda):
(ISBN)
(naziv) - (godina izdanja)
autor: (ime autora) (prezime autora) 

	U glavnom programu napraviti vise autora sa vise knjiga.

	 */

	public static void main(String[] args) {

		// dodavanje knjiga
		Knjiga hobit = new Knjiga("9780044403371", "Hobit", 1937);
		Knjiga gospodarPrstenova1 = new Knjiga("9780007136599", "The Fellowship of the Ring", 1954);
		Knjiga gospodarPrstenova2 = new Knjiga("9780007203598", "The Two Towers", 1954);
		Knjiga gospodarPrstenova3 = new Knjiga("9780007141326", "The Return of the King", 1955);
		Knjiga kovid1 = new Knjiga("9788652122752", "Sve crvenkape su iste", 2006);
		Knjiga kovid2 = new Knjiga("9788679632197", "Kandze", 2004);
		Knjiga kovid3 = new Knjiga("9789179899455", "E bas Vam hvala", 2017);
		Knjiga djulici = new Knjiga("9788650302040", "Djulici", 1864);

		// dodavanje autora
		Autor tolkin = new Autor("J.R.R.", "Tolkien");
		Autor kovid = new Autor("Marko", "Vidojkovic");
		Autor zmaj = new Autor("Jovan", "Jovanovic 3maj");
		
		
		// dodeljivanje knjiga autoru
		hobit.setAutor(tolkin);
		gospodarPrstenova1.setAutor(tolkin);
		gospodarPrstenova2.setAutor(tolkin);
		gospodarPrstenova3.setAutor(tolkin);
		kovid1.setAutor(kovid);
		kovid2.setAutor(kovid);
		kovid3.setAutor(kovid);
		djulici.setAutor(zmaj);

		// stampanje knjiga
		hobit.printKnjiga();
		gospodarPrstenova1.printKnjiga();
		gospodarPrstenova2.printKnjiga();
		gospodarPrstenova3.printKnjiga();
		kovid1.printKnjiga();
		kovid2.printKnjiga();
		kovid3.printKnjiga();
		djulici.printKnjiga();
		
		// stampanje autora 		
		System.out.println("Autori koje imamo u bazi su: ");
		tolkin.printAutor();
		kovid.printAutor();
		zmaj.printAutor();		

	}

}
