import static javax.swing.JOptionPane.*;
import java.util.*;

public class Øving1Oppgave2 {
	public static void main(String[] args) {
		String timerLest = showInputDialog("Antall timer: ");
		String minutterLest = showInputDialog("Antall minutter: ");
		String sekunderLest = showInputDialog("Antall sekunder: ");
		int timer = Integer.parseInt(timerLest);
		int minutter = Integer.parseInt(minutterLest);
		;
		int sekunder = Integer.parseInt(sekunderLest);
		;
		int timerSekunder = timer * 3600;
		int minutterSekunder = minutter * 60;
		int antallSekunder = sekunder + minutterSekunder + timerSekunder;
		System.out.println(timer + " timer, " + minutter + " minutter og " + sekunder + " sekunder er totalt " + antallSekunder + " sekunder.");
	}
}