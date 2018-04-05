
/*
Toteuta ohjelma varaston hallinnointiin. Varaston hallinta 
tarjoaa käyttäjälle neljä komentoa: lisaa, poista, hae ja lopeta. 
Jos käyttäjä syöttää merkkijonon "lopeta", tulee varastonhallintaohjelman 
suorituksen päättyä. Jos käyttäjä syöttää komennon "lisaa", 
"poista", tai "hae", käyttäjältä kysytään esinettä. 
Tämän jälkeen käyttäjän syöttämä esine joko lisätään varastoon, 
poistetaan varastosta tai sitä haetaan varastosta.

Alla on esimerkki ohjelman odotetusta suorituksesta.

Varastonhallinta.

Syötä komento (lisaa, poista, hae, lopeta):
lisaa
Syötä esine:
nakki

Syötä komento (lisaa, poista, hae, lopeta):
hae
Syötä esine:
nakki
Esine nakki löytyy varastosta.

Syötä komento (lisaa, poista, hae, lopeta):
poista
Syötä esine:
nakki

Syötä komento (lisaa, poista, hae, lopeta):
hae
Syötä esine:
nakki
Esinettä nakki ei löydy varastosta.

Syötä komento (lisaa, poista, hae, lopeta):
lopeta
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Varasto {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> varasto = new ArrayList<>();
        
        
        while (true){
            System.out.println("Syötä komento (lisaa, poista, hae, lopeta):");
            String komento = lukija.nextLine();
            if (komento.equals("lisaa")){
                System.out.println("Syötä esine: ");
                String esine = lukija.nextLine();
                varasto.add(esine);
            }else if (komento.equals("poista")){
                System.out.println("Syötä esine: ");
                String esine = lukija.nextLine();
                varasto.remove(esine);
            }else if (komento.equals("hae")){
                System.out.println("Syötä esine: ");
                String esine = lukija.nextLine();
                if (varasto.contains(esine)){
                    System.out.println("Esine "+esine+" löytyy varastosta");
                }else{
                    System.out.println("Esinettä "+esine+" ei löydy varastosta");
                }
            }else{
                break;       
            }
        }
    }
}
