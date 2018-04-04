/*
Tee ohjelma, joka pyytää käyttäjää kirjoittamaan merkkijonon. 
Jos käyttäjä kirjoittaa merkkijonon "totta", tulostetaan 
merkkijono "Oikein meni!", muulloin tulostetaan 
merkkijono "Koitappa uudelleen!".

Kirjoita merkkijono: totta
Oikein meni!

Kirjoita merkkijono: tottapa
Koitappa uudelleen!
*/
import java.util.Scanner;

public class OnkoTotta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kirjoita merkkijono: ");
        String merkki = lukija.nextLine();
        if (merkki.equals("totta")){
            System.out.println("Oikein meni!");
        }else{
            System.out.println("Koitappa uudelleen!");
        }
    }
}
