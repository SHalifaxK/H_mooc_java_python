/*
Tee ohjelma, joka kysyy käyttäjän nimen ja ilmoittaa, 
kuinka monta kirjainta siinä on. Toteuta merkkijonon pituuden 
selvittäminen erilliseen metodiin 
public static int laskeKirjaimet(String merkkijono).

Anna nimi: Pekka
Kirjainmäärä: 5

Anna nimi: Katariina
Kirjainmäärä: 9

Huom! Rakenna ohjelmasi niin että laitat pituuden laskemisen omaan metodiinsa: 
public static int laskeKirjaimet(String merkkijono). 
Testit testaavat sekä metodia laskeKirjaimet että koko ohjelman toimintaa.
*/
import java.util.Scanner;

public class NimenPituus {
    
    public static int laskeKirjaimet(String merkkijono){
        int lukumaara = merkkijono.length();
        return lukumaara;
    }
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna nimi: ");
        String nimi = lukija.nextLine();
        System.out.println(laskeKirjaimet(nimi));
        // kutsu täältä metodiasi
    }
    
    // tee tänne metodi 
    // public static int laskeKirjaimet(String merkkijono)
    
}
