import java.util.ArrayList;

public class MenyRegister {

    public ArrayList<Meny> menyer = new ArrayList<Meny>();

    public String visMenyInnenforPris(int minst, int maks) {
        String returner = "";
        int pris;
        for (int i = 0; i < menyer.size(); i++) {
            pris = 0;
            for (int j = 0; j < menyer.get(i).getMeny().size(); j++) {
                pris += menyer.get(i).getMeny().get(j).getPris();
            }
            if (pris > minst && pris < maks) {
                returner += menyer.get(i).getMeny() + ". pris: " + pris + "kr";
            }
        }
        return returner;
    }
}