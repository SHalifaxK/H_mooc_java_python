/*
Tee ohjelma joka lukee käyttäjältä merkkijonon ja tulostaa 
merkkijonon kolmesti peräkkäin.

Mikä tulostetaan? kukka

kukkakukkakukka
*/
import java.util.Scanner;

public class TulostusKolmesti {

    public static String tulosta(String x){
       
       return x; 
    }
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mitä tulostetaan? ");
        String tulostus = lukija.nextLine();
        System.out.print(tulosta(tulostus));
        System.out.print(tulosta(tulostus));
        System.out.print(tulosta(tulostus));
        // Toteuta ohjelmasi tähän.

    }
}

