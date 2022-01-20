package d18_01_2022_zadatak1;

import java.util.ArrayList;

public class Student {

	/*
	 * Napisati klasu Student koja ima broj indeksa ime i prezime tip studija
	 * (osnovne, master, doktorske) niz ispita konstuktore koje mislite da ce vam
	 * trebati gettere i settere za indeks, ime i prezime, tip studija getter za niz
	 * predmeta metodu dodaj ispit u niz ispita metodu koja racuna prosek na
	 * studijama (u prosek se ubrajaju samo polozeni ispiti) metodu stampaj koja
	 * stampa u formatu: (broj indeksa) - (ime i prezime) - (tip studija) Predmeti:
	 * (naziv predmeta) - (profesor) - (ocena) (naziv predmeta) - (profesor) -
	 * (ocena) (naziv predmeta) - (profesor) - (ocena) Prosecna ocena: (prosecna
	 * ocena)
	 * 
	 */

	private String brIndex;
	private String student;
	private TipoviStudija tipStudija;
	ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
	
	public enum TipoviStudija {
		OSNOVNE,
		MASTER,
		DOKTORSKE
		}

	Student(String brIndex, String student, TipoviStudija tip) {
		this.brIndex = brIndex;
		this.student = student;
		this.tipStudija = tip;
	}

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}

	public String getBrIndex() {
		return brIndex;
	}

	public void setBrIndex(String brIndex) {
		this.brIndex = brIndex;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}



	public TipoviStudija getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(TipoviStudija tipStudija) {
		this.tipStudija = tipStudija;
	}

	public void dodajIspit(String predmet, int ocena, String profesor) {
		// metodu dodaj ispit u niz ispita
		Ispit isp = new Ispit(predmet, ocena, profesor);
		this.ispiti.add(isp);
	}

	public double prosecnaOcena(ArrayList<Ispit> ispiti) {
		double prosecnaOcena = 0;
		int zbirOcena = 0;
		int brojac = 0;

		for (int i = 0; i < ispiti.size(); i++) {
			Ispit ispit = ispiti.get(i);
			int ocena = ispit.getOcena();
			if (ispit.ispitPolozen()) {
				zbirOcena = zbirOcena + ocena;
				brojac++;
			}
		}
		return prosecnaOcena = (double) zbirOcena / brojac;
	}

	public void stampajStudent() {
		/*
		 * metodu stampaj koja stampa u formatu: (broj indeksa) - (ime i prezime) - (tip
		 * studija) Predmeti: (naziv predmeta) - (profesor) - (ocena) (naziv predmeta) -
		 * (profesor) - (ocena) (naziv predmeta) - (profesor) - (ocena) Prosecna ocena:
		 * (prosecna ocena)
		 */
		System.out.println(brIndex + " - " + student + " - " + tipStudija + "\n" + "Predmeti: ");

		for (int i = 0; i < ispiti.size(); i++) {
			Ispit ispit = this.ispiti.get(i);
			System.out.println(ispit.predmet + " - " + ispit.profesor + " - " + ispit.ocena);
		}
		System.out.println("Prosecna ocena: " + prosecnaOcena(ispiti));
	}

}
