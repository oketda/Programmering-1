import java.util.ArrayList;
import java.util.Scanner;

public class Klient {

    public static void main(String[] args){
        Student studObj = new Student("Herman Aagaard", 0);
        OppgaveOversikt oppgObj = new OppgaveOversikt();

        oppgObj.nyStudent("Herman Aagaard", 2);

        Scanner scn = new Scanner(System.in);
        String txt;
        int tall;
        int tall2;
        int meny = -1;


        while(meny != 6) {
            System.out.println("1: Registrer ny student");
            System.out.println("2: Vis ønsket student");
            System.out.println("3: Vis antall registrerte studenter");
            System.out.println("4: Vis alle registrerte studenter");
            System.out.println("5: Øk oppgaver");
            System.out.println("6: Avslutt");

            meny = Integer.parseInt(scn.nextLine());

            if (meny == 1) {
                System.out.println("Skriv inn navn på ny student");
                txt = scn.nextLine();
                System.out.println("Skriv inn antall godkjente oppgaver");
                tall = Integer.parseInt(scn.nextLine());
                oppgObj.nyStudent(txt, tall);
            }
            else if (meny == 2) {
                System.out.println("Velg #student du vil se.");
                tall = Integer.parseInt(scn.nextLine());
                tall--;
                oppgObj.visStudent(tall);
            }
            else if (meny == 3) {
                oppgObj.registrerteStudenter();
            }
            else if (meny == 5) {
                System.out.println("Hvilken student vil du øke oppgaver for?");
                txt = scn.nextLine();
                System.out.println("Hvor mange skal legges til?");
                tall = Integer.parseInt(scn.nextLine());
                oppgObj.okOppgaver(txt, tall);
            }
            else if (meny == 4) {
                oppgObj.visAlleStudenter();
            }
            else if (meny == 6) {
                System.out.println("Avslutter...");
                break;
            }
            else {
                System.out.println("Du skrev inn noe feil");
            }
        }





    }
}
