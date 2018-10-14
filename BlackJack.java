package Dinsdag;
import java.util.Scanner;

public class BlackJack {
	Scanner scanner = new Scanner(System.in);
	KaartenMaker dek = new KaartenMaker();

	
	BlackJack(){
		System.out.println("Welkom bij BlackJack, druk op 's' om te starten");
		start();
		doorspelen();
	}
	
	
	void start() {
	char start = scanner.next().charAt(0);
	if (start == 's') {
		dek.Vuldek();
		dek.Schudden();
		dek.Kaarttrekken(2);
		if (dek.totaalwaarde == 21) {
			System.out.println("Gefeliciteerd, hoger kan niet");
		}
	}
	
	}
	
	void doorspelen() {
		System.out.println("De totaalwaarde van je kaarten is " + dek.totaalwaarde);
		System.out.println("Druk 'k' voor nog een kaart, 'p' om te passen en 'q' om te stoppen");
		
		char doorspelen = scanner.next().charAt(0);
		
		switch(doorspelen) {
		case 'p':
			System.out.println("Passen");
			System.out.println("De einduitslag is " + dek.totaalwaarde);
			break;
		case 'k':
			System.out.println("Pakt een kaart");
			dek.Kaarttrekken(1);
			if (dek.totaalwaarde > 21) {
				for (int y = 0 ; y < dek.getrokkenkaarten.size(); y++) {
					if (dek.getrokkenkaarten.get(y).rekenwaarde == 11) {
						dek.getrokkenkaarten.get(y).rekenwaarde = 1;
						dek.totaalwaarde -= 10;						
						doorspelen();
					} 				
				}
				System.out.println("Helaas, je hebt meer dan 21");
			} else if (dek.totaalwaarde == 21) {
					System.out.println("Gefeliciteerd, hoger kan niet");
			} else {
					doorspelen();	
			}
			break;
		
		case 'q':
			System.out.println("Het spel is gestopt");
			break;
		}
}
	
	
	
	
	
	}
