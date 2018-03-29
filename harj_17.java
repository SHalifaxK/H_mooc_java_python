/*
Tee ohjelma, joka kysyy käyttäjältä kokonaisluvun ja tulostaa merkkijonon 
"Orwell" jos luku on täsmälleen 1984.

Anna luku: 1983
Anna luku: 1984
Orwell
*/
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        if (luku==1984){
            System.out.println("Orwell");
        }
        // Toteuta ohjelmasi tähän. 
    }
}
