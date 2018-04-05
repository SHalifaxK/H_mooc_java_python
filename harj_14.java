/*
Ohjelmaan on toteutettu valmiina pohja, joka lukee käyttäjältä syötteitä 
listalle. Syötteiden lukeminen päätetään kun käyttäjä syöttää tyhjän 
merkkijonon.

Ohjelma tulostaa tämän jälkeen listan ensimmäisen arvon. 
Muokkaa ohjelmaa siten, että ensimmäisen arvon sijaan tulostetaan kolmas arvo. 
Huomaa, että ohjelmoijat aloittavat laskemisen nollasta! Ohjelma saa rikkoutua 
rikkoutua jos listalla ei ole vähintään kolmea arvoa. Tarkastele minkälainen 
virheilmoitus ohjelmasta tällöin tulee.

Terho
Elina
Aleksi
Mari

Aleksi

Elina
Aleksi
Mari

Mari
*/
import java.util.ArrayList;
import java.util.Scanner;

public class TietynArvonTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            lista.add(luettu);
        }

        System.out.println(lista.get(2));
    }
}
