/*
Muuta edellistä tehtävää siten, että käyttäjä määrää summan 
laskemisen aloituskohdan. Voit olettaa, että käyttäjä antaa ensin pienemmän 
luvun ja sitten suuremman luvun.

Esimerkkitulostuksia:

Ensimmäinen: 3
Viimeinen: 5
Summa on 12

Edellisessä laskettiin 3 + 4 + 5 = 12

Ensimmäinen: 2
Viimeinen: 8
Summa on 35

Ja nyt laskettiin 2 + 3 + 4 + 5 + 6 + 7 + 8 = 35
*/
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Ensimmäinen: ");
        int eka = Integer.parseInt(lukija.nextLine());
        System.out.println("Viimeinen: ");
        int toka = Integer.parseInt(lukija.nextLine());
        
        int summa = 0;
        int ero = toka - eka + 1;
        
        while (ero>0){
            summa = summa + toka;
            toka--;
            ero--;
        }
        System.out.println("Summa on "+summa);
    }
}
