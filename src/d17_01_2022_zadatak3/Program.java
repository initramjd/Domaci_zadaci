package d17_01_2022_zadatak3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		// ElektricniSporet koncar = new ElektricniSporet("Koncar", 5, 3, "obicna",
		// double jacinaGrejaca);

		System.out.println("UNESITE KAKAV SPORET IMATE");

		System.out.print("Marka sporeta: ");
		String marka = s.next();
		System.out.print("Duzina garancije: ");
		int garancija = s.nextInt();
		System.out.print("Maksimalan broj ukljucenih ringli u istom trenutku: ");
		int maxUkljucenihRingli = s.nextInt();
		System.out.print("Tip ringle gore levo: ");
		String rGL = s.next();
		System.out.print("Jacina grejaca ringle gore levo: ");
		double grejacGL = s.nextDouble();
		System.out.print("Tip ringle gore desno: ");
		String rGD = s.next();
		System.out.print("Jacina grejaca ringle gore desno: ");
		double grejacGD = s.nextDouble();
		System.out.print("Tip ringle dole levo: ");
		String rDL = s.next();
		System.out.print("Jacina grejaca ringle dole levo: ");
		double grejacDL = s.nextDouble();
		System.out.print("Tip ringle dole desno: ");
		String rDD = s.next();
		System.out.print("Jacina grejaca ringle dole desno: ");
		double grejacDD = s.nextDouble();

		System.out.println();

		Ringla ringlaDL = new Ringla(rDL, grejacDL);
		Ringla ringlaDD = new Ringla(rDL, grejacDL);
		Ringla ringlaGL = new Ringla(rGL, grejacGL);
		Ringla ringlaGD = new Ringla(rGD, grejacGD);

		ElektricniSporet koncar = new ElektricniSporet(marka, garancija, maxUkljucenihRingli, ringlaDL, ringlaDD,
				ringlaGL, ringlaGD);

		koncar.pojacaj(1);
		koncar.pojacaj(1);
		koncar.pojacaj(1);
		koncar.pojacaj(1);
		koncar.pojacaj(2);
		koncar.pojacaj(3);

		System.out.println("Potrosnja sporeta je: " + koncar.potrosnja(3) + "kw" + "\n");

		koncar.printSporet();
		koncar.pojacaj(4);
		koncar.printSporet();

	}

}
