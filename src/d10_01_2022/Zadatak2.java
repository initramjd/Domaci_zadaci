package d10_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {

		SmartAirConditioning samsung = new SmartAirConditioning();
		samsung.marka = "Samsung";
		samsung.temp = 27;
		samsung.mod = "GREJE";
		samsung.potrosnjaDokHladi = 1.2;
		samsung.potrosnjaDokGreje = 2.5;

		SmartAirConditioning galanz = new SmartAirConditioning();
		galanz.marka = "Galanz";
		galanz.temp = 17;
		galanz.mod = "HLADI";
		galanz.potrosnjaDokHladi = 1.6;
		galanz.potrosnjaDokGreje = 2.8;

		SmartAirConditioning gree = new SmartAirConditioning();
		gree.marka = "Gree";
		gree.temp = 23;
		gree.mod = "GREJE";
		gree.potrosnjaDokHladi = 1.1;
		gree.potrosnjaDokGreje = 2.1;

		samsung.printAC();
		galanz.printAC();
		gree.printAC();
		
		
		System.out.println(samsung.marka + " za mesec dana potrosi " + samsung.mesecnaPotrosnja() + " kw");
		System.out.println(galanz.marka + " za mesec dana potrosi " + galanz.mesecnaPotrosnja() + " kw");
		System.out.println(gree.marka + " za mesec dana potrosi " + gree.mesecnaPotrosnja() + " kw");

		System.out.println(samsung.marka + " za mesec dana napravi racun od: " + samsung.racun() + " dinara");
		System.out.println(galanz.marka + " za mesec dana napravi racun od: " + galanz.racun() + " dinara");
		System.out.println(gree.marka + " za mesec dana napravi racun od: " + gree.racun() + " dinara");
	}

}
