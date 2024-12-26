public abstract class Vehicule{
    protected String immatriculation;
    protected final int poidsVide ;
    
    
    abstract int calculerVitesseMaximale();

    public Vehicule(String immatriculation,int poidsVide){
        this.immatriculation=immatriculation;
        this.poidsVide=poidsVide;
        
    }
    

    public String getImmatriculation(){
        return immatriculation;
    }

    public int getPoidsVide(){
        return poidsVide;
    }

    
}