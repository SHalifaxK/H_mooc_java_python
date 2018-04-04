/*
Tässä tehtävässä luodaan ohjelma joka kyselee käyttäjältä salasanaa. 
Jos salasana menee oikein, nähdään salainen viesti.

Anna salasana: nauris
Väärin!
Anna salasana: lanttu
Väärin!
Anna salasana: porkkana
Oikein!

Salaisuus on: znvavbfgv grugl!

Toteutetaan ohjelma kolmessa askeleessa.
Tehtävä 9.1: Salasanan kysyminen

Ohjelmarunkoon on määritelty muuttuja String salasana, 
jolle on asetettu arvoksi porkkana -- älä muuta tätä salasanaa. 
Toteuta lisätoiminnallisuus, jossa ohjelma kysyy käyttäjältä salasanaa ja 
vertailee sitä muuttujassa salasana olevaan arvoon. 
Muista mitä erityistä merkkijonojen vertailussa on!

Anna salasana: nauris
Väärin!

Anna salasana: porkkana
Oikein!

Anna salasana: bataatti
Väärin!

Tehtävä 9.2: Salasanan kysyminen kunnes käyttäjä vastaa oikein

Muokkaa ohjelmaa siten, että se kysyy salasanaa kunnes käyttäjä syöttää 
oikean salasanan. Toteuta salasanan jatkuva kysyminen 
while (true) { ... } -toistolausekkeen avulla. Toistolausekkeesta pääsee pois, 
jos ja vain jos käyttäjän syöttämä salasana on sama kuin muuttujassa salasana '
oleva arvo.

Anna salasana: nauris
Väärin!
Anna salasana: lanttu
Väärin!
Anna salasana: porkkana
Oikein!

Tehtävä 9.3: Salainen viesti

Lisää ohjelmaan oma salainen viestisi joka näytetään kun käyttäjä kirjoittaa 
salasanan oikein. Se voi olla mitä tahansa!

Anna salasana: nauris
Väärin!
Anna salasana: lanttu
Väärin!
Anna salasana: porkkana
Oikein!

Salaisuus on: znvavbfgv grugl!

Ylläoleva salaisuus on salattu käyttäen Rot13-algoritmia.
*/
import java.util.Scanner;

public class Salasana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String salasana = "porkkana";
        // käytä porkkanaa salasanana testejä ajaessasi!
        while (true){
            System.out.println("Anna salasana: ");
            String kSala = lukija.nextLine();
            if (salasana.equals(kSala)){
                System.out.println("Oikein!");
                System.out.println("Salaisuus on: znvavbfgv grugl!");
                break;
            }else{
                System.out.println("Väärin!");
            }
        
        }
     
    }
}
