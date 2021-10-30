import java.util.Scanner;

public class Klient {

        public static void main(String[] args) {
            Person perObjekt = new Person ("Herman", "Aagaard", 1999);
            ArbTaker arbObjekt = new ArbTaker(1, 2005, 65000, 0.35, perObjekt);

            java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
            int år = kalender.get(java.util.Calendar.YEAR);

            Scanner scn = new Scanner(System.in);

            System.out.println("1: endre Informasjon");
            System.out.println("2: Skriv ut informasjon");
            System.out.println("3: Gjør oppgaver");
            System.out.println("4: avslutt");

            int oppgave = -1;
            int arbtakernr = 2;
            int antallÅr = 10;

            while (oppgave != 4) {
                oppgave = Integer.parseInt(scn.nextLine());


                if (oppgave == 1) {
                    System.out.println("Skriv fornavn:");
                    String fornavn = scn.nextLine();
                    System.out.println("Skriv etternavn:");
                    String etternavn = scn.nextLine();
                    System.out.println("Nytt fødselsår");
                    int fødselsår = Integer.parseInt(scn.nextLine());
                    System.out.println("Ny månedslønn:");
                    int lønn = Integer.parseInt(scn.nextLine());
                    System.out.println("Ny skatt i %");
                    double skatt = Double.parseDouble(scn.nextLine());
                    System.out.println("Nytt startår i jobben:");
                    int startÅr = Integer.parseInt(scn.nextLine());
                    System.out.println("Hvor mange år vil du sjekke om personen har jobbet?");
                    antallÅr = Integer.parseInt(scn.nextLine());
                    arbObjekt.setArbtakernr(arbtakernr);

                    perObjekt.setFornavn(fornavn);
                    perObjekt.setEtternavn(etternavn);
                    perObjekt.setFødselsår(fødselsår);
                    arbObjekt.setArbtakernr(arbtakernr);
                    arbObjekt.setAnsettelsesår(startÅr);
                    arbObjekt.setSkatteprosent(skatt/100);
                    arbObjekt.setMånedslønn(lønn);

                    perObjekt.getFornavn();
                    perObjekt.getEtternavn();
                    perObjekt.getFødselsår();
                    arbObjekt.getSkatteprosent();
                    arbObjekt.getAnsettelsesår();
                    arbObjekt.getMånedslønn();
                    arbObjekt.getArbtakernr();
                    arbtakernr++;
                }
                else if (oppgave == 2) {
                    System.out.println("Fornavn: " + perObjekt.fornavn);
                    System.out.println("Etternavn: " + perObjekt.etternavn);
                    System.out.println("Fødselsår: " + perObjekt.fødselsår);
                    System.out.println("Arbeidstaker nr: " + arbObjekt.arbtakernr);
                    System.out.println("Månedslønn: " + arbObjekt.månedslønn + "kr");
                    System.out.println("Skatteprosent: " + arbObjekt.skatteprosent*100 + "%");
                    System.out.println("Ansettelsesår: " + arbObjekt.ansettelsesår);
                }
                else if (oppgave == 3) {
                   arbObjekt.Navn();
                   arbObjekt.Alder(år);
                   arbObjekt.årsLønn();
                   arbObjekt.skattetrekkMåned();
                   arbObjekt.skattetrekkÅr();
                   arbObjekt.antallÅrJobbet(år);
                   arbObjekt.jobbetLenge(år, antallÅr);
                }
                else if (oppgave == 4) {
                    System.out.println("Avslutter..");
                    break;
                }
                else {
                    System.out.println("Du skrev noe ugyldig");
                }
                System.out.println("");
                System.out.println("1: endre Informasjon");
                System.out.println("2: Skriv ut informasjon");
                System.out.println("3: Gjør oppgaver");
                System.out.println("4: avslutt");
            }
        }
}
