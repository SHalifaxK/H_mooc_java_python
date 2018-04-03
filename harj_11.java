/*
Toteuta ohjelma Mars-planeetan lämpötilamittausten tarkasteluun. 
Marsin alin lämpötila (pinnalla) on -140 astetta, korkein lämpötila on 
20 astetta. Ohjelmalle syötetään mittauksia kunnes käyttäjä syöttää luvun 9999.
Tämän jälkeen kerrotaan lämpötilamittausten keskiarvo.

Jos et muista miten keskiarvo lasketaan, tutustu aiheen Wikipedia-sivuun.

Jos käyttäjä syöttää luvun, joka on pienempi kuin -140 tai suurempi kuin 20, 
lukua ei huomioida lämpötilan keskiarvon laskemisessa.

Syötä mittaus: -41
Syötä mittaus: -11
Syötä mittaus: 23
Syötä mittaus: 2
Syötä mittaus: -14
Syötä mittaus: -22
Syötä mittaus: -45
Syötä mittaus: 9999

Mittausten keskiarvo: -21.833333333333332
*/
import java.util.Scanner;

public class MarsinLampotilanKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int maara = 0;
        
        while (true){
            System.out.println("Syötä mittaus: ");
            int luku = Integer.parseInt(lukija.nextLine());
            
            if (luku>=-140 && luku<=20){
                summa = summa + luku;
                maara++;
                continue;
            }
            if (luku==9999){
                break;
            }
          
        }
        double kArvo = 1.0* summa/maara;
        System.out.println("Mittausten keskiarvo: "+kArvo);

    }
}

