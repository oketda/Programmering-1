import java.util.Scanner;

public class Klient {

    public static void main(String[] args){
        Rett rettObj = new Rett("Blomkålsuppe", "forrett", 60);
        Meny menyObj = new Meny();
        MenyRegister menyRegisterObj = new MenyRegister();

        menyObj.nyRett("Bigmac", "Hovedrett", 79);
        menyObj.nyRett("Blomkålsuppe", "forrett", 60);
        menyObj.nyRett("Panacotta", "dessert", 155);
        menyObj.nyRett("Indrefillet", "hovedrett", 280);
        menyObj.nyRett("Andebryst", "hovedrett", 230);
        menyObj.nyRett("Flambert gåsegg", "forrett", 120);
        menyObj.nyRett("Marengs", "dessert", 140);
        menyObj.nyRett("Kyllingvinger", "hovedrett", 89);


        Scanner scn = new Scanner(System.in);
        int meny;
        String navn;
        String type;
        int pris;
        int index;
        int menyIndex;

        while (true){
            System.out.println("1: Vis alle retter.");
            System.out.println("2: Registrer ny rett.");
            System.out.println("3: Finn rett ved navn.");
            System.out.println("4: Finn alle retter av lik type.");
            System.out.println("5: Lag ny meny.");
            System.out.println("6: Vis alle menyer med totalpris innenfor intervall");
            System.out.println("7: Avslutt.");
            meny = Integer.parseInt(scn.nextLine());

            if (meny == 1){
                System.out.println(menyObj.visAlleRetter());
            }
            else if (meny == 2){
                System.out.println("Hva heter retten?");
                navn = scn.nextLine();
                System.out.println("Er det en forrett, hovedrett eller dessert?");
                type = scn.nextLine();
                System.out.println("Hva er prisen?");
                pris = Integer.parseInt(scn.nextLine());
                menyObj.nyRett(navn, type.toLowerCase(), pris);
            }
            else if (meny == 3){
                System.out.println("Hva heter retten?");
                navn = scn.nextLine();
                System.out.println(menyObj.visRettVedNavn(navn));
            }
            else if (meny == 4){
                System.out.println("Vil du se forrett, hovedrett eller dessert?");
                type = scn.nextLine();
                System.out.println(menyObj.visRetterVedType(type));
            }
            else if (meny == 5){
                Meny menyObj2 = new Meny();


                while (true) {
                    menyObj.visAlleRetter();
                    System.out.println("Skriv in nr på retten du vil legge til i menyen. skriv 0 hvis du er ferdig.");
                    index = Integer.parseInt(scn.nextLine());
                    if (index != 0) {
                        menyObj2.nyMeny(menyObj.retter.get(index - 1));
                    }
                    else {
                        break;
                    }
                }
                menyRegisterObj.menyer.add(menyObj2);

            }
            else if (meny == 6){
                System.out.println("Hva er minste totalpris på menyene?");
                index = Integer.parseInt(scn.nextLine());
                System.out.println("Hva er største totalpris på menyene?");
                menyIndex = Integer.parseInt(scn.nextLine());
                System.out.println(menyRegisterObj.visMenyInnenforPris(index, menyIndex));
            }
            else if (meny == 7){
                System.out.println("Avslutter...");
                break;
            }
            else{
                System.out.println("Du skrev noe ugyldig.");
            }
        }
    }
}
