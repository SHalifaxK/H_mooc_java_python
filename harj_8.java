
/*
Kirjoita ohjelma, joka kysyy käyttäjältä lukua. 
Jos luku on positiivinen, tulostetaan "Juupas", jonka jälkeen 
kysytään lukua uudestaan. Jos luku on negatiivinen, tulostetaan "Eipäs" ja 
kysytään lukua uudestaan. Ohjelman suoritus loppuu kun käyttäjä syöttää luvun 0.

Kun mietit minkälaisilla syötteillä ohjelma toimii toivotusti, erilaisia 
toimintoja on 3. Ohjelmaa kannattaa siis testata ainakin kolmella erilaisella 
syötteellä, jonka lisäksi lienee hyvä tarkastaa ohjelman toiminta hyvin 
pienillä (esim. -10000) ja hyvin suurilla syötteillä (10000).

Alla vielä toivottu toiminnallisuus vuokaaviona.
st=>start: Alku io=>inputoutput: lue luku cond=>condition: 
luku > 0 cond2=>condition: luku < 0 io2=>inputoutput: "Juupas" io3=>inputoutput: 
"Eipäs" e=>end: Loppu st->io->cond cond(yes, right)->io2->io cond(no)->cond2 
cond2(yes, right)->io3->io cond2(no)->e

*/
import java.util.Scanner;

public class JuupasEipas {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // kirjoita ohjelma tänne
        System.out.print("Anna lukuja, nolla lopettaa: ");
        while (true){
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku>0){
                System.out.println("Juupas");
            }else if (luku<0){
                System.out.println("Eipäs");
            }else if (luku==0){
                break;
            } 
        }
    }
}
