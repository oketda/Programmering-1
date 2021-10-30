import static javax.swing.JOptionPane.*;
import java.util.*;

/*
* Dette programmet regner ut om et tall er et primtall eller ikke.
* Dette gjør det ved bruk av en while-nøkkel med if-setninger inni.
*/

public class Øving3Oppgave2{
	public static void main(String[] args) {
		String ønsketTall = showInputDialog("Sjekk om et tall er et primtall:");
		int tall = Integer.parseInt(ønsketTall);
		
		int i = 2;
		
		while (i < tall+1) {
			if (i == tall) {
				System.out.println(tall + " er et primtall siden det kun er delelig på 1 og seg selv.");
				i++;
			}
			else if (tall%i == 0) {
				System.out.println(tall + " er ikke et primtall siden det er delelig med " + i);
				i = tall+1;
			}
			else {
				i++;
			}
		}
	}
}