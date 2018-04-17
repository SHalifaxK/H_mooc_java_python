
public class VahenevaLaskuri {

    private int arvo;  // oliomuuttuja joka muistaa laskurin arvon
    private int arvoalussa;
    
    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
        this.arvoalussa = arvoAlussa;
    }

    public void tulostaArvo() {
        // älä koske tässä olevaan koodiin!
        System.out.println("arvo: " + this.arvo);
    }
    public void nollaa(){
        this.arvo = 0;
    }
    public void vahene() {
        
        if (this.arvo<=0){
            this.arvo = 0;
        }else{
            this.arvo = this.arvo -1;
        }
    
    }    
    public void palautaAlkuarvo(){ 
        System.out.println("arvo: "+this.arvoalussa);
    }

    // ja tänne muut metodit
}
