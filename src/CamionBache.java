public class CamionBache extends Camion {
    

    public CamionBache(String immatriculation){
        super(immatriculation,4,20);
    }

   
   
    public int calculerVitesseMaximale(){
        if (charge<3){
            return 110;}
        else
            return 80;
        }
    
            
    public int getChargeMax(){
        return chargeMax;
    }


    
}
