
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double number1 = Double.valueOf(scanner.nextLine());
        double number2 = Double.valueOf(scanner.nextLine());
        if (number1>number2) {
            System.out.println(number1 + " is greater than " + number2);
        } else if (number1<number2){
            System.out.println(number1 + " is smaller than " + number2);
        } else {
            System.out.println(number1 + " is equal to " + number2);
        }

    }
}
