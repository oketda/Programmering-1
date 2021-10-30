import static javax.swing.JOptionPane.*;
import java.util.*;

/*
* Dette programmet viser gangetabellen fra et ønsket tall til et annet ved bruk av while-loop.
*/

public class Øving3Oppgave1 {
	public static void main(String[] args) {
		
		String gangetabellStart = showInputDialog("Velg hvilken gangetabell du vil starte på: ");
		String gangetabellSlutt = showInputDialog("Velg hvilken gangetabell du vil slutte på: ");
		
		int start = Integer.parseInt(gangetabellStart);
		int slutt = Integer.parseInt(gangetabellSlutt);
		
		int x = 1;
		int y = 1;
		
		while (start<slutt+1) {
			/*Måtte lagge while nøkkelen under for å få teksten til å ikke bli
			* skrevet en gang for mye etter at siste gangetabellen var skrevet ut.
			*/
			while (y == 1) {
				System.out.println(start + "-gangen:");
				y++;
			}
			if (x<11) {
				System.out.println(start + "*" + x + " = " + start*x);
				x++;
			}
			else {
				start++;
				x = 1;
				y = 1;
			}
		}
	}
}