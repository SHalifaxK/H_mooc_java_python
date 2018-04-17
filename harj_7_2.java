/*
Luo luokka Tuote joka esittää kaupan tuotetta jolla on hinta, lukumäärä ja nimi.
Anna luokan nimeksi (Class Name) Tuote.

Luokalla tulee olla:
Konstruktori public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa)
Metodi public void tulostaTuote() joka tulostaa tuotteen tiedot tässä muodossa:

    Banaani, hinta 1.1, 13 kpl
*/
public class Main {

    public static void main(String[] args) {
        // Tämä on vain tyhjä main-metodi jossa voit kokeilla
        // Tuote-luokkaasi. Kokeile esim:

        Tuote tuote = new Tuote("Banaani", 1.1, 13);
        tuote.tulostaTuote();
    }
}
