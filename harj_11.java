
import java.util.Scanner;

public class SyotetynLuvunTulostaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
/*
Tee ohjelma, joka kysyy käyttäjältä lukua ja tulostaa syötetyn luvun arvon.
Anna luku: 42
Syötit: 42
*/
        // Toteuta ohjelmasi tähän.
        System.out.println("Anna luku:");
        int luku = Integer.parseInt(lukija.nextLine());
        System.out.println("Syötit: "+luku);
    }
}
