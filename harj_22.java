/*
Tee ohjelma, joka ilmoittaa kurssiarvosanan seuraavan taulukon mukaisesti.
pistemäärä 	arvosana
< 0             mahdotonta!
0-69            hylätty
70-75           1
76-80   	2
81-85   	3
86-90   	4
91-100   	5
> 100 	uskomatonta!

Esimerkkitulostuksia:
Anna pisteet [0-100]: 37
Arvosana: hylätty

Anna pisteet [0-100]: 7
Arvosana: 2

Anna pisteet [0-100]: 95
Arvosana: 5

Anna pisteet [0-100]: -3
Arvosana: mahdotonta!
*/
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna pisteet [0-100]: ");
        int pisteet = Integer.parseInt(lukija.nextLine());
        
        if (pisteet<0){
            System.out.println("Arvosana: mahdotonta!");
        }else if (pisteet<70){
            System.out.println("Arvosana: hylätty");
        }else if (pisteet<76){
            System.out.println("Arvosana: 1");
        }else if (pisteet<81){
            System.out.println("Arvosana: 2");
        }else if (pisteet<86){
            System.out.println("Arvosana: 3");
        }else if (pisteet<91){
            System.out.println("Arvosana: 4");
        }else if (pisteet<101){
            System.out.println("Arvosana: 5");
        }else if (pisteet>100){
            System.out.println("Arvosana: uskomatonta!");
        }
    }
}




