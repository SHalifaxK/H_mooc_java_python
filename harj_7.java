/*
Tee ohjelma, joka tunnistaa seuraavat käyttäjät:
tunnus 	salasana
aleksi 	tappara
elina 	kissa

Ohjelma näyttää käyttäjälle henkilökohtaisen viestin tai ilmoittaa, 
jos tunnus tai salasana on väärin.

Anna tunnus: aleksi
Anna salasana: tappara
Olet kirjautunut järjestelmään

Anna tunnus: elina
Anna salasana: kissa
Olet kirjautunut järjestelmään

Anna tunnus: aleksi
Anna salasana: jokerit
Virheellinen tunnus tai salasana!
*/
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna tunnus: ");
        String tunnus = lukija.nextLine();
        System.out.println("Anna salasana: ");
        String salasana = lukija.nextLine();
        if (tunnus.equals("aleksi") && salasana.equals("tappara")){
            System.out.println("Olet kirjautunut järjestelmään");
        }else if (tunnus.equals("elina") && salasana.equals("kissa")){
            System.out.println("Olet kirjautunut järjestelmään");
        }else{
            System.out.println("Virheellinen tunnus tai salasana!");
        }
    }
}
