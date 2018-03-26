
import java.util.Scanner;

public class KahdenLuvunSummaaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
/*
Tee ohjelma, joka kysyy käyttäjältä kaksi kokonaislukua ja tulostaa niiden summan.
Anna ensimmäinen luku: 6
Anna toinen luku: 2
Lukujen summa: 8
*/
        // Toteuta ohjelmasi tähän. Muista kysyä kaksi lukua käyttäjältä!
        System.out.println("Anna ensimmäinen luku:");
        int eka = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna toinen luku:");
        int toka = Integer.parseInt(lukija.nextLine());
        int tulos = eka + toka;
        System.out.println("Lukujen summa: "+ tulos);
    }
}
