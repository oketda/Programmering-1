import static javax.swing.JOptionPane.*;
import java.util.*;
import java.util.Random;
import java.io.File;

public class TallTabell {
	
	Random tilfeldig = new Random();
	
	public void genererTall() {
		
		int[] tall = new int[10];
		int i = 1;
		
		while(i<10000) {
			int nyttTall = tilfeldig.nextInt(10);
			tall[nyttTall] += 1;
			i++;
		}
		int a = 0;
		while (a < tall.length) {
			System.out.println(a + ": " + tall[a]);
			a++;
		}
	}
	
	public static void main(String[] args) {
		TallTabell objekt = new TallTabell();
		
		objekt.genererTall();
	}
}