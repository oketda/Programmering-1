import static javax.swing.JOptionPane.*;
import java.util.*;
import java.util.Random;

/*
* Dette programmet skal simulere et terningspill hvor 2 spillere kaster en terning annenhver gang og bruker øynene på terningen som poeng.
* Når førstemann når 100 poeng har vi en vinner.
* Hvis en av spillerne går over 100 poeng må han trekke fra terningkast helt til h*n er under 100 igjen.
* Vinner altså ikke uten nøyaktig 100 poeng.
* Slår en spiller terningkast 1 så blir poengsummen nullstilt.
* Bruker metodene kastTerningen() og erFerdig() til å simulere et terningkast og skrive ut vinneren respektivt.
* En løkke med if-setninger gjør at spillet simuleres helt til en spiller har 100 poeng.
*/

public class Terningspill {
	
	
	public static void main(String[] args) {
		
		Spiller spiller = new Spiller();
		
		spiller.getPoeng();

	}
}