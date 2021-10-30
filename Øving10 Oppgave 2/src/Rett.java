public class Rett {

    private String navn;
    private String type;
    private int pris;

    public Rett(String n, String t, int p){
       this.navn = n;
       this.type = t;
       this.pris = p;
    }

   public String getNavn(){
       return navn;
    }

    public String getType(){
        return type;
    }

    public int getPris(){
        return pris;
    }

    public String toString(){
        return "[Navn: " + navn + ", type: " + type + ", pris: " + pris + "kr]";
    }


}
