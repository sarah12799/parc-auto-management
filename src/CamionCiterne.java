public class CamionCiterne extends Camion {

    

    public CamionCiterne(String immatriculation){
        super(immatriculation,3,10);
    }
    public int calculerVitesseMaximale(){
        if (charge<4){
            return 120;
            }
        else
            return 90;
        }

}
