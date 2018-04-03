/*
Tee ohjelma, joka lukee käyttäjältä lukuja ja tulostaa niiden summan. 
Ohjelma lopettaa kyselemisen kun syötetään luku 0. 
Käytä seuraavaa pohjaa, jonka saat myös palautusautomaatilta:

Scanner lukija = new Scanner(System.in);

int summa = 0;
System.out.print("Anna lukuja, nolla lopettaa: ");
while (true) {
    int luettu = Integer.parseInt(lukija.nextLine());
    if (luettu == 0) {
        break;
    }

    // TEE JOTAIN TÄÄLLÄ

}
System.out.println("Summa lopussa: " + summa);

Ohjelman tulee toimia seuraavasti:

Anna lukuja, nolla lopettaa:
3
2
1
1
0
Summa: 7


*/
import java.util.Scanner;

public class UseammanLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;

        System.out.print("Anna lukuja, nolla lopettaa: ");
        while (true) {
            int luettu = Integer.parseInt(lukija.nextLine());
            summa = summa + luettu;
            if (luettu == 0) {
                break;
            }

            // TEE JOTAIN TÄÄLLÄ
        }

        System.out.println("Summa lopussa: " + summa);
    }
}
