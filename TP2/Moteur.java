public class Moteur {
    private String nom;
    private int puissance;
    private  Voiture voiture;

    Moteur (int p) {
        this.puissance = p;
    }

    Moteur(int p, Voiture v) {
        this(p);
        this.voiture = v;
    }

    Moteur(Voiture v) {
        this.voiture = v;
        this.voiture.setMoteur(this);
    }

    Moteur(Moteur copy){
        nom = copy.nom;
        puissance = copy.puissance;
        voiture = copy.voiture;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public int getPuissance() {
        return puissance;
    }

    public String getNom() {
        return nom;
    }

    public Voiture getVoiture() {
        return voiture;
    }
}
