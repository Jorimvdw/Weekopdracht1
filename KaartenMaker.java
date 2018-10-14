package Dinsdag;
import java.util.ArrayList;
import java.util.Collections;

public class KaartenMaker {
	String[] Kleur = {"H","S","K","R"};
	String[] Waarde = {"2","3","4","5","6","7","8","9","10","B","V","H","A"}; 
	int[] Rekenwaarde = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
	ArrayList<Kaart> heledek = new ArrayList<Kaart>();
	ArrayList<Kaart> getrokkenkaarten = new ArrayList<>();
	int totaalwaarde = 0;
	
		
		void Vuldek () {
			
			for (int i = 0; i < 4 ; i++) {
				for (int j = 0; j < 13 ; j++) {
					Kaart kaart = new Kaart();
					kaart.kleur = Kleur[i];
					kaart.waarde = Waarde[j];
					kaart.rekenwaarde = Rekenwaarde[j];
					heledek.add(kaart);
				}
			}
		}
		
		void Schudden () {
			Collections.shuffle(heledek);
		}
		
		void Kaarttrekken (int a) {
			for (int b=0; b<a; b++) {
			System.out.println(heledek.get(0));
			totaalwaarde += heledek.get(0).rekenwaarde;
			getrokkenkaarten.add(heledek.get(0));
			heledek.remove(0);			
			}
		}
		
		
		
		
}		


	
	
