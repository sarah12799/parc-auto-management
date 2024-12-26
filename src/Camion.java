//classe qui represente les vehicules capables de transporter une charge
public abstract class Camion extends Vehicule {
    protected int charge;
    protected int chargeMax;

    public Camion(String immatriculation,int poidsVide,int chargeMax){
        super(immatriculation,poidsVide);
        this.chargeMax=chargeMax;
    }
    
   
    public int getCharge(){
        return charge;
    }

    public int getChargeMax(){
        return chargeMax;
    }

    public void setCharge(int charge){
        this.charge=charge;
    }

    protected void charger(int poids){
        if(poids<=chargeMax){
            setCharge(poids);
        }
        else
            setCharge(0);
    }
          
}
