/*
Tehtäväpohjassa on toistolausetta käyttävä ohjelma, joka lukee 
käyttäjältä viisi lukua ja tulostaa niiden summan. Muokkaa ohjelmaa 
siten, että ohjelma voi lukea lähes rajattoman määrän lukuja: 
lukeminen tulee lopettaa vasta kun käyttäjä syöttää luvun 0. 
*/
import java.util.Scanner;

public class Summaaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int luettujaLukuja = 0;

        System.out.print("Anna summattavia lukuja: ");
        while (true) {
            int luettu = Integer.parseInt(lukija.nextLine());
            if (luettu == 0){
                break;
            }
            /*luettujaLukuja = luettujaLukuja + 1;
            if (luettujaLukuja == 5) {
                break;
            }
            */
            summa += luettu;
        }

        System.out.println("Summa lopussa: " + summa);

    }
}
