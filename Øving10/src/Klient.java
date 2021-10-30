import java.util.Scanner;

public class Klient {

    public static void main(String[] args){

        Arrangement arrObj = new Arrangement( 1,"Idrettskveld i Dødens dal", "Dødens dal", "Tihlde", "Kanonball", 201911011800L);
        ArrangementRegister arrRegObj = new ArrangementRegister();

        arrRegObj.registrerNyttArrangement("Idrettskveld i Dødens dal", "Dødens dal", "Tihlde", "Kanonball", 201911011800L);
        arrRegObj.registrerNyttArrangement("Babysvømming", "Pirbadet", "Idi", "Svømming", 201911021500L);
        arrRegObj.registrerNyttArrangement("Lankveld", "Akrinn", "Tihlde", "Lan", 201911012000L);
        arrRegObj.registrerNyttArrangement("Svømmekonkurranse", "Pirbadet", "Abakus", "Svømming", 201911031600L);

        Scanner scn = new Scanner(System.in);
        int meny = -1;
        String navn;
        String sted;
        String arrangør;
        String type;
        long tid;
        long tid2;
        int index;

        while(true){
            System.out.println("1: Vis alle arrangementer");
            System.out.println("2: Legg til et nytt arrangement");
            System.out.println("3: Sjekk arrangementer på gitt sted");
            System.out.println("4: Sjekk arrangementer på gitt dato");
            System.out.println("5: Sjekk arrangementer i gitt tidsintervall");
            System.out.println("6: Sorter og vis alle arrangementer");
            System.out.println("7: Avslutt");
            meny = Integer.parseInt(scn.nextLine());

            if(meny == 1){
                arrRegObj.visAlleArrengementer();
            }
            else if (meny == 2){
                System.out.println("Skriv inn navn");
                navn = scn.nextLine();
                System.out.println("Skriv inn sted");
                sted = scn.nextLine();
                System.out.println("Skriv inn arrangør");
                arrangør = scn.nextLine();
                System.out.println("Skriv inn type arrangement");
                type = scn.nextLine();
                System.out.println("Skriv inn tid på formen år-måned-dag-klokkeslett");
                tid  = Long.parseLong(scn.nextLine(), 10);
                arrRegObj.registrerNyttArrangement(navn, sted, arrangør, type, tid);
            }
            else if (meny == 3){
                System.out.println("Skriv inn sted");
                sted = scn.nextLine();
                arrRegObj.visAlleArrengementerPåSted(sted);
            }
            else if (meny == 4){
                System.out.println("Skriv inn Dato på formen år-måned-dag");
                tid = Long.parseLong(scn.nextLine(), 10);
                arrRegObj.visAlleArrengementerPåTid(tid);
            }
            else if (meny == 5){
                System.out.println("Skriv inn første dato på formen år-måned-dag");
                tid = Long.parseLong(scn.nextLine(), 10);
                System.out.println("Skriv inn andre datoen på formen år-måned-dag");
                tid2 = Long.parseLong(scn.nextLine(), 10);
                arrRegObj.visAlleArrengementerITidsintervall(tid, tid2);
            }
            else if (meny == 6){
                System.out.println("Hva vil du sortere etter?");
                System.out.println("1: sted");
                System.out.println("2: type");
                System.out.println("3: tidspunkt");
                index = Integer.parseInt(scn.nextLine());
                if (index == 1){
                    arrRegObj.listeSted();
                }
                else if (index == 2){
                    arrRegObj.listeType();
                }
                else if (index == 3){
                    arrRegObj.listeTid();
                }
                else{
                    System.out.println("Du valgte ikke noe. Skriver bare ut liste.");
                }
                arrRegObj.visAlleArrengementer();
            }
            else if(meny == 7){
                System.out.println("Avslutter...");
                break;
            }
            else {
                System.out.println("Du skrev noe ugyldig.");
            }
            System.out.println();
        }

    }
}
