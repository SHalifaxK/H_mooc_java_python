
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakke
 */
public class Puhelinmuistio {
    
    private ArrayList<Henkilo> muistio = new ArrayList<>();
    
    public void lisaa(String nimi, String numero){
        Henkilo hen = new Henkilo(nimi, numero);
        muistio.add(hen);
    }
    public void tulostaKaikki(){
        for (Henkilo h:muistio){
            System.out.println(h);
        }
    }
    public String haeNumero(String nimi){
        String numero;
        for (Henkilo h:muistio){
            if (h.getNimi().equals(nimi)){
                return h.getNumero();
            }
        }
        return "numero ei tiedossa";  
    }
}
