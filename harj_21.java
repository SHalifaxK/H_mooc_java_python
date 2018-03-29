/*
Tee ohjelma, joka kysyy käyttäjältä kaksi kokonaislukua ja tulostaa niistä 
suuremman. Jos luvut ovat yhtä suuret, ohjelma huomaa myös tämän.

Esimerkkitulostuksia:

Anna ensimmäinen luku: 5
Anna toinen luku: 3
Suurempi luku: 5

Anna ensimmäinen luku: 5
Anna toinen luku: 8
Suurempi luku: 8

Anna ensimmäinen luku: 5
Anna toinen luku: 5
Luvut ovat yhtä suuret!
*/
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna ensimmäinen luku: ");
        int eka = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna toinen luku: ");
        int toka = Integer.parseInt(lukija.nextLine());
        if (eka>toka){
            System.out.println("Suurempi luku: "+eka);
        }else if (toka>eka){
            System.out.println("Suurempi luku: "+toka);
        }else{
            System.out.println("Luvut ovat yhtä suuret!");
        }
    }
}
