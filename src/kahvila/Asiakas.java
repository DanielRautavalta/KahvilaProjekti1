package kahvila;
import java.util.*;
public class Asiakas {
    private int raha;

    public Asiakas() {
        this.raha = 95;
    }

    public int tulostaRaha() {
        return this.raha;
    }

    public void otaRaha(int maksu, String tuote) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Oletko varma että haluat ostaa tuotteen " + tuote + " Syötä vahvistus (K/E)");
            String vahvistus = sc.nextLine();

            if (vahvistus.equals("K")) {
                if (raha < maksu) {
                    System.out.println("Tapahtuma hylätty");
                    break;
                } else {
                    this.raha = raha - maksu;
                    System.out.println("Tapahtuma hyväksytty");
                    break;
                }
            } else if (vahvistus.equals("E")) {
                System.out.println("Asiakas perui oston.");
                break;
            } else {
                System.out.println("Syötit virheellisen arvon (K/E).");
            }
        }
    }
}

