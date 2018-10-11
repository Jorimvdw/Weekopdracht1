package Dinsdag;
import java.util.Collections;

public class StartSpel {
		public static void main(String[] args) {
		KaartenMaker dek = new KaartenMaker();
		dek.Vuldek();
		
		
		
		dek.Schudden();
		dek.Kaarttrekken(2);
		
		/*System.out.println(dek.heledek);
		System.out.println(dek.heledek.get(0));
		dek.heledek.remove(0);
		System.out.println(dek.heledek.get(0));*/
	}
	
	/*static void Kaarttrekken (int a) {
		for (int b=0; b<a; b++) {
		System.out.println(dek.heledek.get(0));
		dek.heledek.remove(0);
		}
	}*/
	
	
	/*	HeleKaartspel start = new HeleKaartspel();
		start.PrintSpel();
		
		System.out.println();
		
		BlackJack blackjack = new BlackJack();
		blackjack.starten();
		

	}
	*/
}
