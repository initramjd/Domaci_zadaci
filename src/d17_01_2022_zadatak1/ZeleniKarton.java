package d17_01_2022_zadatak1;

public class ZeleniKarton {

	/*
	 * Zadatak Kreirati klasu ZeleniKarton koja ima: ime i prezime studenta broj
	 * indeksa naziv predmeta ime i prezime profesora ocenu - od 5 do 10 gettere i
	 * settere konstruktore metodu koja vraca da li je ispit polozen ili ne (ispit
	 * je polozen ako je ocena veca od 5) metodu stampaj koja stampa podatke u
	 * formatu: (naziv predmeta) - (ocena) Student: ime i prezime, broj indeksa
	 * Profesor: ime i prezime
	 * 
	 */

	private String student;
	private String brIndex;
	private String predmet;
	private String profesor;
	private int ocena; // 5 - 10

	ZeleniKarton() {
	}

	ZeleniKarton(String student, String brIndex, String predmet, String profesor, int ocena) {
		
		this.student = student;
		this.brIndex = brIndex;
		this.predmet = predmet;
		this.profesor = profesor;
		this.ocena = ocena;		
	}

	public String student() {
		return student;
	}

	public void student(String student) {
		this.student = student;
	}

	public String getBrIndex() {
		return brIndex;
	}

	public void setBrIndex(String brIndex) {
		this.brIndex = brIndex;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public boolean jePolozio() {
		return (this.ocena > 5);
	}

	public void printZeleniKarton() {
		/*
		 * metodu stampaj koja stampa podatke u formatu: (naziv predmeta) - (ocena)
		 * Student: ime i prezime, broj indeksa Profesor: ime i prezime
		 */
		System.out.println(this.predmet + " - " + this.ocena + "\n" + "Student: " + this.student + ", " + this.brIndex
				+ "\n" + "Profesor: " + this.profesor);
	}

	

}
