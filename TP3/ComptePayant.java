public class ComptePayant extends Compte{
    private static int cmpIndex = 0;
    public String code;
    private final double TAUX_OPERTAION = 5;

    ComptePayant(Agence ag, Client clt, double sold) {
        super(ag, clt, sold);
        code = getClass().getName() + ":" + this.newCompteIndex();
    }

    @Override
    public String toString() {
        return "Compte{\n" +
                "code='" + code + '\'' + '\n' +
                "- solde=" + solde + '\n' +
                "- TAUX_OPERTAION=" + TAUX_OPERTAION + '\n' +
        '}';
    }

    @Override
    public void deposer(double amout) {
        super.deposer(amout);
        solde -= TAUX_OPERTAION;
    }

    @Override
    public void retirer(double amount) {
        super.retirer(amount);
        solde -= TAUX_OPERTAION;
    }

    private String newCompteIndex(){
        cmpIndex += 1;
        return String.valueOf(cmpIndex);
    }
}
