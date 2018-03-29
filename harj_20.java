/*
Tee ohjelma, joka kysyy käyttäjän ikää ja kertoo, onko tämä täysi-ikäinen 
(eli 18-vuotias tai vanhempi).

Kuinka vanha olet? 12
Et ole täysi-ikäinen!

Kuinka vanha olet? 32
Olet täysi-ikäinen!
*/
import java.util.Scanner;

public class TaysiIkaisyys {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Kuinka vanha olet?");
        int luku = Integer.parseInt(lukija.nextLine());
        if (luku<18){
            System.out.println("Et ole täysi-ikäinen!");
        }else{
            System.out.println("Olet täysi-ikäinen!");
        }
        // Toteuta ohjelmasi tähän. 
    }
}
