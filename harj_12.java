/*
Toteuta ohjelma, missä käyttäjän tulee arvata välillä 1-10 oleva luku. 
Aseta pelin arvattavaksi luvuksi 7.
Ohjelman suoritus loppuu kun käyttäjä arvaa oikean luvun (eli 7). 
Jos käyttäjä syöttää luvun, joka on suurempi kuin 10 tai pienempi kuin 1, 
käyttäjälle kerrotaan ettei hänen syöttämänsä luku ollut kelvollinen.

Ohjelman tulee kertoa käyttäjälle käyttäjän tekemien kelvollisten arvausten 
määrä. Välille 1-10 osuvat arvaukset lasketaan kelvollisiksi, mukaan lukien 
oikea arvaus.

Minäpä tiedän luvun väliltä 1-10, jota sinä et tiedä!

Arvaa luku: 5
Ei ollut!
Arvaa luku: 28
Epäkelpo luku!
Arvaa luku: 10
Ei ollut!
Arvaa luku: 7

Oikein! Arvauksia yhteensä: 3

Kun saat ohjelman valmiiksi, palauta se. Voit halutessasi tämän jälkeen 
kokeilla pelin pelaamista myös satunnaisilla luvuilla. 
Välillä 1-10 olevan satunnaisen luvun arpominen onnistuu seuraavasti:
int luku = (int) (1 + Math.random() * 10);
*/
import java.util.Scanner;

public class Arvauspeli {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int arvattava = 7;
        int maara = 0;
        
        System.out.println("Minäpä tiedän luvun väliltä 1-10, jota sinä et tiedä!");
        while (true){
            System.out.println("Arvaa luku: ");
            int arvaus = Integer.parseInt(lukija.nextLine());
            if (arvaus<1 || arvaus>10){
                System.out.println("Epäkelpo luku!");
            }else if (arvaus==arvattava){
                maara++;
                System.out.println("Oikein! Arvauksia yhteensä: "+ maara);
                break;
            }else{
                System.out.println("Ei ollut!");
                maara++;
            }
        }
    }
}
