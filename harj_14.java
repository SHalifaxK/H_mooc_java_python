/*
Kirjoita ohjelma, joka tulostaa kokonaisluvut 1:stä käyttäjän 
antamaan lukuun asti.

Mihin asti? 3
1
2
3

Mihin asti? 5
1
2
3
4
5

Lisää ohjelmaan käyttäjältä kysyttävä alaraja.

Mihin asti? 8
Mistä lähtien? 5
5
6
7
8

Jos tavoite on suurempi kuin lähtökohta ei tulostu mitään:

Mihin asti? 12
Mistä lähtien? 16

*/
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
 
        System.out.println("Mihin asti? ");
        int asti = Integer.parseInt(lukija.nextLine());
        System.out.println("Mistä lähtien? ");
        int lahtien = Integer.parseInt(lukija.nextLine());
        while (asti>=lahtien){
            System.out.println(lahtien);
            lahtien++;
        }
    }
}
