import java.util.ArrayList;

public class Meny {

    public ArrayList<Rett> retter = new ArrayList<Rett>();
    public ArrayList<Rett> meny = new ArrayList<Rett>();


    public void nyRett(String navn, String type, int pris){
        boolean eksistererAllerede = false;
        for (int i = 0; i < retter.size(); i++) {
            if (retter.get(i).getNavn().equals(navn)){
                eksistererAllerede = true;
            }
        }
        if (eksistererAllerede == false){
            retter.add(new Rett(navn, type, pris));
        }
    }

    public String visRettVedNavn(String navn){
        String returner = "";
        for (int i = 0; i < retter.size(); i++) {
            if (retter.get(i).getNavn().equals(navn)){
                returner = retter.get(i).toString();
            }
        }
        return returner;
    }

    public String visRetterVedType(String type){
        String returner = "";
        for (int i = 0; i < retter.size(); i++) {
            if (retter.get(i).getType().equals(type)){
                returner += retter.get(i).toString();
            }
        }
        return returner;
    }

    public ArrayList<Rett> visAlleRetter(){
        return retter;
    }

    public ArrayList<Rett> getMeny(){
        return meny;
    }

    public void nyMeny(Rett rett){
        meny.add(rett);
    }

}
