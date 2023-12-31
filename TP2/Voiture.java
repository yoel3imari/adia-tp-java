import java.security.PublicKey;
import java.util.ArrayList;

public class Voiture {
    private String modele;
    private String marque;
    private double vitesse;
    private boolean estDemarre;
    private Moteur moteur;
    private Roue[] les4Roues = new Roue[4];
    private Roue roueDeSecours;


   public Voiture(int puissance) {
       this.vitesse = 0;
       this.estDemarre = false;
       this.moteur = new Moteur(puissance, this);
       for (int i = 0; i < 4; i++) {
           les4Roues[i] = new Roue();
       };
   }

   public Voiture (String modele, String marque, Double vitesse, Moteur moteur, Roue[] roues, Roue secours) {
       this.estDemarre = true;

       this.modele = modele;
       this.marque = marque;
       this.vitesse = vitesse;

       this.moteur = moteur;
       les4Roues = roues;
       roueDeSecours = secours;
   }

    public Voiture() {
        this.vitesse = 0;
        this.estDemarre = false;
        this.moteur = new Moteur(0, this);
        for (int i = 0; i < 4; i++) {
            les4Roues[i] = new Roue();
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
     * le cas d'avoir plusieur moteur pour la même voiture
     * puis on passe cette voiture au nouveau moteur
     *
     * @param neuf
     */
    public void changerLeMoteur(Moteur neuf) {
        if( moteur.getPuissance() > 300_000 ) {
            // copier
            moteur = new Moteur(neuf);
        }
   }

    public void demarre (){ setEstDemarre(true); }

    /**
     * Si la voiture est demarré  on ajoute le coef à la vitesse actuelle
     *
     * @param coef
     */
    public void accelere (double coef) {
        if( estDemarre ) {
            setVitesse(this.vitesse + coef);
        }
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

    public void setLes4Roues(Roue[] les4Roues) {
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

    public Roue[] getLes4Roues() {return les4Roues;}

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

