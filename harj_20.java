/*
Ohjelmaan on toteutettu valmiina pohja, joka lukee käyttäjältä lukuja listalle. 
Syötteiden lukeminen päätetään kun käyttäjä syöttää luvun -1.

Lisää ohjelmaan toiminnallisuus, joka lukujen lukemisen jälkeen tulostaa 
listalla olevien lukujen summan.

72
2
8
11
-1

Summa: 93
*/
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // älä koske tässä olevaan koodiin
        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.parseInt(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }
        
        System.out.println("");
        int summa = 0;
        for (Integer luku:lista){
            summa = summa + luku;
        }
        System.out.println("Summa: "+summa);
        // toteuta listan lukujen summan laskeminen tänne
    }
}
