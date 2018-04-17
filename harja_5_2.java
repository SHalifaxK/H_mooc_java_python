/*
Luo luokka nimeltä Pilli. Pillillä on oliomuuttujina private String aani. 
Luo tämän jälkeen konstruktori public Pilli(String pillinAani), 
minkä avulla luodaan uusi pilli, jolle annetaan ääni.

Lisää pillille vielä metodi public void soi(), joka tulostaa pillin äänen.

Pillin tulee toimia seuraavasti.

Pilli sorsapilli = new Pilli("Kvaak");
Pilli kukkopilli = new Pilli("Peef");

sorsapilli.soi();
kukkopilli.soi();
sorsapilli.soi();

Kvaak
Peef
Kvaak
*/
public class Main {

    public static void main(String[] args) {
        // Tämä on vain tyhjä main-metodi jossa voit kokeilla
        // Pilli-luokkaasi. Kokeile esim:

        Pilli sorsapilli = new Pilli("Kvaak");
        Pilli kukkopilli = new Pilli("Peef");

        sorsapilli.soi();
        kukkopilli.soi();
        sorsapilli.soi();
    }
}
