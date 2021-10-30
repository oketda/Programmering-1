import java.util.ArrayList;

public class OppgaveOversikt {

    private ArrayList<Student> studenter = new ArrayList<Student>();
    private int antStudent = 0;

    public void nyStudent(String navn, int antOppg){
        studenter.add(new Student(navn, antOppg));
        System.out.println();
    }

    public void visStudent(int index) {
        System.out.println(studenter.get(index).getNavn() + ", h*n har " + studenter.get(index).getAntOppg() + " oppgaver godkjent.");
        System.out.println();
    }

    public void registrerteStudenter() {
        System.out.println("Det er " + studenter.size() + " registrerte studenter.");
        System.out.println();
    }

    public void visAlleStudenter() {
        System.out.println(studenter.toString());
        System.out.println();
    }

    public void okOppgaver(String navn, int okning){
        for (int i = 0; i < studenter.size(); i++) {
            if (studenter.get(i).getNavn().equals(navn)){
                studenter.get(i).økAntOppg(okning);
            }
            System.out.println();
        }
    }
}
