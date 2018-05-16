import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kantomaa
 */
public class UseanKaannoksenSanakirja {
    
    private HashMap<String, ArrayList<String>> sanat;
    
    public UseanKaannoksenSanakirja(){
        this.sanat = new HashMap<>();
    }
    
    public void lisaa(String sana, String kaannos){
        this.sanat.putIfAbsent(sana, new ArrayList<>());
        this.sanat.get(sana).add(kaannos);
    }
    public void tulosta(){
        this.sanat.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() +" "+ entry.getValue()));
    }
    //palauttaa listan, joka sisältää sanojen käännökset. Jos sanalle ei ole yhtäkään käännöstä, metodin tulee palauttaa tyhjä lista.
    public ArrayList<String> kaanna(String sana){
        if (this.sanat.containsKey(sana)){
            return this.sanat.get(sana);
        }
        ArrayList<String> emptyList = new ArrayList<>();
        return emptyList;
    } 
    //poistaa sanan ja sen kaikki käännökset sanakirjasta.
    public void poista(String sana){
        if (this.sanat.containsKey(sana)){
            this.sanat.remove(sana);
        }
    }
}
