package Dinsdag;

public class oefen {
	public static void main(String[] args) {

/*	public static void main(String[] args) {
		int qq = optellen(14, 15);
		System.out.println(qq);
		
	
	}
	static int optellen (int a, int b) {
		int antwoord = a + b;
		return antwoord;
	}
*/
	
	
	Fiets fiets = new Fiets();
	fiets.merk = "Gazelle";
//	fiets.aantalWielen = 2;
	
	Klant klant = new Klant();
	
	klant.checken(fiets);
	
	fiets.kenmerken();
	klant.doodvallen();
	klant.doodvallen();
	
	
}
}

class Fiets {
	String merk;
	AantalWielen banden = new AantalWielen();
	
	void kenmerken () {
		System.out.println("De fiets is van het merk " + merk);
		System.out.println("De fiets heeft " + banden.wielen + " wielen.");
	}
}
class Klant {
	boolean levend = true;
	void checken(Fiets a) {
	System.out.println(a.merk);
	}
	void doodvallen() {
		levend =! levend;
		if (levend == false) {
		System.out.println("De klant is dood!");
		} else {
		System.out.println("Een wonder is geschied, de klant leeft weer!");
		}
		
	}
}
class AantalWielen {
	int wielen = 2;
}

