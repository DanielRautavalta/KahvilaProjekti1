package kahvila;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


    class Main {
    public static void main(String[] args) {
        Kahvila kahvila = new Kahvila();
        Kahvila tuotteet = new Kahvila();
        Scanner sc = new Scanner(System.in);
        Iterator iterator = tuotteet.iterator()
        while (true) {
            System.out.println("Tervetuloa kahvilaan!");

            System.out.println("Syötä käyttäjätunnus:");
            String käyttäjä = sc.nextLine();

            System.out.println("Syötä salasana:");
            String salasana = sc.nextLine();
            if (käyttäjä.equals("Omistaja") && (salasana.equals("Salasana")) {
             boolean Auth = true;
            }
        }
        while(Auth == true) {

        }




    }
}
