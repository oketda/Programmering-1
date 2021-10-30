public class TekstBehandling {
    String tekst;

    public TekstBehandling(String x) {
        tekst = x;
    }

    public void antallOrd() {
        String[] deltOpp = tekst.split( " ");
        System.out.println("Det er totalt " + deltOpp.length + " ord i teksten.");
        System.out.println("");
    }

    public void gjennomsnittOrdlengde() {
        String[] deltOpp = tekst.split( " ");
        String[] feilmargin = tekst.split("!|,|\\.");
        double antall = 0;
        for (int i = 0; i < deltOpp.length ; i++) {
            for (int e = 0; e < deltOpp[i].split("").length; e++) {
                antall += 1;
            }
        }
        antall -= feilmargin.length-1;
        System.out.println("Det er i gjennomsnitt " + antall/deltOpp.length + " bokstaver per ord i teksten.");
        System.out.println("");
    }

    public void gjennomsnittOrdPeriode() {
        String[] deltOpp = tekst.split("!|,|\\.");
        double antall = 0;
        for (int i = 0; i < deltOpp.length ; i++) {
            for (int e = 0; e < deltOpp[i].split(" ").length; e++) {
                    antall += 1;
            }
        }
        antall -= deltOpp.length-1;
        System.out.println("Det er i gjennomsnitt " + antall/deltOpp.length + " ord per periode i teksten.");
        System.out.println("");
    }

    public void erstattOrd(String erstatt, String erstattMed) {
        System.out.println("Skal erstatte " + erstatt + " fra teksten med " + erstattMed + ":");
        tekst = tekst.replace(erstatt, erstattMed);
        System.out.println(tekst);
        System.out.println("");
    }

    public void storeBokstaver() {
        System.out.println("");
        String storTekst = tekst.toUpperCase();
        System.out.println(storTekst);
        System.out.println("");
    }


    public static void main(String[] args) {
        TekstBehandling objekt = new TekstBehandling("Hei. jeg heter Herman! Det finnes en, test i programmet. Den kommer nå");

        objekt.antallOrd();
        objekt.gjennomsnittOrdlengde();
        objekt.gjennomsnittOrdPeriode();
        objekt.erstattOrd("finnes", "fins");
        System.out.println(objekt.tekst);
        objekt.storeBokstaver();


    }
}
