/*
osaan ohjelmoida!
jatketaanko (negatiivinen luku lopettaa)? 5
osaan ohjelmoida!
jatketaanko (negatiivinen luku lopettaa)? 2
osaan ohjelmoida!
jatketaanko (negatiivinen luku lopettaa)? -1
kiitos ja kuulemiin.

Tehtävä 28: Uudestaan!

Kirjoita edellä olevaa toistolause-esimerkkiä mukaillen ohjelma, 
joka kysyy käyttäjältä lukuja kunnes käyttäjä syöttää luvun 4.

Syötä luku 5
Syötä luku 744
Syötä luku 22
Syötä luku -1
Syötä luku 4


*/
import java.util.Scanner;

public class Uudestaan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int luku = 1;
        while (luku !=4){
            System.out.println("Syötä luku ");
            luku = Integer.parseInt(lukija.nextLine());
        }

    }
}
