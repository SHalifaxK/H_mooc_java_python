
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
public class Velkakirja {
    
    
    private HashMap<String, Double> kirja = new HashMap<>();
    
    public Velkakirja(){
    }
    
    public void asetaLaina(String kenelle, double maara){
        kirja.put(kenelle, maara);
    }   
    
    public double paljonkoVelkaa(String kuka){
        if (kirja.containsKey(kuka)){
            double arvo = kirja.get(kuka);
            return arvo;
        }else {
            return 0;
        }
    }
}
