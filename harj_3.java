/*
Tee ohjelma, joka kysyy käyttäjältä kolme lukua ja tulostaa niiden summan. 
Huom! Käytä tehtäväpohjaan valmiiksi luotuja muuttujia -- älä siis luo uusia 
muuttujia koodiin. Tee ohjelmastasi seuraavan muotoinen:

Scanner lukija = new Scanner(System.in);
int summa = 0;

System.out.println("Summa: " + summa);

Anna ensimmäinen luku: 3
Anna toinen luku: 6
Anna kolmas luku: 12

Summa: 21


*/
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;

        // KIRJOITA OHJELMA TÄHÄN
        // ÄLÄ KÄYTÄ MUITA MUUTTUJIA KUIN lukija ja summa !
        System.out.println("Anna ensimmäinen luku: ");
        summa = summa + Integer.parseInt(lukija.nextLine());
        System.out.println("Anna toinen luku: ");
        summa = summa + Integer.parseInt(lukija.nextLine());
        System.out.println("Anna kolmas luku: ");
        summa = summa + Integer.parseInt(lukija.nextLine());
        
        System.out.println("Summa: " + summa);
    }
}
