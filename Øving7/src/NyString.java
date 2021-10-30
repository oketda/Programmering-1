import java.util.*;

public class NyString {

    String tekst;

    public NyString (String x) {
        tekst = x;
    }

    public void delOpp() {
        System.out.println("Skal forkorte <<" + tekst + ">> til bare de første bokstavene i hvert ord:");
        String[] deltOpp = tekst.split(" ");
        for (int i = 0; i < deltOpp.length; i++) {
            String tekstBit = deltOpp[i];
            String[] bokstaver = deltOpp[i].split("");
            System.out.print(bokstaver[0]);
        }
        System.out.println("");
    }

    public void fjernBokstav(String bokstav) {

        System.out.println("Skal fjerne bokstaven " + bokstav + " fra teksten:");
        tekst = tekst.replace(bokstav, "");
        System.out.println(tekst);
    }



public static void main(String[] args) {

    String stringObjekt = new String();
    NyString objekt = new NyString("Hei jeg heter Herman og dette er en test");

    objekt.delOpp();
    System.out.println("");
    objekt.fjernBokstav("e");

    }

}
