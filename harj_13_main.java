/*
Tehtävässä tehdään puhelinmuistio.
Tehtävä 13.1: Henkilö

Tee ensin luokka Henkilo. Luokan tulee toimia seuraavan esimerkin osoittamalla tavalla:

Henkilo pekka = new Henkilo("Pekka Mikkola", "040-123123");

System.out.println(pekka.getNimi());
System.out.println(pekka.getNumero());

System.out.println(pekka);

pekka.vaihdaNumeroa("050-333444");
System.out.println(pekka);

Tulostuu:

Pekka Mikkola
040-123123
Pekka Mikkola  puh: 040-123123
Pekka Mikkola  puh: 050-333444

Tee siis luokalle

    metodi public String toString(), joka palauttaa henkilön merkkijonoesityksen (yo. esimerkin tapaan muotoiltuna)
    konstruktori, jolla asetetaan henkilölle nimi ja puhelinnumero
    public String getNimi(), joka palauttaa nimen
    public String getNumero(), joka palauttaa puhelinnumeron
    metodi public void vaihdaNumeroa(String uusiNumero), joka muuttaa henkilön puhelinnumeroa

Tehtävä 13.2: Henkilöiden lisäys puhelinmuistioon

Tee luokka Puhelinmuistio joka tallettaa sisällään olevaan ArrayListiin Henkilo-olioita. 
Tässä vaiheessa luokalle tehdään seuraavat metodit:

    public void lisaa(String nimi, String numero) luo Henkilo-olion ja lisää sen puhelinmuistion ArrayListiin.
    public void tulostaKaikki(), tulostaa puhelinmuistion sisällön

Esimerkki muistion toiminnasta:

Puhelinmuistio muistio = new Puhelinmuistio();

muistio.lisaa("Pekka Mikkola", "040-123123");
muistio.lisaa("Antti Laaksonen", "045-456123");
muistio.lisaa("Juhana Laurinharju", "050-222333");

muistio.tulostaKaikki();

Ohjelman tulostus oikein toteutetuilla luokilla on:

Pekka Mikkola  puh: 040-123123
Antti Laaksonen  puh: 045-456123
Juhana Laurinharju  puh: 050-222333

Tehtävä 13.3: Numerojen haku muistiosta

Tehdään puhelinmuistiolle metodi public String haeNumero(String nimi), 
joka palauttaa parametrina annetun henkilön numeron. Jos henkilö ei ole 
muistiossa, palautetaan merkkijono "numero ei tiedossa". Esimerkki metodin toiminnasta:

Puhelinmuistio muistio = new Puhelinmuistio();
muistio.lisaa("Pekka Mikkola", "040-123123");
muistio.lisaa("Antti Laaksonen", "045-456123");
muistio.lisaa("Juhana Laurinharju", "050-222333");

String numero = muistio.haeNumero("Pekka Mikkola");
System.out.println(numero);

numero = muistio.haeNumero("Martti Tienari");
System.out.println(numero);

Tulostuu:

040-123123
numero ei tiedossa
*/
public class Paaohjelma {

    public static void main(String[] args) {
       
        Puhelinmuistio muistio = new Puhelinmuistio();
        muistio.lisaa("Pekka Mikkola", "040-123123");
        muistio.lisaa("Antti Laaksonen", "045-456123");
        muistio.lisaa("Juhana Laurinharju", "050-222333");

        String numero = muistio.haeNumero("Pekka Mikkola");
        System.out.println(numero);

        numero = muistio.haeNumero("Martti Tienari");
        System.out.println(numero);
/*
Tulostuu:

040-123123
numero ei tiedossa
*/        

// tee tänne koodia jolla testaat ohjelmoimiesi luokkien Henkilo ja Puhelinmuistio toimintaa
    }
}
