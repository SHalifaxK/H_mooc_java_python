/*
Tehtäväpohjassa on ohjelma, joka lukee käyttäjältä syötteitä. 
Muokkaa ohjelman toimintaa siten, että kun syötteiden lukeminen lopetetaan, 
ohjelma tulostaa sekä ensiksi että viimeksi luetun arvon. Voit olettaa, että 
listalle luetaan vähintään kaksi arvoa.

Terho
Elina
Aleksi
Mari

Terho
Mari

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

Juno
Oskari

*/
import java.util.ArrayList;
import java.util.Scanner;

public class EnsimmainenJaViimeinenArvo {

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
        
        System.out.println(lista.get(0));
        System.out.println(lista.get(lista.size()-1));
    }
}
