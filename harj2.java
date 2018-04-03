/*
Työntekijän eläkevakuutus (TyEL) on lakisääteinen ja pakollinen maksu, 
jolla rahoitetaan suurin osa nykyisistä ja tulevista työeläkkeistä. 
Työntekijän eläkevakuutuksen maksamisesta vastaa sekä työnantaja että 
työntekijä: Eläketurvakeskuksen mukaan työnantajan maksama TyEL-maksu 
on vuonna 2017 noin 18% työntekijän palkasta, kun taas työntekijä maksaa 
palkastaan TyEL-maksua noin 6%.

Työnantaja maksaa osuutensa bruttopalkan lisäksi, kun taas työntekijän 
maksama osuus otetaan bruttopalkasta (eli palkasta ennen ennakonpidätyksiä, 
vakuutusmaksuja ja muita vähennyksiä).

Toteuta ohjelma, joka kertoo TyEL-kulut annetulle bruttopalkalle. 
Ohjelman tulee kertoa annetun bruttopalkan perusteella työnantajan 
maksut sekä palkasta tehtävät pidätykset. Käytä edellä annettuja vuoden 
2017 arvioita (työnantajan osuus 18% ja työntekijän osuus 6%).

Syötä bruttopalkka: 800
Työnantaja maksaa TyEL-maksuja: 144
Työntekijän kustannus työnantajalle vähintään: 944

Työntekijä maksaa TyEL-maksuja: 48
Työntekijän palkka TyEL-maksun jälkeen: 752

TyEL-kulut yhteensä: 192

Syötä bruttopalkka: 1000
Työnantaja maksaa TyEL-maksuja: 180
Työntekijän kustannus työnantajalle vähintään: 1180

Työntekijä maksaa TyEL-maksuja: 60
Työntekijän palkka TyEL-maksun jälkeen: 940

TyEL-kulut yhteensä: 240

Tulostuksessa saa halutessaan käyttää myös desimaalilukuja. 
*/
import java.util.Scanner;

public class TyontekijanElakevakuutus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Syötä bruttopalkka: ");
        double palkka = Double.parseDouble(lukija.nextLine());
        double maksuTyo = 0.18*palkka; 
        System.out.println("Työnantaja maksaa TyEL-maksuja: "+maksuTyo);
        double kokKust = maksuTyo+palkka;
        System.out.println("Työntekijän kustannus työnantajalle vähintään: "+ kokKust);
        double tyotel = 0.06*palkka;
        System.out.println("Työntekijä maksaa TyEL-maksuja: "+ tyotel);
        double kateen = palkka-tyotel;
        System.out.println("Työntekijän palkka TyEL-maksun jälkeen: "+kateen);
        double telYht = maksuTyo + tyotel;
        System.out.println("TyEL-kulut yhteensä: "+telYht);
        
    }
}
