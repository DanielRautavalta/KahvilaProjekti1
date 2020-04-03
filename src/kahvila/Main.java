package kahvila;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Kahvila kahvila = new Kahvila();
        Asiakas asiakas = new Asiakas();
        Scanner sc = new Scanner(System.in);
        while (true) {
            boolean omistajaAuth = false;
            boolean asiakasAuth = false;
            System.out.println("Tervetuloa kahvilaan!");

            System.out.println("Syötä käyttäjätunnus:");
            String käyttäjä = sc.nextLine();

            System.out.println("Syötä salasana:");
            String salasana = sc.nextLine();

            if (käyttäjä.equals("Omistaja") && (salasana.equals("Salasana"))) {
                omistajaAuth = true;
            } else if (käyttäjä.equals("Asiakas") && (salasana.equals("Salasana"))) {
                asiakasAuth = true;
            }

            while (omistajaAuth == true) {
                System.out.println("Komennot: Kirjaudu ulos, Poista, Lisää, Listaa");
                System.out.println("Syötä komento:");
                String komento = sc.nextLine();

                if (komento.equals("Lisää")) {
                    System.out.println("Minkä niminen on tuote, jonka haluat lisätä?");
                    String sana = sc.nextLine();
                    while (true) {
                        System.out.println("Minkä hintainen on tuote, jonka haluat lisätä");
                        String input = sc.nextLine();
                        try {
                            int i = Integer.parseInt(input);
                            Tuote ast = new Tuote(sana, i);
                            kahvila.LisaaTuote(ast);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Virheellinen arvo, yritä uudelleen!");
                        }


                    }
                } else if (komento.equals("listaa")) {
                    System.out.println("Listalla olevat tuotteet:");

                    for (Tuote a : kahvila.getTuotteet()) {
                        System.out.println(a.getNimi() + ", hinta " + a.getHinta() + " €");
                    }
                }


            else if (komento.equals("Poista")) {
                    System.out.println("Minkä tuotteen haluat poistaa listalta?:");
                    String poisto = sc.nextLine();
                    kahvila.poistaTuote(poisto);
                } else if (komento.equals("kirjaudu ulos")) {
                    System.out.println("Poistutaan järjestelmästä...");
                    System.exit(0);
                } else {
                    System.out.println("Syötit virheellisen komennon, yritä uudelleen.");
                }
            }


            while (asiakasAuth == true) {
                System.out.println("Tervetuloa asiakas :)");
                while (true) {
                    System.out.println("Komennot: Osta, Kirjaudu ulos, Saldo, tuotteet");
                    System.out.println("Syötä komento:");
                    String komento = sc.nextLine();

                    if (komento.equals("Osta")) {
                        System.out.println("Syötä ostettava tuote:");
                        String ostettavaTuote = sc.nextLine();
                        for (Tuote a : kahvila.getTuotteet()) {
                            if (a.getNimi().equals(ostettavaTuote)) {
                                asiakas.otaRaha(a.getHinta(), a.getNimi());
                            } else if (komento.equals("saldo")) {
                                System.out.println("Saldo: " + asiakas.tulostaRaha() + "€");
                            }
                            else if (komento.equals("tuotteet")) {
                            System.out.println("Tämän hetkiset tuotteet:");
                            for (Tuote tuote : kahvila.getTuotteet()) {
                                System.out.println(tuote.getNimi() + ", " + tuote.getHinta() + "€");
                            }
                        } else if (komento.equals("kirjaudu ulos")) {
                            System.out.println("Poistutaan järjestelmästä...");
                            break;
                        }
                    }
                }

                }

            }
        }


   }
}









