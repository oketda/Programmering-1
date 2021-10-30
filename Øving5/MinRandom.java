import static javax.swing.JOptionPane.*;
import java.util.*;
import java.util.Random;
import java.io.File;

public class MinRandom{
	
	Random tilfeldig = new Random();

	
	public int nesteHeltall(int nedre, int ovre) {
		int tilfeldigHeltall = tilfeldig.nextInt(ovre-nedre) + nedre;
		return tilfeldigHeltall;
	}
	
	public double nesteDesimaltall(double nedre, double ovre) {
		double tilfeldigDesimaltall = tilfeldig.nextDouble() * (ovre-nedre) + nedre;
		return tilfeldigDesimaltall;
	}
	
	public static void main(String[] args) {
		MinRandom objekt = new MinRandom();
		int i = 0;
		while (i < 100) {
		System.out.println(objekt.nesteHeltall(4, 12) + objekt.nesteDesimaltall(0, 1));
		i++;
	}
	}
}