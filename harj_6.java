/*
Tee ohjelma, joka tulostaa parilliset kokonaisluvut väliltä 2–100.

2
4
6
(välissä paljon rivejä)
96
98
100
*/
public class ParillisetLuvut {

    public static void main(String[] args) {
        int i = 2;
        while (i<102){
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
