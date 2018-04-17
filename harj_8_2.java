/*
Tässä tehtävässä on useampi osa. Jokainen osa vastaa yhtä tehtäväpistettä.

Tehtäväpohjan mukana tulee osittain valmiiksi toteutettu luokka VahenevaLaskuri:

public class VahenevaLaskuri {
    private int arvo;   // oliomuuttuja joka muistaa laskurin arvon

    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
    }

    public void tulostaArvo() {
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
        // kirjoita tänne metodin toteutus
        // laskurin arvon on siis tarkoitus vähentyä yhdellä
    }

    // ja tänne muut metodit
}

Seuraavassa esimerkki miten pääohjelma käyttää vähenevää laskuria:

public class Paaohjelma {
    public static void main(String[] args) {
        VahenevaLaskuri laskuri = new VahenevaLaskuri(10);

        laskuri.tulostaArvo();

        laskuri.vahene();
        laskuri.tulostaArvo();

        laskuri.vahene();
        laskuri.tulostaArvo();
    }
}

Pitäisi tulostua:

arvo: 10
arvo: 9
arvo: 8

VahenevaLaskuri-luokan konstruktorille annetaan parametrina alkuarvo. 
Esimerkin oliota laskuri luodessa laskurille välitetään parametrina arvo 10. 
Esimerkin laskuri-olioon liittyvään oliomuuttujaan arvo asetetaan siis aluksi 
arvo 10. Laskurin arvon voi tulostaa metodilla tulostaArvo(). 
Laskurilla tulee myös olla metodi vahene() joka vähentää 
laskurin arvoa yhdellä.
Tehtävä 8.1: Metodin vahene() toteutus

Täydennä luokan runkoon metodin vahene() toteutus sellaiseksi, 
että se vähentää kutsuttavan olion oliomuuttujan arvo arvoa yhdellä. 
Kun olet toteuttanut metodin vahene(), edellisen esimerkin pääohjelman 
tulee toimia esimerkkitulosteen mukaan.

Tehtävä 8.2: Laskurin arvo ei saa olla negatiivinen

Täydennä metodin vahene() toteutus sellaiseksi, 
ettei laskurin arvo mene koskaan negatiiviseksi. 
Eli jos laskurin arvo on jo 0, ei vähennys sitä enää vähennä. 
Ehtolause auttaa tässä.

public class Paaohjelma {
    public static void main(String[] args) {
        VahenevaLaskuri laskuri = new VahenevaLaskuri(2);

        laskuri.tulostaArvo();

        laskuri.vahene();
        laskuri.tulostaArvo();

        laskuri.vahene();
        laskuri.tulostaArvo();

        laskuri.vahene();
        laskuri.tulostaArvo();
    }
}

Tulostuu:

arvo: 2
arvo: 1
arvo: 0
arvo: 0

Tehtävä 8.3: Laskurin arvon nollaus

Tee laskurille metodi public void nollaa() joka nollaa laskurin arvon, esim:

public class Paaohjelma {
    public static void main(String[] args) {
        VahenevaLaskuri laskuri = new VahenevaLaskuri(100);

        laskuri.tulostaArvo();
 
        laskuri.nollaa();
        laskuri.tulostaArvo();

        laskuri.vahene();
        laskuri.tulostaArvo();
    }
}

Tulostuu:

arvo: 100
arvo: 0
arvo: 0

Tehtävä 8.4: Laskurin arvon palautus

Tee laskurille metodi public void palautaAlkuarvo(), 
joka palauttaa laskurille arvon joka sillä oli alussa:

public class Paaohjelma {
    public static void main(String[] args) {
        VahenevaLaskuri laskuri = new VahenevaLaskuri(100);

        laskuri.tulostaArvo();

        laskuri.vahene();
        laskuri.tulostaArvo();

        laskuri.vahene();
        laskuri.tulostaArvo();

        laskuri.nollaa();
        laskuri.tulostaArvo();

        laskuri.palautaAlkuarvo();
        laskuri.tulostaArvo();
    }
}

Tulostuu:

arvo: 100
arvo: 99
arvo: 98
arvo: 0
arvo: 100

Vihje jotta alkuarvon voi palauttaa, se täytyy "muistaa" toisen 
oliomuuttujan avulla! Joudut siis lisäämään ohjelmaan toisen oliomuuttujan 
johon talletetaan laskurin alussa saama arvo.
*/
public class Paaohjelma {

    public static void main(String[] args) {
        VahenevaLaskuri laskuri = new VahenevaLaskuri(10);

        laskuri.tulostaArvo();
        laskuri.vahene();
        laskuri.vahene();
    }
}
