/*
Tehtäväpohjassa on ohjelma, joka lukee käyttäjältä syötteitä. 
Lisää ohjelmaan toiminnallisuus, missä syötteiden lukemisen jälkeen 
kysytään vielä yhtä merkkijonoa. Ohjelma kertoo tämän jälkeen löytyikö 
käyttäjän syöttämä merkkijono listalta vai ei.

Terho
Elina
Aleksi
Mari

Ketä etsitään? Mari
Mari löytyi!

Terho
Elina
Aleksi
Mari

Ketä etsitään? Leevi
Leevi ei löytynyt!
*/
import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoListalta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                System.out.println("Ketä etsitään? ");
                String etsitty = lukija.nextLine();
                if (lista.contains(etsitty)){
                    System.out.println(etsitty+" löytyi");
                }else{
                    System.out.println(etsitty+" ei löytynyt");
                }
                break;
            }

            lista.add(luettu);
        }

    }
}
