import java.util.*;

public class ArbTaker {

    Person personalia;
    int arbtakernr;
    int ansettelsesår;
    int månedslønn;
    double skatteprosent;

    public ArbTaker(Person p){
        personalia = p;
    }

    public ArbTaker(int arbnr, int år, int lønn, double skatt, Person person) {
        this.arbtakernr = arbnr;
        this.ansettelsesår = år;
        this.månedslønn = lønn;
        this.skatteprosent = skatt;
        this.personalia = person;
    }


    public Person getPersonalia() {
        return personalia;
    }

    public int getArbtakernr() {
        return arbtakernr;
    }

    public int getAnsettelsesår() {
        return ansettelsesår;
    }

    public int getMånedslønn() {
        return månedslønn;
    }

    public double getSkatteprosent() {
        return skatteprosent;
    }

    public void setPerson(Person person) {
        this.personalia = person;
    }

    public void setArbtakernr(int nr) {
        this.arbtakernr = nr;
    }

    public void setAnsettelsesår(int år) {
        this.ansettelsesår = år;
    }

    public void setMånedslønn(int lønn) {
        this.månedslønn = lønn;
    }

    public void setSkatteprosent(double skatt) {
        this.skatteprosent = skatt;
    }

    public void skattetrekkMåned() {
        double skatt = this.månedslønn*this.skatteprosent;
        System.out.println("Du betaler " + skatt + "kr i skatt i en vanlig måned.");
    }

    public void årsLønn() {
        int bruttoLønn = this.månedslønn*12;
        System.out.println("Din bruttolønn er " + bruttoLønn + "kr i året.");
    }

    public void skattetrekkÅr() {
        double skatt = (10*this.månedslønn)*this.skatteprosent + this.månedslønn*(this.skatteprosent/2);
        System.out.println("Du betaler " + skatt + "kr i skatt i året.");
    }

    public void antallÅrJobbet(int mangeNokÅr) {
        System.out.println("Du har jobbet her i " + (mangeNokÅr-this.ansettelsesår) + " år.");
    }

    public void jobbetLenge(int mangeNokÅr, int antallÅr) {
        if (mangeNokÅr-this.ansettelsesår >= antallÅr) {
            System.out.println("Du har jobbet i denne jobben i minst " +  antallÅr +  " år. Bra jobba!");
        }
        else {
            System.out.println("Du har ikke jobbet i denne jobben i " + antallÅr + " år eller mer..");
        }
    }

    public void Navn() {
        System.out.println(this.personalia.etternavn + ", " + this.personalia.fornavn);
    }

    public void Alder(int år) {
        System.out.println(år-this.personalia.fødselsår);
    }

}
