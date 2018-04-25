/*
Osoitteessa http://www.icndb.com/api/ sijaitsee web-sovellus, joka 
tarjoaa Chuck Norris -vitsejä kaikkien vapaaseen käyttöön.

Sovellus tarjoaa muunmuassa mahdollisuuden satunnaisten vitsien hakemiseen 
(osoite http://api.icndb.com/jokes/random) sekä vitsien hakemiseen niihin 
liittyvillä numeerisilla tunnuksilla 
(osoite http://api.icndb.com/jokes/tunnus, missä tunnus on kokonaisluku).

Toteuta sovellus, joka tarjoaa kolme toimintoa. Jos käyttäjä kirjoittaa 
"lopeta", ohjelman suoritus lopetetaan. Jos käyttäjä kirjoittaa 
"satunnainen", ohjelma tulostaa icndb-palvelusta noudetun satunnaisen 
chuck norris vitsin. Jos käyttäjä kirjoittaa "vitsi numero", missä numero on 
kokonaisluku, ohjelma tulostaa icndb-palvelusta noudetun tietyn vitsin.

Huom! Tässä tehtävässä riittää tulostaa palvelun palauttama merkkijono 
kokonaisuudessaan. Merkkijono voi olla esimerkiksi muotoa 
{ "type": "success", "value": { "id": 341, "joke": "Chuck Norris sleeps with a pillow under his gun.", "categories": [] } }.

Ohjelmassa ei ole testejä, eli testit eivät ota kantaa sovelluksen 
rakenteeseen tai tulostuksen ulkoasuun. Palauta sovellus kun se toimii 
koneellasi toivotulla tavalla.
*/
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class ChuckNorrisVitsit {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> vitsi = new ArrayList<>();
        // Toteuta vitsien lukeminen tässä
        // http://api.icndb.com/jokes/random
        // http://api.icndb.com/jokes/tunnus, missä tunnus on kokonaisluku
        while (true){
            System.out.println("Mita tehdaan?");
            String kasky = lukija.nextLine();
            if (kasky.equals("satunnainen")){
            try (Scanner lukija2 = new Scanner(new URL("http://api.icndb.com/jokes/random").openStream())){
                while (lukija2.hasNextLine()){
                    vitsi.add(lukija2.nextLine());
                    System.out.println(vitsi);
                    vitsi.clear();
                }
            }catch (Exception e){
                System.out.println("Virhe"+e.getMessage());
                }
            }
            if (kasky.equals("tunnus")){
                System.out.println("Anna tunnus");
                String tunnus = lukija.nextLine();
                try (Scanner lukija2 = new Scanner(new URL("http://api.icndb.com/jokes/"+tunnus).openStream())){
                    while (lukija2.hasNextLine()){
                        vitsi.add(lukija2.nextLine());
                        System.out.println(vitsi);
                        vitsi.clear();
                }
            }catch (Exception e){
                System.out.println("Virhe "+e.getMessage());
                }
            }
            if (kasky.equals("lopeta")){
                break;
            }
        }
    }
}
