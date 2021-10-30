import static javax.swing.JOptionPane.*;
import java.util.*;

/* 
* I dette programmet skal man kunne gjøre om valuta fritt mellom kroner, dollar, euro og pund.
* Bruker metoden regnUt for å regne mellom de ulike valutaene.
* Programmet er laget slik at det skal vøre enkelt å legge til flere valutaer.
* For å legge til flere valutaer må man bare legge til verdien til ny valuta samt lage en ny if-setning.
*/

public class Valuta {

	double dollar;
	double euro;
	double pund;
	
	public Valuta() {
		dollar = 9.00187239;
		euro = 9.99198833;
		pund = 11.0002881;
	}
	
	static void regnUt(String cash, double tall) {
		double kr;
		
		String typeValutaTekst = showInputDialog("1 = omgjør fra " + cash + " til kroner. 2 = omgjør fra kroner til " + cash);
		int typeValuta = Integer.parseInt(typeValutaTekst);
		
		if (typeValuta == 1) {
			String mengdeTekst = showInputDialog("Hvor mange " + cash + " skal gjøres om til kroner?");
			double mengde = Double.parseDouble(mengdeTekst);

			kr = mengde*tall;
			System.out.println(mengde + " " + cash + " er " + kr + " kroner");
		}
		else if (typeValuta == 2) {
			String mengdeTekst = showInputDialog("Hvor mange kroner skal gjøres om til " + cash + "?");
			double mengde = Double.parseDouble(mengdeTekst);

			kr = mengde/tall;
			System.out.println(mengde + "kroner er " + kr + " " + cash);
		}
		else {
			System.out.println("Du har skrevet inn noe ugyldig");
		}
	}
	
	
	public static void main(String[] args){
		Valuta objekt = new Valuta();
		
		String menyTekst = showInputDialog("Valutakalkulator. Velg valuta til utgangspunkt. 1 = Dollar. 2 = Euro. 3 = Pund. 4 = Avslutt");
		int meny = Integer.parseInt(menyTekst);
		
		if (meny == 1) {
			regnUt("dollar", objekt.dollar);
		}
		else if (meny == 2) {
			regnUt("euro", objekt.euro);
		}
		else if (meny == 3) {
			regnUt("pund", objekt.pund);
		}
		else if (meny == 4){
			System.out.println("Takk for nå.");
		}
		else {
			System.out.println("Du har skrevet inn noe ugyldig");
		}
		
	}
}