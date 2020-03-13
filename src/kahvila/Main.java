package kahvila;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


    class Main {

        public static void main(String[] args) {
        Kahvila kahvila = new Kahvila();
        Kahvila tuotteet = new Kahvila();
        Scanner sc = new Scanner(System.in);

        while (true) {
            boolean Auth = false;
            System.out.println("Tervetuloa kahvilaan!");

            System.out.println("Syötä käyttäjätunnus:");
            String käyttäjä = sc.nextLine();

            System.out.println("Syötä salasana:");
            String salasana = sc.nextLine();

            if (käyttäjä.equals("Omistaja") && (salasana.equals("Salasana"))) {
                Auth = true;
            }
            while(Auth == true) {
                System.out.println("Syötä komento:");
                String komento = sc.nextLine();
                if (komento.equals("Lisää")) {
                    Lisaa();
                }
                else if (komento.equals("Poista")) {
                    Poista();
                }
                else {
                    System.out.println("Syötit virheellisen komennon:");
                }
            }
        }



        }

        private static void Poista() {

        }

        private static void Lisaa() {

        }
    }
