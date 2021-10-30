import static javax.swing.JOptionPane.*;
import java.util.*;
import java.util.Random;
import java.io.File;

public class Matriser {
	int[][] matrise1 = { {1, 3, 1}, {2, 1, 2}, {3, 2, 3} };
	int[][] matrise2 = { {4, 1, 4}, {3, 2, 3}, {5, 4, 8} };
	

	int[][] svarMatrise = new int[matrise1.length][matrise2[0].length];
	
	
	public void addisjon() {
		for (int i = 0; i < matrise1.length; i++) {
			for (int e = 0; e < matrise2.length; e++) {
				svarMatrise[i][e] = matrise1[i][e] + matrise2[i][e];
			}
		}
	}
	
	public void multiplikasjon() {
		for (int i = 0; i < matrise2[0].length; i++) {
			for (int e = 0; e < matrise1[i].length; e++) {
				for (int y = 0; y < matrise2[e].length; y++) {
					svarMatrise[e][i] += matrise1[e][y] * matrise2[y][i];
				}
			}
		}
	}
	
	public void transponering() {
		int[][] transponertMatrise = new int[matrise1.length][matrise1[0].length];
		
		System.out.println("Matrise 1 transponert = ");
		System.out.println("");
		
		for (int i = 0; i < matrise1.length; i++) {
			for (int e = 0; e < matrise1[i].length; e++) {
				transponertMatrise[i][e] = matrise1[e][i];
			}
		}
		
		for (int i = 0; i < transponertMatrise.length; i++) {
			for (int e = 0; e < transponertMatrise[i].length; e++) {
				System.out.print(transponertMatrise[i][e] + " ");
			}
			System.out.println("");
		}
	}
	
	public void svar() {
		int i = 0;
		while (i < svarMatrise.length) {
			int e = 0;
			while (e < svarMatrise[i].length) {
				System.out.print(svarMatrise[i][e] + " ");
				e++;
			}
			System.out.println("");
			i++;
		}
	}
	
	public void reset() {
		int i = 0;
		while (i < svarMatrise.length) {
			int e = 0;
			while (e < svarMatrise[i].length) {
				svarMatrise[i][e] = 0;
				e++;
			}
			i++;
		}
	}
}