/*
Täydennä tehtäväpohjassa olevaa metodia summa siten, että se laskee 
ja palauttaa parametrina olevien lukujen summan.

Tee metodi seuraavaan runkoon:

public static int summa(int luku1, int luku2, int luku3, int luku4) {
    // kirjoita koodia tähän
    // muista että metodissa on oltava (lopussa) return!
}

public static void main(String[] args) {
    int vastaus = summa(4, 3, 6, 1);
    System.out.println("Summa: " + vastaus);
}

Ohjelman tulostus:

Summa: 14
*/
public class LukujenSumma {

    public static int summa(int luku1, int luku2, int luku3, int luku4) {
        int summa = luku1+luku2+luku3+luku4;
        return summa;
    }

    public static void main(String[] args) {
        int vastaus = summa(4, 3, 6, 1);
        System.out.println("Summa: " + vastaus);
    }
}
