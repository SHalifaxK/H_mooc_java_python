/*
Ympyrän kehän pituus lasketaan kaavalla 2 * pii * säde. Tee ohjelma, 
joka kysyy käyttäjältä ympyrän säteen ja laskee sen perusteella 
ympyrän kehän pituuden. Voit käyttää joko omaa muuttujaa piin arvon 
tallentamiseen, tai voit käyttää Javan valmiiksi tarjoamaa piin arvoa. 
Javan valmiin piin arvon saa käyttöön kirjoittamalla Math.PI laskutoimitukseen.

Anna ympyrän säde: 20

Ympyrän kehä: 125.66370614359172
*/
import java.util.Scanner;

public class YmpyranKehanPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna ympyrän säde: ");
        int sade = Integer.parseInt(lukija.nextLine());
        double keha = 2*Math.PI*sade;
        System.out.println("Ympyrän kehä: "+keha);
        // Toteuta ohjelmasi tähän. 
    }
}
