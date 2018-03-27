
import java.util.Scanner;

public class ReilutPitsabileet {
/*
Nea ja Vilma järjestävät reiluja pitsabileitä. Reilut pitsabileet ovat kuin 
normaalit pitsabileet, mutta reiluissa pitsabileissä kaikki saavat täsmälleen 
saman määrän pitsapaloja. Tehtävänäsi on kirjoittaa ohjelma, joka laskee 
ylijäävien pitsan palojen määrän.

Montako osallistujaa? 5
Montako pitsaa? 2
Montako palaa per pitsa? 6

Paloja jää yli: 2

Montako osallistujaa? 14
Montako pitsaa? 2
Montako palaa per pitsa? 6

Paloja jää yli: 12
*/
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Montako osallistujaa? ");
        int osallistujat = Integer.parseInt(lukija.nextLine());
        System.out.println("Montako pitsaa? ");
        int pitsoja = Integer.parseInt(lukija.nextLine());
        System.out.println("Montako plaa per pitsa? ");
        int paloja = Integer.parseInt(lukija.nextLine());
        int ylim = (pitsoja * paloja) % osallistujat;
        System.out.println("Paloja jää yli: "+ ylim);
                
    }
}
