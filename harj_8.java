
public class KolmenLuvunKeskiarvo {

    public static void main(String[] args) {
/*
        

Tehtäväpohjassa on ohjelma, jossa on kolme muuttujaa. Ohjelman tulostus on tällä hetkellä seuraava.
eka: 9
toka: 7
kolmas: 6

Muokkaa ohjelmaa siten, että ohjelma tulostaa myös muuttujien keskiarvon.
eka: 9
toka: 7
kolmas: 6
keskiarvo: 7.333333333333333

Huom! Jos muuttujien arvoja muutetaan, tulee myös tulostuksen muuttua.
eka: 5
toka: 7
kolmas: 4
keskiarvo: 5.333333333333333


        */
        int eka = 9;
        int toka = 7;
        int kolmas = 6;
        
        System.out.println("eka: " + eka);
        System.out.println("toka: " + toka);
        System.out.println("kolmas: " + kolmas);
        
        // Toteuta ohjelmasi tähän. Muista käyttää muuttujia eka, toka ja kolmas!
        double keskiarvo = (eka+toka+kolmas)/3.0;
        System.out.println("keskiarvo: "+keskiarvo);
    
    }
}

