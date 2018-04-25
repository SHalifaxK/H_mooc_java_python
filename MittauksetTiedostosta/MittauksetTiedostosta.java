/*
Toteuta ohjelma, joka lukee käyttäjältä tiedoston nimen sekä hyväksyttävien 
lukujen ala- ja ylärajan. Tämän jälkeen ohjelma lukee tiedoston sisältämät 
luvut (jokainen luku on omalla rivillään) ja ottaa huomioon vain ne luvut, 
jotka ovat annetulla lukuvälillä. Lopulta ohjelma tulostaa annetulla 
lukuvälillä olleiden lukujen lukumäärän.

Tiedosto? mittaukset-1.txt
Alaraja? 15
Yläraja? 20
Lukuja: 2

Tiedosto? mittaukset-1.txt
Alaraja? 0
Yläraja? 300
Lukuja: 4

Huom! Tehtäväpohjassa on mukana kaksi tiedostoa, mittaukset-1.txt 
ja mittaukset-2.txt, joiden sisällöt ovat seuravat. Älä muuta näiden 
tiedostojen sisältöä.

mittaukset-1.txt:

300
9
20
15

mittaukset-2.txt:

123
-5
12
67
-300
1902
*/
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        
        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.parseInt(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.parseInt(lukija.nextLine());
        try (Scanner lukija2 = new Scanner(new File(tiedosto))){
            while (lukija2.hasNextLine()){
                list.add(lukija2.nextLine());
            }
            for (String i:list){
                if (Integer.parseInt(i)>=alaraja && Integer.parseInt(i)<=ylaraja){
                    System.out.println(i);
                    count++;
                }
            }
            System.out.println("Lukuja: "+count);
        }catch (Exception e){
            System.out.println("Virhe "+e.getMessage());
        }
        
        
    }

}
