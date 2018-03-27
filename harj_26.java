
import java.util.Scanner;
/*
Tee ohjelma, joka kysyy käyttäjän iän ja tarkistaa, että se on mahdollinen 
(ainakin 0 ja korkeintaan 120).

Kuinka vanha olet? 10
OK

Kuinka vanha olet? 55
OK

Kuinka vanha olet? -3
Mahdotonta!

Kuinka vanha olet? 150
Mahdotonta!
*/
public class IanTarkistus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Kuinka vanha olet? ");
        int ika = Integer.parseInt(lukija.nextLine());
        if (120<ika || ika<0){
            System.out.println("Mahdotonta!");
        }else{
            System.out.println("OK");
        }
    }
}
