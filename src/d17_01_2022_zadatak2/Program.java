package d17_01_2022_zadatak2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Racun goran = new Racun("840-526456-12", "Goran Maodus", 12500);
		Racun radovan = new Racun("845-6456565-23", "Radovan Grujic", 25000);
		
		Transakcija prva = new Transakcija(radovan, goran, 2000);
		Transakcija druga = new Transakcija(radovan, goran, 2000);
		Transakcija treca = new Transakcija(goran, radovan, 15000);
		
		
		prva.izvrsiTransakciju();
		prva.printTransakcija();
		
		druga.izvrsiTransakciju();
		druga.printTransakcija();
		
		treca.izvrsiTransakciju();
		treca.printTransakcija();

	}

}
