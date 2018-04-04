/*
Kirjoita metodi public static void jakolasku(int osoittaja, int nimittaja), 
joka tulostaa osoittajan ja nimittäjän 
jakolaskun tuloksen (osoittaja / nimittaja). 
Muistuta mieleen mitä omituisuuksia jakolaskuihin liittyi.

TMC:n mukana tulevat testit eivät testaa metodin toiminnan oikeellisuutta. 
Tässä -- kuten yleensäkin -- on hyvä testata metodin toimintaa itse. 
Ennen kuin testaat metodia, mieti minkälaisilla syötteillä pitäisi 
tulla minkälaisia tulostuksia ja kokeile ainakin kolmea erilaista vaihtoehtoa. 
Testaa myös, että "ei tasan" menevät jakolaskut toimivat oikein.

*/
import java.util.Scanner;

public class Jakolasku {
    
    public static void jakolasku(int osoittaja, int nimittaja){
        double tulos = 1.0*osoittaja/nimittaja;
        System.out.println("Jakolaskun tulos: "+tulos);
    }
    public static void main(String[] args) {
        // Kun olet toteuttanut metodin jakolasku, voit testata
        // sen toimintaa täällä. Esimerkiksi kutsun jakolasku(3,5);
        // pitäisi tulostaa "0.6"
        jakolasku(3,2);
       
    }
}
