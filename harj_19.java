
import java.util.Scanner;

public class PositiivinenLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
/*
Tee ohjelma, joka kysyy käyttäjältä kokonaisluvun ja kertoo, onko se 
positiivinen (eli suurempi kuin nolla) vai ei.
Anna luku: 5
Luku on positiivinen.

Anna luku: -2
Luku ei ole positiivinen.
*/
        // Toteuta ohjelmasi tähän. 
        System.out.println("Anna luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        if (luku>0){
            System.out.println("Luku on positiivinen");
        }else{
            System.out.println("Luku ei ole positiivinen");
        }
    }
}
