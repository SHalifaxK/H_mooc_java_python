/*
Tee ohjelma, joka laskee summan 1+2+3+...+n, missä n on käyttäjän syöttämä luku.

Esimerkkitulostuksia:

Mihin asti? 3
Summa on 6

Edellisessä esimerkissä laskettiin 1 + 2 + 3 = 6

Mihin asti? 7
Summa on 28

Ja nyt laskettiin 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28 

*/
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mihin asti? ");
        int asti = Integer.parseInt(lukija.nextLine());
        int i = 1;
        int summa = 0;
        
        while (asti>0){
            summa = summa + i;
            i++;
            asti--;
        }
        System.out.println("Summa on "+summa);
    }
}
