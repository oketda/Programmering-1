import static javax.swing.JOptionPane.*;
import java.util.*;

public class Øving1Oppgave1 {
  public static void main(String[] args) {
	  String tommerLest = showInputDialog("Antall tommer: ");
	  double tommer = Double.parseDouble(tommerLest);
	  double cm = 2.54*tommer;
      System.out.println(tommer + " tommer = " + cm + "cm");
	//showMessageDialog(null, tommer + " tommer er " + cm + "cm");
  }
}