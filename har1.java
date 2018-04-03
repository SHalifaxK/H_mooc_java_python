/*
Kaverisi on hahmotellut summaamiseen ja ehtolauseen toimintaan 
liittyvää testiohjelmaa. Testiohjelmassa ohjelman alussa luettuun 
lukuun lisätään käyttäjältä luettu toinen luku. Luvun lisäämisen tulee 
tapahtua vain jos toisena luettu luku on positiivinen.

Ohjelma ei tällä hetkellä kuitenkaan toimi ihan toivotusti ja 
siinä näkyy punaista. Kaverisi ohjelma näyttää seuraavalta:

Korjaa kaverisi ohjelma. Alla esimerkkitulosteita toimivasta ohjelmasta.

32
7
Summa: 39

9
-3
Summa: 9


*/
import java.util.Scanner;

public class PositiivisenLuvunLisaaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luettu1 = Integer.parseInt(lukija.nextLine());
        int summa = 0;
        
        if (luettu1 > 0) {
            summa += luettu1;
        }
        
        int luettu2 = Integer.parseInt(lukija.nextLine());
        
        if (luettu2 > 0) {
            summa += luettu2;
        }
        
        System.out.println("Summa: " + summa);
    }
}
