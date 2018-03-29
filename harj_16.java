/*
Tee ohjelma, joka kysyy käyttäjältä kokonaisluvun ja tulostaa merkkijonon 
"Ylinopeussakko!" jos luku on suurempi kuin 120.

Kerro nopeus: 15
Kerro nopeus: 135
Ylinopeussakko!
*/
import java.util.Scanner;

public class Ylinopeussakko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Kerron nopeus: ");
        int nopeus = Integer.parseInt(lukija.nextLine());
        if (nopeus>120){
            System.out.println("Ylinopeussakko!");
        }
        // Toteuta ohjelmasi tähän. 
    }
}
