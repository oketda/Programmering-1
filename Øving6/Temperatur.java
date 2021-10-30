import static javax.swing.JOptionPane.*;
import java.util.*;
import java.util.Random;
import java.io.File;

public class Temperatur {
	int[][] temperaturer = { {-1, -4, -2, -3, -4}, {3, 1, 0, 2, 3}, {5, 7, 14, 12, 9} };

public void gjennomsnittDag() {
	int i = 0;
	
	while (i < temperaturer.length) {
		int e = 0;
		double gjennomsnitt = 0;
		while (e < temperaturer[i].length) {
			gjennomsnitt += temperaturer[i][e];
			if (e == temperaturer[i].length-1) {
				System.out.println("Gjennomsnittstemperaturen for dag " + (i+1) + " = " + gjennomsnitt/(e+1) + " grader");
			}
			e++;
		}
		i++;
	}
}

public void gjennomsnittTimeDøgn() {
	int i = 0;
		
		while (i < temperaturer[0].length) {
			int e = 0;
			double gjennomsnitt = 0;
			while (e < temperaturer.length) {
				gjennomsnitt += temperaturer[e][i];
				if (e == temperaturer.length-1) {
					System.out.println("Gjennomsnittstemperaturen for time " + (i+1) + " for hver dag = " + gjennomsnitt/temperaturer.length + " grader");
				}
				e++;
			}
			i++;
		}
	
}

public void gjennomsnittMåned() {
	int i = 0;
	double gjennomsnitt = 0;
	int verdier = 0;
	
	while (i < temperaturer.length) {
		
		int e = 0;
		
		while (e < temperaturer[i].length) {
			gjennomsnitt += temperaturer[i][e];
			verdier += 1;
			e++;
		}
		i++;
	}
	System.out.println("Gjennomsnittstemperaturen for hele måneden er: " + gjennomsnitt/verdier + " grader.");
}

public void spesifikTemperatur() {
	int i = 0;
	int[] temperaturGruppe = new int[5]; // < -5, fra -5 til 0, fra 1 til 5, fra 6 til 10, > 10.
	String[] hvilkeTemperaturer = {"< -5", "fra -5 til 0", "fra 1 til 5", "fra 6 til 10", "> 10"};
	
	while (i < temperaturer.length) {
		int e = 0;
		double gjennomsnitt = 0;
		double gjennomsnittsverdi = 0;
		
		while (e < temperaturer[i].length) {
			gjennomsnitt += temperaturer[i][e];
			if (e == temperaturer[i].length-1) {
				gjennomsnittsverdi = (gjennomsnitt/temperaturer[i].length);
				
				 if (gjennomsnittsverdi < -5) {
					temperaturGruppe[0] += 1;
					System.out.println(gjennomsnittsverdi);
				}
				else if (gjennomsnittsverdi < 1 && gjennomsnittsverdi >= -5) {
					temperaturGruppe[1] += 1;
				}
				else if (gjennomsnittsverdi < 6 && gjennomsnittsverdi > 0) {
					temperaturGruppe[2] += 1;
				}
				else if (gjennomsnittsverdi < 10 && gjennomsnittsverdi > 5) {
					temperaturGruppe[3] += 1;
				}
				else {
					temperaturGruppe[4] += 1;
				}
			}
			e++;
		}
		i++;
	}
	
	int y = 0;
	while (y < temperaturGruppe.length) {
		System.out.println("Det er " + temperaturGruppe[y] + " døgn med " + hvilkeTemperaturer[y]);
		y++;
		}
	}  
}