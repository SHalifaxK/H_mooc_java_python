/*
Vuosi on karkausvuosi, jos se on jaollinen 4:llä. Kuitenkin jos vuosi on 
jaollinen 100:lla, se on karkausvuosi vain silloin, kun se on jaollinen myös 
400:lla.

Tee ohjelma, joka lukee käyttäjältä vuosiluvun, 
ja tarkistaa, onko vuosi karkausvuosi.

Anna vuosi: 2011
Vuosi ei ole karkausvuosi.

Anna vuosi: 2012
Vuosi on karkausvuosi.

Anna vuosi: 1800
Vuosi ei ole karkausvuosi.

Anna vuosi: 2000
Vuosi on karkausvuosi.

*/
import java.util.Scanner;

public class Karkausvuosi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna Vuosi: ");
        int vuosi = Integer.parseInt(lukija.nextLine());

        if (vuosi % 4 == 0 && ( vuosi % 100 != 0 || vuosi % 400 == 0 ) ) {
            System.out.println("Vuosi on karkausvuosi.");
        } else {
            System.out.println("Vuosi ei ole karkausvuosi.");
        }
    }
}
