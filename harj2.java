/*
Tee metodi pienin, joka palauttaa parametrina saamistaan luvuista 
pienemmän arvon. 

public static int pienin(int luku1, int luku2) {
    // kirjoita koodia tähän
    // älä tulosta metodin sisällä mitään

    // lopussa oltava komento return
}

public static void main(String[] args) {
    int vastaus =  pienin(2, 7);
    System.out.println("Pienin: " + vastaus);
}

Ohjelman tulostus:

Pienin: 2
*/
public class Pienin {
    public static int pienin(int luku1, int luku2) {
        int pienin = 0;
        if (luku1>luku2){
            pienin = luku2;
        }else{
            pienin = luku1;
        }
            
        // älä tulosta metodin sisällä mitään
        // lopussa oltava komento return
        return pienin;
    }

    public static void main(String[] args) {
        int vastaus = pienin(2, 7);
        System.out.println("Pienin: " + vastaus);
    }
}

