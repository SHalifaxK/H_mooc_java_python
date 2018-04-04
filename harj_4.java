
/*
Tee metodi keskiarvo, joka laskee parametrina olevien lukujen keskiarvon. 
Metodin sisällä tulee käyttää apuna edellä tehtyä metodia summa!

Tee metodi seuraavaan runkoon:

public static int summa(int luku1, int luku2, int luku3, int luku4) {
    // voit kopioida metodin summa toteutuksen tänne
}

public static double keskiarvo(int luku1, int luku2, int luku3, int luku4) {
    // kirjoita koodia tähän
    // laske alkioiden summa kutsumalla metodia summa
}

public static void main(String[] args) {
    double vastaus = keskiarvo(4, 3, 6, 1);
    System.out.println("Keskiarvo: " + vastaus);
}

Ohjelman tulostus:

Keskiarvo: 3.5
*/
public class LukujenKeskiarvo {

    // toteuta tähän uudelleen aiemmassa tehtävässä tekemäsi metodi
    public static int summa(int luku1, int luku2, int luku3, int luku4) {
        int summa = luku1+luku2+luku3+luku4;
        return summa;
    }

    public static double keskiarvo(int luku1, int luku2, int luku3, int luku4) {
        int sum = summa(luku1,luku2,luku3,luku4);
        double karvo = 1.0*sum/4;
        return karvo;
    }

    public static void main(String[] args) {
        double vastaus = keskiarvo(4, 3, 6, 1);
        System.out.println("Keskiarvo: " + vastaus);
    }
}
