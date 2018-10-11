package Dinsdag;
import java.util.Scanner;

public class BlackJack {
	boolean doorspelen = true;
	Scanner scanner = new Scanner(System.in);
	
	void starten() {
		
	System.out.println("BlackJack gaat beginnen");
		while (doorspelen) {
			toonMenu();
			String invoer = scanner.nextLine();
			verwerkenInvoer (invoer);
		}
	}
	void toonMenu() {
		System.out.println("1. Kies een kaart.");
		System.out.println("2. Passen.");
		System.out.println("3. Stop ermee");
	}
	
	void verwerkenInvoer(String deInvoer) {
		switch(deInvoer) {
		case "1":
			System.out.println("Pakt een kaart");
//			System.out.println(KaartenMaker.geefKaart());
			break;
		case "2":
			System.out.println("Passen");
			break;
		case "3":
			doorspelen = false;
			System.out.println("Stoppen");
			break;
		}
	}
}
