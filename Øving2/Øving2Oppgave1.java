import static javax.swing.JOptionPane.*;
import java.util.*;

/*
* Dette programmet viser om et tilfeldig årstall skrevet av brukeren er et skuddår.
* Dette gjør det ved bruk av if-setninger.
*/

public class Øving2Oppgave1 {
	public static void main(String[] args) {
		String årstallLest = showInputDialog("Velg et år: ");
		int årstall = Integer.parseInt(årstallLest);
		
		if (årstall%4 == 0 && årstall%100 != 0) {
			System.out.println(årstall + " er et skuddår siden det er delelig med 4");
		}
		else if (årstall%400 == 0) {
			System.out.println(årstall + " er et skuddår siden det er delelig med 400");
		}
		else {
			System.out.println(årstall + " er ikke et skuddår");
		}
	}
}