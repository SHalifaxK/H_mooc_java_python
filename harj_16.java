/*
Tehtäväpohjassa on ohjelma, joka lukee käyttäjältä syötteitä. 
Muokkaa ohjelman toimintaa siten, että kun syötteiden lukeminen lopetetaan, 
ohjelma tulostaa listalla olevien arvojen lukumäärän.

Terho
Elina
Aleksi
Mari

Yhteensä: 4

Juno
Elizabeth
Mauri
Irene
Outi
Lauri
Iisa
Risto
Markus
Ville
Oskari

Yhteensä: 11

*/
import java.util.ArrayList;
import java.util.Scanner;

public class ListallaOlevienArvojenMaara {

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
        System.out.println("Yhteensä: "+lista.size());
    }
}
