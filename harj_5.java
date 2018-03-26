public class SekunnitVuodessa {

    public static void main(String[] args) {

        // Tässä on hieman puolitiehen jäänyt versio vuoden sekunnit
        // laskevasta ohjelmasta. Korjaapa se!
        /*
        

Täydennä tehtäväpohjassa olevaa ohjelmaa siten, että se laskee kuinka monta sekuntia on vuodessa. 
Voit olettaa, että vuodessa on 365 päivää.

Ohjelman tulostus on seuraava:
Vuodessa on X sekuntia.
X:n kohdalle tulee ohjelmasi laskema tulos. Huom! Hyödynnä tässä tehtävässä muuttujia.

        */
        int paiviaVuodessa = 365;
        int tuntejaPaivassa = 24;
        int minuuttejaTunnissa = 60;
        int sekuntejaMinuutissa = 60;
        int sekuntejaVuodessa = paiviaVuodessa * tuntejaPaivassa * minuuttejaTunnissa * sekuntejaMinuutissa;

        // Älä muuta alla olevaa tulostuslausetta (muokkaa vain yllä olevia muuttujia ja laskua)
        System.out.println("Vuodessa on " + sekuntejaVuodessa + " sekuntia.");
    }

}
