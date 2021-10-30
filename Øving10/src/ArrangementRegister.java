import java.util.ArrayList;
import java.util.Collections;

public class ArrangementRegister {

    int entydigTall = 1;

    private ArrayList<Arrangement> arrangementer = new ArrayList<Arrangement>();

    public void registrerNyttArrangement(String navn, String sted, String arrangør, String type, long tidspunkt){
        arrangementer.add(new Arrangement(entydigTall, navn, sted, arrangør, type, tidspunkt));
        entydigTall++;
    }

    public void visAlleArrengementer(){
        System.out.println(arrangementer.toString());
    }

    public void visAlleArrengementerPåSted(String sted){
        for (int i = 0; i < arrangementer.size(); i++) {
           if (arrangementer.get(i).getSted().equals(sted)){
               System.out.println(arrangementer.get(i).getNavn());
           }
        }
    }

    public void visAlleArrengementerPåTid(long tid){
        for (int i = 0; i < arrangementer.size(); i++) {
            if (arrangementer.get(i).getDato() == tid){
                System.out.println(arrangementer.get(i).getNavn());
            }
        }
    }

    public void visAlleArrengementerITidsintervall(long startDato, long sluttDato){
        long[] sorter = new long[arrangementer.size()];
        for (int i = 0; i < arrangementer.size(); i++) {
            if (arrangementer.get(i).getDato() >= startDato && arrangementer.get(i).getDato() <= sluttDato){
                sorter[i] = arrangementer.get(i).getTidspunkt();
            }
        }
        long minst = 1000000000000000L;
        int index = 0;
        for (int y = 0; y < sorter.length; y++) {
            for (int e = 0; e < sorter.length; e++) {
                if (minst > sorter[e] && sorter[e] != 0) {
                    minst = sorter[e];
                    index = e;
                }
            }
            System.out.println(arrangementer.get(index).getNavn());
            sorter[index] = 0L;
            minst = 1000000000000000L;
        }
    }

    public void listeSted(){
        Collections.sort(arrangementer, Arrangement.sorterSted);
    }

    public void listeType(){
        Collections.sort(arrangementer, Arrangement.sorterType);
    }

    public void listeTid(){
        Collections.sort(arrangementer, Arrangement.sorterTid);
    }
}
