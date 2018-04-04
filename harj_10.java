/*
Tee ohjelma, joka tulostaa sanan alkuosan. Ohjelma kysyy käyttäjältä 
sanan ja alkuosan pituuden. Käytä ohjelmassa metodia substring.

Anna sana: esimerkki
Alkuosan pituus: 4
Tulos: esim

Anna sana: esimerkki
Alkuosan pituus: 7
Tulos: esimerk
*/
import java.util.Scanner;

public class Alkuosa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna sana: ");
        String sana = lukija.nextLine();
        System.out.println("Alkuosan pituus: ");
        int pituus = Integer.parseInt(lukija.nextLine());
        System.out.println("Tulos: "+sana.substring(0,pituus));
    }
}
