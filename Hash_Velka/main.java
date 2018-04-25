/*
Luo luokka Velkakirja, jolla on seuraavat toiminnot:

    konstruktori public Velkakirja() luo uuden velkakirjan
    metodi public void asetaLaina(String kenelle, double maara) tallettaa velkakirjaan merkinnän lainasta tietylle henkilölle.
    metodi public double paljonkoVelkaa(String kuka) palauttaa velan määrän annetun henkilön nimen perusteella. Jos henkilöä ei löydy, palautetaan 0.

Luokkaa käytetään seuraavalla tavalla:

Velkakirja matinVelkakirja = new Velkakirja();
matinVelkakirja.asetaLaina("Arto", 51.5);
matinVelkakirja.asetaLaina("Mikael", 30);

System.out.println(matinVelkakirja.paljonkoVelkaa("Arto"));
System.out.println(matinVelkakirja.paljonkoVelkaa("Joel"));

Yllä oleva esimerkki tulostaisi:

51.5
0.0

Ole tarkkana tilanteessa, jossa kysytään velattoman ihmisen velkaa.

Huom! Velkakirjan ei tarvitse huomioida vanhoja lainoja. 
Kun asetat uuden velan henkilölle jolla on vanha velka, vanha velka unohtuu.

Velkakirja matinVelkakirja = new Velkakirja();
matinVelkakirja.asetaLaina("Arto", 51.5);
matinVelkakirja.asetaLaina("Arto", 10.5);

System.out.println(matinVelkakirja.paljonkoVelkaa("Arto"));

10.5
*/
public class Main {

    public static void main(String[] args) {
        Velkakirja matinVelkakirja = new Velkakirja();
        matinVelkakirja.asetaLaina("Arto", 51.5);
        matinVelkakirja.asetaLaina("Mikael", 30);

        System.out.println(matinVelkakirja.paljonkoVelkaa("Arto"));
        System.out.println(matinVelkakirja.paljonkoVelkaa("Joel"));
/*
        Yllä oleva esimerkki tulostaisi:

        51.5
        0.0
*/
    }
}
