public class Main {
    public static void main(String[] args) throws Exception {
       
        
        ConvoiLocation convoi = new ConvoiLocation(); // ensemble de vehicules loués
        
        PetitBus bus1 = new PetitBus("XXXXXX",25);//creation d'un objet petitbus
        PetitBus bus2 = new PetitBus("AAAAAA",30);
        CamionCiterne citerne = new CamionCiterne("YYYYYY");//objet camionciterne        
        convoi.ajouterVehicule(bus1);// ajouter le petitbus au convoi
        convoi.ajouterVehicule(bus2);
        CamionBache bache = new CamionBache("ZZZZZZ");
        
        bache.charger(2);
        afficherCamion(citerne);
        afficherCamion(bache);
        afficherPetitBus(bus1);
        System.out.println("le cout de la location : "+convoi.calculerCoutLocation(30)+"dinars");}

        private static void afficherCamion(Camion c) {
            System.out.println("immatriculation : " + c.getImmatriculation());
            System.out.println("le poids à vide est : "+ c.getPoidsVide());
            System.out.println("la charge : "+c.getCharge());
            System.out.println("la charge maximale : "+c.getChargeMax());
            System.out.println("la vitesse maximale: "+c.calculerVitesseMaximale()+"km/h");

        }
        private static void afficherPetitBus(PetitBus b) {
            System.out.println("immatriculation : "+b.getImmatriculation());
            System.out.println("le poids à vide est : "+b.getPoidsVide());
            System.out.println("le nombre de places du petit bus " + b.getNbrPlaces() + " places");
            System.out.println("la vitesse maximale: "+b.calculerVitesseMaximale()+"km/h"); 
        
        }
       
        
    
}
