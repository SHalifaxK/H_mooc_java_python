/*
Tee ohjelma, joka tulostaa kokonaisluvut väliltä 100–1.

Ohjelman tulostus on seuraava:

100
99
98
(välissä paljon rivejä)
3
2
1
*/
public class SadastaYhteen {

    public static void main(String[] args) {
        int i = 100;
        while (i>0){
            System.out.println(i);
            i--;
        }
    }
}
