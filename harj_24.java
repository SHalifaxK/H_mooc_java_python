/*
Tee ohjelma, joka kysyy käyttäjältä luvun ja ilmoittaa,
onko syötetty luku parillinen vai pariton.

Anna luku: 2
Luku 2 on parillinen.

Anna luku: 7
Luku 7 on pariton.
*/
import java.util.Scanner;

public class ParitonVaiParillinen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        System.out.println("Anna luku: "); 
        int luku = Integer.parseInt(lukija.nextLine());
        if (luku%2==0){
            System.out.println("Luku "+luku+"on parillinen");
        }else{
            System.out.println("Luku "+luku+"on pariton");
        }
       
        
    }
}
