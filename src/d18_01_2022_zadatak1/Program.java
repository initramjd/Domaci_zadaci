package d18_01_2022_zadatak1;

import d18_01_2022_zadatak1.Student.TipoviStudija;

public class Program {

	public static void main(String[] args) {
		
		Student gm = new Student ("13505", "Goran Maodus", TipoviStudija.MASTER);
		
		gm.dodajIspit("Matematika", 10,  "Radovan Grujic");
		gm.dodajIspit("Srpski", 6,  "Jovan Jovanovic");
		gm.dodajIspit("Infotmatika", 10,  "Petar Petrovic");
		gm.dodajIspit("Hemija", 5,  "Rade Vujic");
		gm.dodajIspit("Fizika", 6,  "Ivan Jovanovic");
		gm.dodajIspit("Francuski", 5,  "Milica Antic");
		gm.dodajIspit("Geografija", 7,  "Ivica Kralj ");
		gm.stampajStudent();
		
		

	}

}
