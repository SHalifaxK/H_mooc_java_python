/*
Tee ohjelma, joka laskee käyttäjän syöttämän luvun kertoman.

Kertoma n! lasketaan kaavalla 1*2*3*...*n. 
Esimerkiksi luvun 4 kertoma on 24, eli 4! = 1*2*3*4 = 24. 
Lisäksi on määritelty, että luvun 0 kertoma on 1, eli 0! = 1.

Esimerkkitulostuksia:

Anna luku: 3
Kertoma on 6

Nyt laskettiin 1 * 2 * 3 = 6

Anna luku: 10
Kertoma on 3628800

Ja nyt laskettiin 1 * 2 * 3 * ... * 8 * 9 * 10 = 3628800

Lisätietoa: Kertomaa käytetään erityisesti todennäköisyyslaskennassa 
tilanteissa, missä halutaan esimerkiksi tarkastella jonkin joukon kaikkia 
erilaisia järjestyksiä. Esimerkiksi viiden hengen ryhmän voi järjestää 5! 
erilaiseen jonoon, ja 52 kortin korttipakka voi olla 52! erilaisessa 
järjestyksessä. Kertomaa voi käyttää myös kombinaatioiden laskemiseen; 
esimerkiksi 52 kortin korttipakasta on mahdollista jakaa 52! / (5! * (52 - 5)!)
erilaisella viiden kortin kättä, ja 40 numeron joukosta voi tehdä yhteensä 
40! / (7! * (40 - 7)!) erilaista 7 numeron lottoriviä.

*/
import java.util.Scanner;

public class Kertoma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        int kertoma = 1;
        if (luku==0){
            System.out.println("Kertoma on 1");
        }else{
            int aloitus = 1;
            while (luku>0){
                kertoma = aloitus * kertoma;
                aloitus++;
                luku--;
            }
            System.out.println("Kertoma on "+kertoma);
        }  
    }
}
