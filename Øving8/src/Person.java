import java.util.*;

public class Person {
    String fornavn;
    String etternavn;
    int fødselsår;

    public Person(String fNavn, String eNavn, int år){
        fornavn = fNavn;
        etternavn = eNavn;
        fødselsår = år;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public int getFødselsår() {
        return fødselsår;
    }

    public void setFornavn(String f) {
        this.fornavn = f;
    }

    public void setEtternavn(String e) {
        this.etternavn = e;
    }

    public void setFødselsår(int år) {
        this.fødselsår = år;
    }


}
