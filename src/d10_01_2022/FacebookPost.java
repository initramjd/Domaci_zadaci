package d10_01_2022;

//FacebookPost je vezan za Zadatak3.

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

public class FacebookPost {

	private String infoPost;
	private String infoWall;
	private String message;
	private int numLike;
	private int numShare;
	
	FacebookPost(String infoPost, String infoWall, String message) {
		this.infoPost = infoPost;
		this.infoWall = infoWall;
		this.message = message;
		
	}

	public void like() {
		this.numLike++;
	}

	public void dislike() {
		this.numLike--;

		if (this.numLike < 0) {
			this.numLike = 0;
		}
	}

	public void share() {
		this.numShare++;
	}

	public void print() {
		System.out.println(this.infoPost + " >>> " + infoWall);
		System.out.println(this.message);
		System.out.println("Likes (" + this.numLike + ") | Shares (" + numShare + ")");
		System.out.println();
	}

	public void setInfoPost(String infoPost) {
		this.infoPost = infoPost;
	}

	public void setInfoWall(String infoWall) {
		this.infoWall = infoWall;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getInfoPost() {
		return this.infoPost;
	}

	public String getInfoWall() {
		return this.infoWall;
	}

	public String getMessage() {
		return this.message;
	}

	public int getNumLike() {
		return this.numLike;
	}

	public int getNumShare() {
		return this.numShare;
	}
}
