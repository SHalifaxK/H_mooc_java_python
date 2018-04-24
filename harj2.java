
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> rivit = new ArrayList<>();

        // luodaan lukija tiedoston lukemista varten
        try (Scanner lukija = new Scanner(new File("tiedosto.txt"))) {

        // luetaan kaikki tiedoston rivit
        while (lukija.hasNextLine()) {
            rivit.add(lukija.nextLine());
        }
        } catch (Exception e) {
        System.out.println("Virhe: " + e.getMessage());
        }
        System.out.println(rivit);
    }
}
