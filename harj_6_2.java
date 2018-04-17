/*
Luo luokka nimeltä Ovi. Ovella ei ole oliomuuttujia. 
Luo sille parametriton konstruktori (tai käytä oletuskonstruktoria). 
Luo tämän jälkeen ovelle metodi public void koputa(), jota kutsuttaessa 
tulostuu viesti "Who's there?".

Oven tulee toimia seuraavasti.

Ovi alexander = new Ovi();

alexander.koputa();
alexander.koputa();

Who's there?
Who's there?
*/
public class Main {

    public static void main(String[] args) {
        // Tämä on vain tyhjä main-metodi jossa voit kokeilla
        // Ovi-luokkaasi. Kokeile esim:

        Ovi alexander = new Ovi();

        alexander.koputa();
        alexander.koputa();
    }
}
