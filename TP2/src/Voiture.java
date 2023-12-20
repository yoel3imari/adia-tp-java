import java.security.PublicKey;
import java.util.ArrayList;

public class Voiture {
    private String modele;
    private String marque;
    private double vitesse;
    private boolean estDemarre;

    private Moteur moteur;

    private ArrayList<Roue> les4Roues = new ArrayList<>();
    private Roue roueDeSecours;


   public Voiture(int puissance) {
       this.moteur = new Moteur(puissance, this);
       for (int i = 0; i < 4; i++) {
           Roue roue = new Roue();
           les4Roues.add(roue);
       };
   }

    @Override
    public String toString() {
        return "Voiture: marque-" + getMarque() + " model-" + getModele() + " puissance-" + getMoteur().getPuissance();
    }

    public int deQuellePuissance() {
        return moteur.getPuissance();
    }

    /**
     * on utilise le constructeur du moteur pour créer un nouveau moteur et éviter
     * le cas où plusieures voitures ont le même moteur
     * puis on passe cette voiture au nouveau moteur
     *
     * @param neuf
     */
    public void changerLeMoteur(Moteur neuf) {
       moteur = new Moteur(neuf);
       moteur.setVoiture(this);
   }

    public void demarre (){ setEstDemarre(true); }

    /**
     * on accelère par un coefficient et on utilise setVitesse pour mettre
     * à jour la vitesse du voiture
     *
     * @param coef
     */
    public void accelere (double coef) {
       double tmp = vitesse + (vitesse*coef)/100;
       setVitesse(tmp);
   }

    /** SETTERS **/

    public void setEstDemarre(boolean estDemarre) {
        this.estDemarre = estDemarre;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    public void setLes4Roues(ArrayList<Roue> les4Roues) {
        this.les4Roues = les4Roues;
    }

    public void setRoueDeSecours(Roue roueDeSecours) {
        this.roueDeSecours = roueDeSecours;
    }

    /** GETTERS **/

    public double getVitesse() {
        return vitesse;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public ArrayList<Roue> getLes4Roues() {return les4Roues;}

    public Roue getRoueDeSecours() {
        return roueDeSecours;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public boolean getEstDemarre () {
        return estDemarre;
    }
}

