/*
Tee ohjelma, joka kysyy käyttäjältä kaksi sanaa. Tämän jälkeen ohjelma 
kertoo onko toinen sana ensimmäisen sanan osana. Käytä ohjelmassa merkkijonon 
metodia indexOf.

Anna 1. sana: suppilovahvero
Anna 2. sana: ilo
Sana 'ilo' on sanan 'suppilovahvero' osana.

Anna 1. sana: suppilovahvero
Anna 2. sana: suru
Sana 'suru' ei ole sanan 'suppilovahvero' osana.
*/
import java.util.Scanner;

public class SanaSanassa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna 1. sana: ");
        String sana1 = lukija.nextLine();
        System.out.println("Anna 2. sana: ");
        String sana2 = lukija.nextLine();
        int osana = sana1.indexOf(sana2);
        if (osana==-1){
            System.out.println("Sana '"+sana2+"' ei ole sanan '"+sana1+"' osana");
        }else{
            System.out.println("Sana '"+sana2+"' on sanan '"+sana1+"' osana");
        }
    }
}
