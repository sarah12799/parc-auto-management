public  class PetitBus extends Vehicule implements VehiculeLouable{
    private int nbrPlaces ;

    public PetitBus(String immatriculation,int nbrPlaces){
        super(immatriculation,4);
        this.nbrPlaces=nbrPlaces;

    }

    public  int calculerVitesseMaximale(){
        return 150;
    }

    public double facturer(int d){
        double duree=1;
        double vitessemax=0;
        vitessemax=this.calculerVitesseMaximale();
        duree=d/vitessemax;
        return duree*200;

    }
    public int getNbrPlaces(){
        return nbrPlaces;
    }

    public void setNbrPlaces(int nbrPlaces){
        this.nbrPlaces=nbrPlaces;
    }
}