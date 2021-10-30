import static javax.swing.JOptionPane.*;
//import java.util.*;
import java.util.Random;
import java.io.File;

/*
* Dette programmet adderer, subtraherer, multipliserer og dividerer to brøker bestemt av bruker.
* Dette skjer ved bruk av flere metoder og konstruktører.
* Etter utregningene skriver programmet ut utregningene slik at brukeren kan lese svarene.
*/

public class Brok{
	
	int x;
	int y;
	
	public Brok(int teller1, int nevner1){
		x = teller1;
		y = nevner1;
	}
	
	public Brok(int teller2){
		x = teller2;
		y = 1;
	}
	
	public int getx() {
		return x;
	}
	
	public int gety() {
		return y;
	}
	
		
		public void Adder(int tall1, int tall2){
				
			int nyNevner = this.y * tall2;
			int nyTeller1 = this.x * tall2;
			int nyTeller2 = tall1 * this.y;
			int adder = nyTeller1 + nyTeller2;
			
			System.out.println(adder + "/" + nyNevner);
				
				if (tall2 == 0) {
					throw new IllegalArgumentException("Nevner kan ikke være null");
				}
			}
			
			public void Subtraher (int tall1, int tall2) {
				int nyNevner = this.y * tall2;
				int nyTeller1 = this.x * tall2;
				int nyTeller2 = tall1 * this.y;
				int subtraher = nyTeller1 - nyTeller2;
			
				System.out.println(subtraher + "/" + nyNevner);
				
					if (tall2 == 0) {
						throw new IllegalArgumentException("Nevner kan ikke være null");
					}
			}
			
			public void Multipliser (int tall1, int tall2) {
				int nyNevner = this.y * tall2;
				int nyTeller = this.x * tall1;
				
				System.out.println(nyTeller + "/" + nyNevner);
				
				if (tall2 == 0) {
					throw new IllegalArgumentException("Nevner kan ikke være null");
				}
			}
			
			public void Divider (int tall1, int tall2) {
				int nyNevner = this.y * tall1;
				int nyTeller = this.x * tall2;
				
				System.out.println(nyTeller + "/" + nyNevner);
				
				if (tall2 == 0) {
					throw new IllegalArgumentException("Nevner kan ikke være null");
				}
			}
			
	
	public static void main(String[] args){
		
		Brok brøk1 = new Brok(4, 2);
		Brok brøk2 = new Brok(3);
		
		int teller = brøk2.getx();
		int nevner = brøk2.gety();
		
		
		
		
					
			brøk1.Adder(teller, nevner);
			brøk1.Subtraher(teller, nevner);
			brøk1.Multipliser(teller, nevner);
			brøk1.Divider(teller, nevner);
		
	}
	
}