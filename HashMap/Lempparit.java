/*
Luo main-metodissa uusi HashMap<String,String>-olio. 
Tallenna luomaasi olioon seuraavien henkilöiden nimet ja lempinimet niin, että 
nimi on avain ja lempinimi on arvo. Käytä pelkkiä pieniä kirjaimia.

    matin lempinimi on mage
    mikaelin lempinimi on mixu
    arton lempinimi on arppa

Tämän jälkeen hae HashMapistä mikaelin lempinimi ja tulosta se.

Testit edellyttävät että kirjoitat nimet pienellä alkukirjaimella.
*/
import java.util.HashMap;

public class Lempinimet {

    public static void main(String[] args) {
        HashMap<String,String> lemppari = new HashMap<>();
        
        lemppari.put("matti", "mage");
        lemppari.put("mikael", "mixu");
        lemppari.put("arto", "arppa");
        
        System.out.println(lemppari.get("mikael"));
        // Tee tehtävänannossa pyydetyt operaatiot täällä!
    }

}
