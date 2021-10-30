import java.util.Comparator;

public class Arrangement {

    private int arrangementNR; //entydig
    private String navn;
    private String sted;
    private String arrangør;
    private String type;
    private long tidspunkt;

    public Arrangement(int arrNR, String n, String s, String a, String t, long tid){
        arrangementNR = arrNR;
        navn = n;
        sted = s;
        arrangør = a;
        type = t;
        tidspunkt = tid;
    }

    public String getNavn(){
        return navn;
    }
    public String getSted(){
        return sted;
    }

    public String getType(){
        return type;
    }

    public long getTidspunkt() {
        return tidspunkt;
    }

    public long getDato(){
        String str = Long.toString(tidspunkt);
        String åtteFørste = str.substring(0,8);
        long dato = Long.parseLong(åtteFørste, 10);
        return dato;
    }

    public static Comparator<Arrangement> sorterSted = new Comparator<Arrangement>() {

        @Override
        public int compare(Arrangement o1, Arrangement o2) {

            String Sted1 = o1.getSted();
            String Sted2 = o2.getSted();

            return Sted1.compareTo(Sted2);
        }
    };

    public static Comparator<Arrangement> sorterType = new Comparator<Arrangement>() {

        @Override
        public int compare(Arrangement o1, Arrangement o2) {

            String Type1 = o1.getType();
            String Type2 = o2.getType();

            return Type1.compareTo(Type2);
        }
    };

    public static Comparator<Arrangement> sorterTid = new Comparator<Arrangement>() {

        @Override
        public int compare(Arrangement o1, Arrangement o2) {

            int  Tid1 = (int)o1.getTidspunkt();
            int Tid2 = (int)o2.getTidspunkt();

            return Tid1 - Tid2;
        }
    };

    public String toString() {
        return "[" + arrangementNR + ", " + navn + ", " + sted + ", " + arrangør + ", " + type + ", " + tidspunkt + "]";
    }
}
