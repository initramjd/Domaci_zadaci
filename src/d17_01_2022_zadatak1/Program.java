package d17_01_2022_zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * U glavnoj klasi: kreirati niz od 10tak zelenih kartona za ispite i odstampati
		 * podatke za sve ispite (Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve
		 * ispite (Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih
		 * ispita
		 * 
		 */
		Scanner s = new Scanner(System.in);

		String imeIprezime = "";
		String brIndex = "";
		String predmet = "";
		String profesor = "";
		int ocena = 0;

		ArrayList<ZeleniKarton> kartoni = new ArrayList<ZeleniKarton>();

		System.out.print("Unesite ime i prezime studenta: ");
		imeIprezime = s.next();

		System.out.print("Unesite broj indexa: ");
		brIndex = s.next();

		for (int i = 0; i < 4; i++) {

			System.out.print("Unesite predmet koji ste polagali: ");
			predmet = s.next();

			System.out.print("Unesite ime i prezime profesora: ");
			profesor = s.next();

			System.out.print("Unesite ocenu koju ste dobili: ");
			ocena = s.nextInt();

			ZeleniKarton kartonDodavanje = new ZeleniKarton(imeIprezime, brIndex, predmet, profesor, ocena);
			kartoni.add(kartonDodavanje);

		}

		stampaZeleniKarton(kartoni);

		System.out.println("Prosecna ocena: " + prosecnaOcena(kartoni));
		System.out.println("Prosecna ocena polozenih ispita je: " + prosecnaOcenaPolozenih(kartoni));

	}

	public static double prosecnaOcena(ArrayList<ZeleniKarton> kartoni) {
		double ocene = 0;
		double prosecnaOcena = 0;

		for (int i = 0; i < kartoni.size(); i++) {
			ocene = ocene + (double) kartoni.get(i).getOcena();
		}

		prosecnaOcena = ocene / kartoni.size();
		return prosecnaOcena;
	}

	public static double prosecnaOcenaPolozenih(ArrayList<ZeleniKarton> kartoni) {
		// Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
		double prosecnaOcenaPolozenih = 0;
		int ocene = 0;
		int brojac = 0;
		for (int i = 0; i < kartoni.size(); i++) {
			ZeleniKarton karton = kartoni.get(i);
			if (karton.jePolozio()) {
				ocene = ocene + karton.getOcena();
				brojac++;
			}
		}
		return prosecnaOcenaPolozenih = (double) ocene / (double) brojac;
	}

	public static void stampaZeleniKarton(ArrayList<ZeleniKarton> kartoni) {
		for (int i = 0; i < kartoni.size(); i++) {
			kartoni.get(i).printZeleniKarton();
		}
	}

}
