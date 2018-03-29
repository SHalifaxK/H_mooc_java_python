/*
Tee ohjelma, joka kysyy käyttäjältä vuosilukua. Jos käyttäjä syöttää luvun, 
joka on pienempi kuin 2015, ohjelma tulostaa merkkijonon "Wanha!".

Anna vuosiluku: 2017

Anna vuosiluku: 2013
Wanha!


*/
import java.util.Scanner;

public class Wanha {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna vuosiluku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        if (luku<2015){
            System.out.println("Wanha!");
        }
        // Toteuta ohjelmasi tähän. 
    }
}
