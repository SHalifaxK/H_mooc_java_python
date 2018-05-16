
public class Main {

    public static void main(String[] args) {
        // Testaa sanakirjaa täällä
        UseanKaannoksenSanakirja sanakirja = new UseanKaannoksenSanakirja();
        sanakirja.lisaa("kuusi", "six");
        sanakirja.lisaa("kuusi", "spruce");

        sanakirja.lisaa("pii", "silicon");
        sanakirja.lisaa("pii", "pi");
        sanakirja.tulosta();
        System.out.println("");
        System.out.println(sanakirja.kaanna("apina"));
        sanakirja.poista("pii");
        System.out.println(sanakirja.kaanna("pii"));
    }
}
