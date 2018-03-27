
import java.util.Scanner;

public class KolmenLuvunSummaaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
/*
Tee ohjelma, joka kysyy käyttäjältä kolme kokonaislukua ja tulostaa niiden summan.
Anna ensimmäinen luku: 5
Anna toinen luku: 2
Anna kolmas luku: 12
Lukujen summa: 19
*/
        // Toteuta ohjelmasi tähän. Muista kysyä kolmea lukua käyttäjältä!
        System.out.println("Anna ensimmäinen luku: ");
        int eka = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna toinen luku: ");
        int toka = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna kolmas luku: ");
        int kolmas = Integer.parseInt(lukija.nextLine());
        int tulos = eka+toka+kolmas;
        System.out.println("Lukujen summa: "+tulos);
    }
}
