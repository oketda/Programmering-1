public class Student {

     private String navn;
     private int antOppg;

    public Student(String n, int ao) {
        navn = n;
        antOppg = ao;
    }

    public String getNavn(){
        return navn;
    }

    public int getAntOppg() {
        return antOppg;
    }

    public void økAntOppg(int økning) {
        antOppg += økning;
    }

    public String toString() {
        return "Navn: " + navn + ", antall oppgaver: " + antOppg;
    }

}
