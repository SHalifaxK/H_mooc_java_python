/*
Tehtäväpohjassa tulee mukana ohjelma, joka kysyy käyttäjältä kahta merkkijonoa. 
Tämän jälkeen ohjelma tulostaa indeksit, joista toinen merkkijono löytyy 
ensimmäisessä merkkijonossa. Ohjelman esimerkkitulostus on seuraava:

Mistä haetaan: ski-bi dibby dib yo da dub dub
Mitä haetaan: dib
Merkkijono dib löytyy kohdasta 7
Merkkijono dib löytyy kohdasta 13

Muokaa ohjelmaa siten, että ohjelma ei tulosta esiintymiskohtia, 
mutta tulostaa esiintymiskertojen yhteislukumäärän. 
Ohjelman tulee muokkauksen jälkeen toimia seuraavasti:

Mistä haetaan: ski-bi dibby dib yo da dub dub
Mitä haetaan: dib
Merkkijonon dib esiintymiskertoja: 2
*/
import java.util.Scanner;

public class MontakoKertaaMerkkijonossa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Mistä haetaan: ");
        String merkkijono = lukija.nextLine();
        System.out.print("Mitä haetaan: ");
        String haettava = lukija.nextLine();

        int indeksi = 0;
        int lukumaara = 0;
        while (indeksi < merkkijono.length()) {
            int kohta = merkkijono.indexOf(haettava, indeksi);

            if (kohta == -1) {
                break;
            }else {
                lukumaara++;
            }


            indeksi = kohta + 1;
        }
        System.out.println("Merkkijonon "+haettava+" esiintymiskertoja: " + lukumaara);
    }
}

