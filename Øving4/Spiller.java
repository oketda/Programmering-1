import static javax.swing.JOptionPane.*;
import java.util.*;
import java.util.Random;

public class Spiller {
	
	public int kastTerningen() {
		Random terning = new Random();
		int terningkast = terning.nextInt(6);
		terningkast += 1;
		return terningkast;
	} 
	
	public void erFerdig(String vinner) {
		System.out.println();
		System.out.println("Vi har en vinner! Gratulerer " + vinner);
	}
	
	public void getPoeng() {
		
		Spiller spiller = new Spiller();
		
		int spiller1Poeng = 0;
		int spiller2Poeng = 0;
		int antallØyne1 = 0;
		int antallØyne2 = 0;
		int runde = 0;
		
		while (true) {
				
			System.out.println("Runde " + runde + ":");
			System.out.println("Spiller 1: " + spiller1Poeng + " poeng Spiller 2: " + spiller2Poeng + " poeng");
			runde++;
			
			if (spiller1Poeng > 100) {
				spiller1Poeng -= spiller.kastTerningen();
				spiller2Poeng += spiller.kastTerningen();
			}
			else if (spiller2Poeng > 100) {
				spiller1Poeng += spiller.kastTerningen();
				spiller2Poeng -= spiller.kastTerningen();
			}
			else if (spiller1Poeng == 100) {
				spiller.erFerdig("spiller 1");
				break;
			}
			else if (spiller2Poeng == 100) {
				spiller.erFerdig("spiller 2");
				break;
			}
			else {
				spiller1Poeng += spiller.kastTerningen();
				spiller2Poeng += spiller.kastTerningen();
			}
			 
			if (antallØyne1 == spiller1Poeng-1) {
				spiller1Poeng = 0;
			}
			
			if (antallØyne2 == spiller2Poeng-1) {
				spiller2Poeng = 0;
			}
			
			antallØyne1 = spiller1Poeng;
			antallØyne2 = spiller2Poeng;
		}
	}
	
}