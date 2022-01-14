package d13_01_2022;


/*
 * Kreirati klasu FacebookPost koja ima:
   Od atributa:
ime i prezime korisnika koji je objavio post
ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
tekst objave
broj lajkova
broj deljenja
  Od gettera i settera:
korisnik moze da procita bilo koji atribut 
ali ne moze da menja broj lajkova i broj deljenja (nemamo settere za ove atribute)
 Konstruktore:
	konstruktori koji su potrebni i logicni
  Od metoda:
like(), koja povecava broj lajkova za 1.
dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
share(), koja povecava broj deljenja za 1
print(), koja stampa objavu u formatu:
(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
(tekst objave)
Likes (broj lajkova) | Shares (broj deljenja)

U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.


Primer stampanja:
Milan Jovanovic >>> Pera Peric
Ovo je tekst objave
Likes 3 | Shares 1

 */

public class Zadatak1 {

	public static void main(String[] args) {

		FacebookPost prvi = new FacebookPost("Goran Maodus", "IT Bootcamp", "Pozdrav za drustvo iz kraja :)");

		prvi.setInfoPost("Mikri Maus");
		prvi.setInfoWall("Prtini");
		prvi.setMessage("Prti NI :)");
		
		FacebookPost drugi = new FacebookPost("Pera Peric", "Srbija", "Narodnjaci su zakon");

		drugi.setInfoPost("Dusko Radovic");
		drugi.setInfoWall("Rave is AFTER");
		drugi.setMessage("Techno, techno, techno FOLK !");

		FacebookPost treci = new FacebookPost("Lucifer", "God", "in Heaven is Hell.");
		
		treci.setInfoPost("Beelzebub");
		treci.setInfoWall("Lord");
		treci.setMessage("In Heaven is Hell !!!");

		for (int i = 0; i < 666; i++) {
			treci.like();
		}

		prvi.like();
		prvi.dislike();
		prvi.like();
		prvi.like();

		drugi.dislike();
		drugi.dislike();
		drugi.like();
		drugi.dislike();
		drugi.dislike();

		prvi.share();

		drugi.share();

		prvi.print();

		drugi.print();

		treci.print();		
		
		System.out.println("Prve tri poruke su:");
		System.out.println(prvi.getMessage() + ", " + drugi.getMessage() + ", " + treci.getMessage());
				
		System.out.println();
		
		System.out.println("Prva tri korisnika koja su objavili post su:");
		System.out.println(prvi.getInfoPost() + ", " + drugi.getInfoPost() + ", " + treci.getInfoPost());
		
		System.out.println();
		
		System.out.println("Prva tri korisnika na cijem zidu je objaviljen post su:");
		System.out.println(prvi.getInfoWall() + ", " + drugi.getInfoWall() + ", " + treci.getInfoWall());
		
		
		System.out.println();
		
		System.out.println("Broj lajkova prva tri posta je: ");
		System.out.println(prvi.getNumLike() + ", " + drugi.getNumLike() + ", " + treci.getNumLike());
		
		System.out.println();
		
		System.out.println("Broj sherova prva tri posta je: ");
		System.out.println(prvi.getNumShare() + ", " + drugi.getNumShare() + ", " + treci.getNumShare());
		
	}

}
