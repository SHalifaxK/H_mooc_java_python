/*
Tehtäväpohjassa on valmiina toiminnallisuus vieraslistaohjelmaan, 
missä käyttäjän syöttämien nimien olemassaolo tarkistetaan vieraslistalta.

Ohjelmasta puuttuu kuitenkin toiminnallisuus vieraslistan lukemiseen. 
Muokkaa ohjelmaa siten, että vieraslistan nimet luetaan tiedostosta.

Minkä niminen tiedosto luetaan?
vieraslista.txt

Syötä nimiä, tyhjä rivi lopettaa.
Chuck Norris
Nimi ei ole listalla.
Jack Baluer
Nimi ei ole listalla.
Jack Bauer
Nimi on listalla.
Jack Bower
Nimi on listalla.

Kiitos!

Huom! Tehtäväpohjassa on mukana kaksi tiedostoa, nimet.txt ja toiset-nimet.txt, 
joiden sisällöt ovat seuravat. Älä muuta näiden tiedostojen sisältöä!

nimet.txt:

ada
arto
leena
testi

toiset-nimet.txt:

leo
jarmo
alicia


*/
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class VieraslistaTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        ArrayList<String> lista = new ArrayList<>();
        // toteuta tiedoston lukeminen tässä.
        try (Scanner lukija2 = new Scanner(new File(tiedosto))) {
        System.out.println("");
        while (lukija2.hasNextLine()) {
            lista.add(lukija2.nextLine());
        }
        
        System.out.println("Syötä nimiä, tyhjä rivi lopettaa.");
        while (true) {
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            if (lista.contains(nimi)) {
                System.out.println("Nimi on listalla.");
            }else {
                System.out.println("Nimi ei ole listalla.");
            }
        }
        }catch (Exception e){
            System.out.println("Virhe "+e.getMessage());    
        }
        System.out.println("Kiitos!");
        }    
    }


