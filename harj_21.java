/*
Pääohjelma kysyy käyttäjältä, montako kertaa teksti tulostetaan 
eli montako kertaa metodia kutsutaan.

Ohjelman tulostus:

Kuinka monta?
7
Alussa olivat suo, kuokka ja Java.
Alussa olivat suo, kuokka ja Java.
Alussa olivat suo, kuokka ja Java.
Alussa olivat suo, kuokka ja Java.
Alussa olivat suo, kuokka ja Java.
Alussa olivat suo, kuokka ja Java.
Alussa olivat suo, kuokka ja Java.

*/
import java.util.Scanner;

public class MontaTulostusta {
 
    public static void tulostaTeksti() {
        System.out.println("Alussa olivat suo, kuokka ja Java.");
    }

    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Kuinka monta? ");
        int kertoja = Integer.parseInt(lukija.nextLine());
        while (kertoja>0){
            tulostaTeksti();
            kertoja--;
        }
    }
}
