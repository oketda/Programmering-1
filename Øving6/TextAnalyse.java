import static javax.swing.JOptionPane.*;
import java.util.*;
import java.util.Random;
import java.io.File;

public class TextAnalyse {
	
	int[] antallTegn = new int[30];
	String[] bokstaver = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "æ", "ø", "å",};
	String str = showInputDialog("Skriv en tekst. å");
	
	public void totaltAntallBokstaver() {
		
		int lengde = str.length();
		
		
		int i = 0;
		int totaltBokstaver = 0;
		
		while(i < lengde) {
			int e = 0;
			char b1 = str.charAt(i);
			String bokstav = Character.toString(b1);
			
			while(e < bokstaver.length) {
				
				if (bokstav.equals(bokstaver[e])) {
					antallTegn[e] += 1;
					totaltBokstaver++;
					break;
				}
				else if (e == bokstaver.length-1) {
					antallTegn[29] += 1;
				}
				e++;
			}
			i++;
		}
		
		
		int mestBrukt = 0;
		int mestBruktTall = 0;
		int y = 0;
		
		while(y < antallTegn.length) {
			if (antallTegn[y] > mestBrukt) {
				mestBrukt = antallTegn[y];
				mestBruktTall = y;
			}
			y++;
		}
		
		
		
		
		System.out.println("Det er totalt " + totaltBokstaver + " bokstaver i teksten.");
		
		double prosent = 100*((double) antallTegn[29])/(totaltBokstaver + antallTegn[29]);
		System.out.println("Det er " + prosent + "% tegn i teksten.");
		System.out.println("Bokstaven(e) som forekommer oftest er:");
		int u = 0;
		
		while (u < antallTegn.length-1) {
			if (antallTegn[u] == mestBrukt) {
				System.out.println(bokstaver[u]);
			}	
			u++;
		}
		
	}
	
	
	public void enBokstav(int typeBokstav){
		
		System.out.println("Det er " + antallTegn[typeBokstav] + " " + bokstaver[typeBokstav] + " i teksten.");
		
		
	}
	
	
	public void antallForskjelligeBokstaver(){
		int a = 0;
		int forskjelligeBokstaver = 0;
		
		while (a < antallTegn.length-1) {
			if (antallTegn[a] > 0) {
				forskjelligeBokstaver += 1;
			}
			a++;
		}
		System.out.println("Det er " + forskjelligeBokstaver + " forskjellige bokstaver i teksten.");

	}
}
