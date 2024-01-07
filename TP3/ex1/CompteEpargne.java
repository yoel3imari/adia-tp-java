public class CompteEpargne extends Compte{
    private static int cmpIndex = 0;
    public String code;
    public double taux = 6;

    CompteEpargne(Agence ag, Client clt, double sold){
        super(ag, clt, sold);
        code = getClass().getName() + ":" + this.newCompteIndex();
    }

    @Override
    public String toString() {
        return "Compte{\n" +
                "code='" + code + '\'' + '\n' +
                "- solde=" + solde + '\n' +
                "- taux = " + taux + '\n' +
                '}';
    }

    public double getTaux() {
        return taux;
    }
    public void setTaux(double taux) {
        this.taux = taux;
        calcInteret();
    }

    /*
    * mettre à jour le solde en tenant compte intérêts
    * */
    public void calcInteret() {
        solde -= solde*taux;
    }
    private String newCompteIndex(){
        cmpIndex += 1;
        return String.valueOf(cmpIndex);
    }

}
