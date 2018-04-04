/*
Tee ohjelma, joka kysyy käyttäjältä lukuja (ohjelma tulostaa 
käyttäjälle aluksi "Syötä luvut:"), kunnes käyttäjä antaa luvun -1. 
Kun käyttäjä syöttää luvun -1, ohjelma tulostaa 
"Kiitos ja näkemiin!" ja päättyy.

Syötä luvut:
5
2
4
-1
Kiitos ja näkemiin!

Laajenna edellistä ohjelmaa siten, että ohjelma ilmoittaa käyttäjän syöttämien lukujen summan. (Lukua -1 ei lasketa mukaan.)

Syötä luvut:
5
2
4
-1
Kiitos ja näkemiin!
Summa: 11

Tehtävä 19.3: Lukujen summa ja lukumäärä

Laajenna edellistä ohjelmaa siten, että ohjelma ilmoittaa myös käyttäjien antamien lukujen lukumäärän. (Lukua -1 ei lasketa mukaan.)

Syötä luvut:
5
2
4
-1
Kiitos ja näkemiin!
Summa: 11
Lukuja: 3

Tehtävä 19.4: Lukujen keskiarvo

Muuta edellistä ohjelmaa siten, ohjelma ilmoittaa lukujen keskiarvon. (Lukua -1 ei lasketa mukaan.)

Syötä luvut:
5
2
4
-1
Kiitos ja näkemiin!
Summa: 11
Lukuja: 3
Keskiarvo: 3.666666666666

Tehtävä 19.5: Parilliset ja parittomat

Laajenna edellistä ohjelmaa siten, että ohjelma ilmoittaa parillisten ja parittomien lukujen määrän. (Lukua -1 ei lasketa mukaan.)

Syötä luvut:
5
2
4
-1
Kiitos ja näkemiin!
Summa: 11
Lukuja: 3
Keskiarvo: 3.666666666666
Parillisia: 2
Parittomia: 1

*/
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int count = 0;
        double keskiarvo = 0;
        int paril = 0;
        int parit = 0;
        while (true){
            System.out.println("Syötä luvut: ");
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku==-1){
                System.out.println("Kiitos ja näkemiin");
                System.out.println("Summa: "+ summa);
                System.out.println("Lukuja: "+ count);
                keskiarvo = 1.0*summa/count;
                System.out.println("Keskiarvo: "+keskiarvo);
                System.out.println("Parillisia:"+paril);
                System.out.println("Parittomia:"+parit);
                break;
            }else{
                summa = summa + luku;
                count++;
                if (luku%2==0){
                    paril++;
                }else{
                    parit++;
                }
                continue;
            }
        }
    }
}
