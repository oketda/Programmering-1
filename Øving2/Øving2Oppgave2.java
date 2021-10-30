import static javax.swing.JOptionPane.*;
import java.util.*;

/*
* Dette programmet regner ut kg prisen til 2 forskjellige kjøttdeiger ved bruk av Arrays.
*/

public class Øving2Oppgave2 {
	public static void main(String[] args) {
		double[] kjøttdeigA = {35.90, 0.450};
		double[] kjøttdeigB = {39.50, 0.500};
		
		double kgPrisA = kjøttdeigA[0]/kjøttdeigA[1];
		double kgPrisB = kjøttdeigB[0]/kjøttdeigB[1];
		
		double avrundetA = Math.round(kgPrisA* 100.0)/100.0;
		
		System.out.println("Kjøttdeig A koster " + avrundetA + " per kg. Kjøttdeig B koster " + kgPrisB + " per kg.");
		
		if (kgPrisA < kgPrisB) {
			System.out.println("Kjøttdeig A er billigere per kg enn kjøttdeig B");
		}
		else {
			System.out.println("Kjøttdeig B er billigere per kg enn kjøttdeig A");
		}
	}
}