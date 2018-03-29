/*
Tee ohjelma, joka kysyy käyttäjältä kaksi kokonaislukua ja tulostaa 
niiden osamäärän. Varmista, että 3 / 2 = 1.5. Jos desimaaliosa katoaa, 
lue uudelleen Jakolaskuun liittyvä kohta materiaalista.

Anna ensimmäinen luku: 3
Anna toinen luku: 2

Jakolasku: 3 / 2 = 1.5

*/
import java.util.Scanner;

public class Jakaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna ensimmäinen luku: ");
        int eka = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna toinen luku: ");
        int toka = Integer.parseInt(lukija.nextLine());
        double tulos = 1.0*eka/toka;
        System.out.println("Jakolasku: "+eka+" / "+toka+" = "+tulos);
        // Toteuta ohjelmasi tähän. Muista kysyä luvut käyttäjältä!
    }
}
