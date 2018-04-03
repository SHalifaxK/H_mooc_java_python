/*
Toteuta ohjelma, joka lukee käyttäjän antamia syötteitä ja laskee 
kelvollisten lukujen summan. Luku on kelvollinen, jos se on suurempi 
tai yhtäsuuri kuin -140 ja pienempi tai yhtäsuuri kuin 20. 
Lopeta syötteiden lukeminen kun käyttäjä syöttää luvun 9999.

Jos käyttäjä syöttää luvun, joka on pienempi kuin -140 tai suurempi 
kuin 20, hänelle kerrotaan ettei syötetty luku ollut kelvollinen.

Syötä luku: 5
Syötä luku: 22
Kelvoton luku
Syötä luku: -11
Syötä luku: -140
Syötä luku: -18
Syötä luku: 9999

Kelvollisia lukuja yhteensä: 4
*/
import java.util.Scanner;

public class KelvollistenLukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        while (true){
            System.out.println("Syötä luku: ");
            int luku = Integer.parseInt(lukija.nextLine());
            
            if (luku>=-140 && luku<=20){
                summa = summa + luku;
                continue;
            }
            if (luku==9999){
                break;
            }
            if (luku<-140 || luku>20){
                System.out.println("Kelvoton luku");
            }
        }
        System.out.println("Kelvollisten lukujen summa: "+summa);

    }
}

