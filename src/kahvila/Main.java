package kahvila;
import java.util.ArrayList;
import java.util.Scanner;


    class Main {

        public static void main(String[] args) {
        Kahvila kahvila = new Kahvila();
        Kahvila tuotteet = new Kahvila();
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
            }

            while(omistajaAuth == true) {
                System.out.println("Syötä komento:");
                String komento = sc.nextLine();

                if (komento.equals("Lisää")) {
                    System.out.println("Minkä niminen on tuote, jonka haluat lisätä?");
                    String sana = sc.nextLine();
                    System.out.println("Minkä hintainen on tuote, jonka haluat lisätä");
                    int hinta = Integer.parseInt(sc.nextLine());
                    Tuote ast = new Tuote(sana, hinta);
                    kahvila.LisaaTuote(ast);

                }

                else if (komento.equals("Poista")) {

                }
                else {
                    System.out.println("Syötit virheellisen komennon:");
                }
            }
        }



        }




    }
