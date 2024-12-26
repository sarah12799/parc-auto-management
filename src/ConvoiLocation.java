import java.util.ArrayList;
import java.util.List;

public class ConvoiLocation {
    private List<VehiculeLouable> vehicules;

public ConvoiLocation() {
    this.vehicules = new ArrayList<>();
    }

public void ajouterVehicule(VehiculeLouable vehicule) {
    vehicules.add(vehicule);
    }

public double calculerCoutLocation(int distance) {
    int coutTotal = 0;
    for (VehiculeLouable vehicule : vehicules) {
        coutTotal += vehicule.facturer(distance);
    }
    return coutTotal;
    }

public VehiculeLouable getVéhiculePlusLent() {
    VehiculeLouable plusLent = null;
    int vitesseMax = 0;
    for (VehiculeLouable vehicule : vehicules) {
        int vitesse = vehicule.calculerVitesseMaximale();
        if (vitesse > vitesseMax) {
            vitesseMax = vitesse;
            plusLent = vehicule;
        }
    }
    return plusLent;
    }
}
    

