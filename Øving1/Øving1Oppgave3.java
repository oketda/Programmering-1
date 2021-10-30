import static javax.swing.JOptionPane.*;
import java.util.*;

public class Øving1Oppgave3 {
	public static void main(String[] args) {
		//System.out.println("Skriv antall sekunder");
		//Scanner in = new Scanner(System.in);
		//int sekunder = in.nextInt();
		String sekunderLest = showInputDialog("Skriv antall sekunder: ");
		int sekunder = Integer.parseInt(sekunderLest);;
		int timer = sekunder/3600;
		int restTimer = sekunder%3600;
		int minutter = restTimer/60;
		int totalRest = restTimer%60;
		System.out.println(sekunder + " sekunder er " + timer + " time(r), " + minutter + " minutte(r) og " + totalRest + " sekunde(r).");
	}
}