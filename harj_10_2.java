/*
Tehtäväpohjassa on valmiina televisio-ohjelmaa kuvaava luokka Ohjelma. 
Luokalla Ohjelma on oliomuuttujat nimi ja pituus, konstruktori, ja muutamia metodeja.

Toteuta ohjelma, joka ensin lukee käyttäjältä televisio-ohjelmia. 
Kun käyttäjä syöttää tyhjän ohjelman nimen, televisio-ohjelmien lukeminen lopetetaan.

Tämän jälkeen käyttäjältä kysytään ohjelman maksimipituutta. 
Kun käyttäjä on syöttänyt ohjelman maksimipituuden, tulostetaan kaikki ne 
ohjelmat, joiden pituus on pienempi tai yhtäsuuri kuin haluttu maksimipituus.

Nimi: Salatut elämät
Pituus: 30
Nimi: Miehen puolikkaat
Pituus: 30
Nimi: Remppa vai muutto
Pituus: 60
Nimi: House
Pituus: 60

Ohjelman maksimipituus? 30
Salatut elämät, 30 minuuttia
Miehen puolikkaat, 30 minuuttia
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa Ohjelma käyttävä ohjelmasi tänne
        String nimi;
        int pituus;
        int maxpit;
        
        ArrayList<Ohjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        do{
            System.out.println("Anna ohjelman nimi: ");
            nimi = lukija.nextLine();
            if (nimi.isEmpty()){
                break;
            }
            System.out.println("Anna ohjelman pituus: ");
            pituus = Integer.parseInt(lukija.nextLine());
            Ohjelma ohj = new Ohjelma(nimi, pituus);
            ohjelmat.add(ohj);
        }while (!nimi.isEmpty());
        System.out.println("Ohjelman maksimipituus?");
        maxpit = Integer.parseInt(lukija.nextLine());
        for (Ohjelma ohj : ohjelmat){
            if (maxpit==0){
                break;
            }
            if (ohj.getPituus()<=maxpit){
                System.out.println(ohj);
            }
        }       
    }
}
