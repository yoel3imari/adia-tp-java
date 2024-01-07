public class Compte {
    private static int cmpIndex = 0;
    private String code;
    protected double solde;
    protected Agence lAgence;
    protected Client proprietaire;

    Compte(Agence ag, Client prop, double sld) {
        code = getClass().getName() + ":" + this.newCompteIndex();
        lAgence = ag;
        proprietaire = prop;
        solde = sld;
    }

    @Override
    public String toString() {
        return "Compte{\n" +
                "- code='" + code + '\'' + '\n' +
                "- solde=" + solde + '\n' +
                '}';
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void deposer (double amoutn){
        this.solde += amoutn;
    }

    public void retirer(double amount) {
        this.solde -= amount;
    }

    private String newCompteIndex(){
        Compte.cmpIndex += 1;
        return String.valueOf(cmpIndex);
    }
}
