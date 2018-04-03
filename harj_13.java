/*
Toteuta ohjelma, missä käyttäjän tulee arvata välillä 1-100 oleva luku. 
Aseta pelin arvattavaksi luvuksi 42.
Ohjelman suoritus loppuu kun käyttäjä arvaa oikean luvun (eli 42). 
Jos käyttäjä syöttää luvun, joka on suurempi kuin 100 tai pienempi kuin 1, 
käyttäjälle kerrotaan ettei hänen syöttämänsä luku ollut kelvollinen.
Jos käyttäjä syöttää luvun, joka on pienempi kuin arvattava luku, 
käyttäjälle kerrotaan että arvattava luku on suurempi. 
Jos taas käyttäjä syöttää luvun, joka on suurempi kuin arvattava luku, 
käyttäjälle kerrotaan että arvattava luku on pienempi.

Ohjelman tulee kertoa käyttäjälle myös tehtyjen kelvollisten arvausten määrä.

Minäpä tiedän luvun väliltä 1-100, jota sinä et tiedä!

Arvaa luku: 5
Lukuni on isompi!
Arvaa luku: 25
Lukuni on isompi!
Arvaa luku: 450
Epäkelpo luku!
Arvaa luku: 50
Lukuni on pienempi!
Arvaa luku: 45
Lukuni on pienempi!
Arvaa luku: 40
Lukuni on isompi!
Arvaa luku: 42

Oikein! Arvauksia yhteensä: 6

Kun saat ohjelman valmiiksi, palauta se. Voit halutessasi tämän jälkeen 
kokeilla pelin pelaamista myös satunnaisilla luvuilla. Välillä 1-100 olevan 
satunnaisen luvun arpominen onnistuu seuraavasti:

int luku = (int) (1 + Math.random() * 100);
*/
import java.util.Scanner;

public class VihjaavaArvauspeli {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // kun olet palauttanut tehtävän ja saanut siitä pisteet,
        // kokeile myös seuraavaa: 
        // int arvattava = (int) (1 + Math.random() * 100);

        int arvattava = 42;
        int arvauksia = 0;
        System.out.println("Minäpä tiedän luvun väliltä 1-100, jota sinä et tiedä!");
        while (true){
            System.out.println("Arvaa luku: ");
            int arvaus = Integer.parseInt(lukija.nextLine());
            if (arvaus<1 || arvaus>100){
                System.out.println("Epäkelpo luku!");
            }else{
                if (arvaus<arvattava){
                    System.out.println("Lukuni on isompi!");
                    arvauksia++;
                }else if (arvaus>arvattava){
                    System.out.println("Lukuni on pienempi!");
                    arvauksia++;
                }else{
                    arvauksia++;
                    System.out.println("Oikein! Arvauksia yhteensä: "+arvauksia);
                    break;
                }
                
            }
        }
    }
}
