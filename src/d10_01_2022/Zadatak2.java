package d10_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {

		SmartAirConditioning samsung = new SmartAirConditioning();
		samsung.marka = "Samsung";
		samsung.temp = 27;
		samsung.mod = "GREJE";

		SmartAirConditioning galanz = new SmartAirConditioning();
		galanz.marka = "Galanz";
		galanz.temp = 17;
		galanz.mod = "HLADI";

		SmartAirConditioning gree = new SmartAirConditioning();
		gree.marka = "Gree";
		gree.temp = 23;
		gree.mod = "HLADI";

		samsung.printAC();
		galanz.printAC();
		gree.printAC();

	}

}
